// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: equip.proto

package proto;

public final class Equip {
  private Equip() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PBEquipEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.PBEquipEntity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 entity_id = 1;</code>
     */
    long getEntityId();

    /**
     * <code>optional int32 conf_id = 2;</code>
     */
    int getConfId();

    /**
     * <code>optional int32 level = 3;</code>
     */
    int getLevel();

    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */
    int getAtttsCount();
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */
    boolean containsAttts(
        int key);
    /**
     * Use {@link #getAtttsMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAttts();
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAtttsMap();
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */

    int getAtttsOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */

    int getAtttsOrThrow(
        int key);
  }
  /**
   * <pre>
   *这个位置需要属性吗， 假如装备可以洗练， 还是加上去
   * </pre>
   *
   * Protobuf type {@code proto.PBEquipEntity}
   */
  public  static final class PBEquipEntity extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.PBEquipEntity)
      PBEquipEntityOrBuilder {
    // Use PBEquipEntity.newBuilder() to construct.
    private PBEquipEntity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PBEquipEntity() {
      entityId_ = 0L;
      confId_ = 0;
      level_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private PBEquipEntity(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              entityId_ = input.readInt64();
              break;
            }
            case 16: {

              confId_ = input.readInt32();
              break;
            }
            case 24: {

              level_ = input.readInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                attts_ = com.google.protobuf.MapField.newMapField(
                    AtttsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000008;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              attts__ = input.readMessage(
                  AtttsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              attts_.getMutableMap().put(
                  attts__.getKey(), attts__.getValue());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Equip.internal_static_proto_PBEquipEntity_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetAttts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Equip.internal_static_proto_PBEquipEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Equip.PBEquipEntity.class, proto.Equip.PBEquipEntity.Builder.class);
    }

    private int bitField0_;
    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private long entityId_;
    /**
     * <code>optional int64 entity_id = 1;</code>
     */
    public long getEntityId() {
      return entityId_;
    }

    public static final int CONF_ID_FIELD_NUMBER = 2;
    private int confId_;
    /**
     * <code>optional int32 conf_id = 2;</code>
     */
    public int getConfId() {
      return confId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;
    /**
     * <code>optional int32 level = 3;</code>
     */
    public int getLevel() {
      return level_;
    }

    public static final int ATTTS_FIELD_NUMBER = 4;
    private static final class AtttsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  proto.Equip.internal_static_proto_PBEquipEntity_AtttsEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> attts_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetAttts() {
      if (attts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AtttsDefaultEntryHolder.defaultEntry);
      }
      return attts_;
    }

    public int getAtttsCount() {
      return internalGetAttts().getMap().size();
    }
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */

    public boolean containsAttts(
        int key) {
      
      return internalGetAttts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAtttsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAttts() {
      return getAtttsMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.Integer> getAtttsMap() {
      return internalGetAttts().getMap();
    }
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */

    public int getAtttsOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAttts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, int32&gt; attts = 4;</code>
     */

    public int getAtttsOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAttts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (entityId_ != 0L) {
        output.writeInt64(1, entityId_);
      }
      if (confId_ != 0) {
        output.writeInt32(2, confId_);
      }
      if (level_ != 0) {
        output.writeInt32(3, level_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAttts(),
          AtttsDefaultEntryHolder.defaultEntry,
          4);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, entityId_);
      }
      if (confId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, confId_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, level_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetAttts().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        attts__ = AtttsDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, attts__);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof proto.Equip.PBEquipEntity)) {
        return super.equals(obj);
      }
      proto.Equip.PBEquipEntity other = (proto.Equip.PBEquipEntity) obj;

      boolean result = true;
      result = result && (getEntityId()
          == other.getEntityId());
      result = result && (getConfId()
          == other.getConfId());
      result = result && (getLevel()
          == other.getLevel());
      result = result && internalGetAttts().equals(
          other.internalGetAttts());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEntityId());
      hash = (37 * hash) + CONF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfId();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      if (!internalGetAttts().getMap().isEmpty()) {
        hash = (37 * hash) + ATTTS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAttts().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proto.Equip.PBEquipEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.Equip.PBEquipEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.Equip.PBEquipEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.Equip.PBEquipEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.Equip.PBEquipEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.Equip.PBEquipEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.Equip.PBEquipEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proto.Equip.PBEquipEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.Equip.PBEquipEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.Equip.PBEquipEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(proto.Equip.PBEquipEntity prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *这个位置需要属性吗， 假如装备可以洗练， 还是加上去
     * </pre>
     *
     * Protobuf type {@code proto.PBEquipEntity}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PBEquipEntity)
        proto.Equip.PBEquipEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.Equip.internal_static_proto_PBEquipEntity_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetAttts();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableAttts();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.Equip.internal_static_proto_PBEquipEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.Equip.PBEquipEntity.class, proto.Equip.PBEquipEntity.Builder.class);
      }

      // Construct using proto.Equip.PBEquipEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        entityId_ = 0L;

        confId_ = 0;

        level_ = 0;

        internalGetMutableAttts().clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.Equip.internal_static_proto_PBEquipEntity_descriptor;
      }

      public proto.Equip.PBEquipEntity getDefaultInstanceForType() {
        return proto.Equip.PBEquipEntity.getDefaultInstance();
      }

      public proto.Equip.PBEquipEntity build() {
        proto.Equip.PBEquipEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public proto.Equip.PBEquipEntity buildPartial() {
        proto.Equip.PBEquipEntity result = new proto.Equip.PBEquipEntity(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.entityId_ = entityId_;
        result.confId_ = confId_;
        result.level_ = level_;
        result.attts_ = internalGetAttts();
        result.attts_.makeImmutable();
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.Equip.PBEquipEntity) {
          return mergeFrom((proto.Equip.PBEquipEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.Equip.PBEquipEntity other) {
        if (other == proto.Equip.PBEquipEntity.getDefaultInstance()) return this;
        if (other.getEntityId() != 0L) {
          setEntityId(other.getEntityId());
        }
        if (other.getConfId() != 0) {
          setConfId(other.getConfId());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        internalGetMutableAttts().mergeFrom(
            other.internalGetAttts());
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proto.Equip.PBEquipEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.Equip.PBEquipEntity) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long entityId_ ;
      /**
       * <code>optional int64 entity_id = 1;</code>
       */
      public long getEntityId() {
        return entityId_;
      }
      /**
       * <code>optional int64 entity_id = 1;</code>
       */
      public Builder setEntityId(long value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 entity_id = 1;</code>
       */
      public Builder clearEntityId() {
        
        entityId_ = 0L;
        onChanged();
        return this;
      }

      private int confId_ ;
      /**
       * <code>optional int32 conf_id = 2;</code>
       */
      public int getConfId() {
        return confId_;
      }
      /**
       * <code>optional int32 conf_id = 2;</code>
       */
      public Builder setConfId(int value) {
        
        confId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 conf_id = 2;</code>
       */
      public Builder clearConfId() {
        
        confId_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>optional int32 level = 3;</code>
       */
      public int getLevel() {
        return level_;
      }
      /**
       * <code>optional int32 level = 3;</code>
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 level = 3;</code>
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> attts_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetAttts() {
        if (attts_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AtttsDefaultEntryHolder.defaultEntry);
        }
        return attts_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableAttts() {
        onChanged();;
        if (attts_ == null) {
          attts_ = com.google.protobuf.MapField.newMapField(
              AtttsDefaultEntryHolder.defaultEntry);
        }
        if (!attts_.isMutable()) {
          attts_ = attts_.copy();
        }
        return attts_;
      }

      public int getAtttsCount() {
        return internalGetAttts().getMap().size();
      }
      /**
       * <code>map&lt;int32, int32&gt; attts = 4;</code>
       */

      public boolean containsAttts(
          int key) {
        
        return internalGetAttts().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAtttsMap()} instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getAttts() {
        return getAtttsMap();
      }
      /**
       * <code>map&lt;int32, int32&gt; attts = 4;</code>
       */

      public java.util.Map<java.lang.Integer, java.lang.Integer> getAtttsMap() {
        return internalGetAttts().getMap();
      }
      /**
       * <code>map&lt;int32, int32&gt; attts = 4;</code>
       */

      public int getAtttsOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAttts().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;int32, int32&gt; attts = 4;</code>
       */

      public int getAtttsOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAttts().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAttts() {
        getMutableAttts().clear();
        return this;
      }
      /**
       * <code>map&lt;int32, int32&gt; attts = 4;</code>
       */

      public Builder removeAttts(
          int key) {
        
        getMutableAttts().remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableAttts() {
        return internalGetMutableAttts().getMutableMap();
      }
      /**
       * <code>map&lt;int32, int32&gt; attts = 4;</code>
       */
      public Builder putAttts(
          int key,
          int value) {
        
        
        getMutableAttts().put(key, value);
        return this;
      }
      /**
       * <code>map&lt;int32, int32&gt; attts = 4;</code>
       */

      public Builder putAllAttts(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        getMutableAttts().putAll(values);
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:proto.PBEquipEntity)
    }

    // @@protoc_insertion_point(class_scope:proto.PBEquipEntity)
    private static final proto.Equip.PBEquipEntity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proto.Equip.PBEquipEntity();
    }

    public static proto.Equip.PBEquipEntity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PBEquipEntity>
        PARSER = new com.google.protobuf.AbstractParser<PBEquipEntity>() {
      public PBEquipEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new PBEquipEntity(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PBEquipEntity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PBEquipEntity> getParserForType() {
      return PARSER;
    }

    public proto.Equip.PBEquipEntity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PBEquipEntity_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PBEquipEntity_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PBEquipEntity_AtttsEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PBEquipEntity_AtttsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013equip.proto\022\005proto\"\240\001\n\rPBEquipEntity\022\021" +
      "\n\tentity_id\030\001 \001(\003\022\017\n\007conf_id\030\002 \001(\005\022\r\n\005le" +
      "vel\030\003 \001(\005\022.\n\005attts\030\004 \003(\0132\037.proto.PBEquip" +
      "Entity.AtttsEntry\032,\n\nAtttsEntry\022\013\n\003key\030\001" +
      " \001(\005\022\r\n\005value\030\002 \001(\005:\0028\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_PBEquipEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PBEquipEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PBEquipEntity_descriptor,
        new java.lang.String[] { "EntityId", "ConfId", "Level", "Attts", });
    internal_static_proto_PBEquipEntity_AtttsEntry_descriptor =
      internal_static_proto_PBEquipEntity_descriptor.getNestedTypes().get(0);
    internal_static_proto_PBEquipEntity_AtttsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PBEquipEntity_AtttsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}