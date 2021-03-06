package service.handler.network;

import com.google.protobuf.InvalidProtocolBufferException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleStateEvent;
import network.AbstractHandlers;
import network.handler.ServerHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import packet.CocoPacket;
import proto.Login;
import proto.creator.CommonCreator;
import proto.creator.PacketCreator;
import protocol.c2s.RequestCode;
import service.GateApp;
import service.handler.agent.AgentManager;
import service.handler.agent.CocoAgent;
import util.NettyUtil;

/**
 * Created by Administrator on 2017/2/7.
 */
public class GateNetHandler extends ServerHandler implements ChannelFutureListener {
	private static Logger logger = LoggerFactory.getLogger(GateNetHandler.class);

	public GateNetHandler(AbstractHandlers handlers) {
		super(handlers);
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		super.channelActive(ctx);
	}

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		if (evt instanceof IdleStateEvent) {
//			CocoAgent agent = NettyUtil.getAttribute(ctx, "agent");
//			if (agent != null) {
//				GateApp.getInst().getClient().sendRequest(new CocoPacket(RequestCode.CENTER_PLAYER_LOGOUT, CommonCreator.createPBString(agent.getSessionId()), agent.getPlayerId()));
//			}
			//不要发送两次退出，这个关闭会调用下面的关闭事件
			ctx.channel().close();
			//超时提出玩家
		}
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		CocoAgent agent = NettyUtil.getAttribute(ctx, "agent");
		if (agent != null) {
			AgentManager.getInst().removeAgent(agent.getPlayerId());
		}
		ctx.channel().close();
	}

	@Override
	public void operationComplete(ChannelFuture future) throws Exception {
		if (!future.isSuccess()) {
			CocoAgent agent = NettyUtil.getAttribute(future, "agent");
			if (agent != null) {
				AgentManager.getInst().removeAgent(agent.getPlayerId());
				future.channel().close();
			}
		}
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		if (msg instanceof CocoPacket == false) {
			logger.warn(" the packet is not instance of coco packet ");
			return;
		}
		CocoPacket packet = (CocoPacket) msg;
		if (RequestCode.RESPONSE_TO_CLIIENT_CODE != packet.getReqCode()) {
			logger.debug(" the packet req id is {}", packet.getReqCode());
		}

		if (isRequestMessage(packet)) {
			RequestCode req = packet.getReqCode();
			logger.info("the req code is {}", req);
			if (req == RequestCode.ACCOUNT_LOGIN) {
				GateApp.getInst().getClient().sendRequest(packet);
				Login.PBLoginReq request = Login.PBLoginReq.parseFrom(packet.getBytes());
				CocoAgent agent = new CocoAgent(0, ctx, request.getUserId());
				AgentManager.getInst().registerUserAgent(agent);
				NettyUtil.setAttribute(ctx, "agent", agent);
			} else {
				//当前session属于哪个角色,只有登陆验证之后的游戏包才会发送到center
				CocoAgent curAgent = NettyUtil.getAttribute(ctx, "agent");
				if (curAgent != null) {
					if (!curAgent.isValid()) {
						logger.error(" invalid user and id is {}", curAgent.getUserId());
						return;
					}
					packet.setPlayerId(curAgent.getPlayerId());
					handlers.handPacket(ctx, (CocoPacket) msg);
				}
			}
		}                    // gate不需要客户端的response

	}
}
