package server.handler.action;

import client.LoginClient;
import com.google.protobuf.MessageLite;
import database.DBUtil;
import database.DbObject;
import proto.Server;
import server.LoginServer;

import java.util.List;

/**
 * Created by WZ on 2016/9/1 0001.
 */
public class LoginPasswordAction extends IMessageAction {

	@Override
	public boolean valid(MessageLite message) {
		return message instanceof Server.AccountLogin;
	}

	@Override
	public void handlerMessage(LoginClient client, MessageLite message) {
		Server.AccountLogin request = (Server.AccountLogin) message;
		String userName = request.getUsername();
		String password = request.getPassword();
		DbObject obj = new DbObject();
		obj.put("username", userName);
		List<DbObject> result = DBUtil.executeQuery("accounts", obj);
		if (result.size() == 0) {
			DbObject data = new DbObject();
			data.put("username", userName);
			data.put("password", password);
			DBUtil.executeInsert("accounts", data);
		}
		client.setUserName(userName);
		client.setPassword(password);
		onLoginSuccess(client);
	}

	private void onLoginSuccess(LoginClient client) {

	}
}
