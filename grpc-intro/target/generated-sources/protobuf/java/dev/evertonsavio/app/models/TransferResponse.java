// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer-service.proto

package dev.evertonsavio.app.models;

/**
 * Protobuf type {@code TransferResponse}
 */
public  final class TransferResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TransferResponse)
    TransferResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferResponse.newBuilder() to construct.
  private TransferResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferResponse() {
    status_ = 0;
    accounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransferResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              accounts_ = new java.util.ArrayList<dev.evertonsavio.app.models.Account>();
              mutable_bitField0_ |= 0x00000002;
            }
            accounts_.add(
                input.readMessage(dev.evertonsavio.app.models.Account.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        accounts_ = java.util.Collections.unmodifiableList(accounts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dev.evertonsavio.app.models.TransferServiceOuterClass.internal_static_TransferResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dev.evertonsavio.app.models.TransferServiceOuterClass.internal_static_TransferResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dev.evertonsavio.app.models.TransferResponse.class, dev.evertonsavio.app.models.TransferResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.TransferStatus status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.TransferStatus status = 1;</code>
   */
  public dev.evertonsavio.app.models.TransferStatus getStatus() {
    @SuppressWarnings("deprecation")
    dev.evertonsavio.app.models.TransferStatus result = dev.evertonsavio.app.models.TransferStatus.valueOf(status_);
    return result == null ? dev.evertonsavio.app.models.TransferStatus.UNRECOGNIZED : result;
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 2;
  private java.util.List<dev.evertonsavio.app.models.Account> accounts_;
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  public java.util.List<dev.evertonsavio.app.models.Account> getAccountsList() {
    return accounts_;
  }
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  public java.util.List<? extends dev.evertonsavio.app.models.AccountOrBuilder> 
      getAccountsOrBuilderList() {
    return accounts_;
  }
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  public dev.evertonsavio.app.models.Account getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  public dev.evertonsavio.app.models.AccountOrBuilder getAccountsOrBuilder(
      int index) {
    return accounts_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != dev.evertonsavio.app.models.TransferStatus.FAILED.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < accounts_.size(); i++) {
      output.writeMessage(2, accounts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != dev.evertonsavio.app.models.TransferStatus.FAILED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < accounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, accounts_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dev.evertonsavio.app.models.TransferResponse)) {
      return super.equals(obj);
    }
    dev.evertonsavio.app.models.TransferResponse other = (dev.evertonsavio.app.models.TransferResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    result = result && getAccountsList()
        .equals(other.getAccountsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (getAccountsCount() > 0) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dev.evertonsavio.app.models.TransferResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dev.evertonsavio.app.models.TransferResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code TransferResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TransferResponse)
      dev.evertonsavio.app.models.TransferResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dev.evertonsavio.app.models.TransferServiceOuterClass.internal_static_TransferResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dev.evertonsavio.app.models.TransferServiceOuterClass.internal_static_TransferResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dev.evertonsavio.app.models.TransferResponse.class, dev.evertonsavio.app.models.TransferResponse.Builder.class);
    }

    // Construct using dev.evertonsavio.app.models.TransferResponse.newBuilder()
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
        getAccountsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        accountsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dev.evertonsavio.app.models.TransferServiceOuterClass.internal_static_TransferResponse_descriptor;
    }

    @java.lang.Override
    public dev.evertonsavio.app.models.TransferResponse getDefaultInstanceForType() {
      return dev.evertonsavio.app.models.TransferResponse.getDefaultInstance();
    }

    @java.lang.Override
    public dev.evertonsavio.app.models.TransferResponse build() {
      dev.evertonsavio.app.models.TransferResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public dev.evertonsavio.app.models.TransferResponse buildPartial() {
      dev.evertonsavio.app.models.TransferResponse result = new dev.evertonsavio.app.models.TransferResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      if (accountsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          accounts_ = java.util.Collections.unmodifiableList(accounts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.accounts_ = accounts_;
      } else {
        result.accounts_ = accountsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dev.evertonsavio.app.models.TransferResponse) {
        return mergeFrom((dev.evertonsavio.app.models.TransferResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dev.evertonsavio.app.models.TransferResponse other) {
      if (other == dev.evertonsavio.app.models.TransferResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (accountsBuilder_ == null) {
        if (!other.accounts_.isEmpty()) {
          if (accounts_.isEmpty()) {
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAccountsIsMutable();
            accounts_.addAll(other.accounts_);
          }
          onChanged();
        }
      } else {
        if (!other.accounts_.isEmpty()) {
          if (accountsBuilder_.isEmpty()) {
            accountsBuilder_.dispose();
            accountsBuilder_ = null;
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            accountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountsFieldBuilder() : null;
          } else {
            accountsBuilder_.addAllMessages(other.accounts_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dev.evertonsavio.app.models.TransferResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dev.evertonsavio.app.models.TransferResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.TransferStatus status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.TransferStatus status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.TransferStatus status = 1;</code>
     */
    public dev.evertonsavio.app.models.TransferStatus getStatus() {
      @SuppressWarnings("deprecation")
      dev.evertonsavio.app.models.TransferStatus result = dev.evertonsavio.app.models.TransferStatus.valueOf(status_);
      return result == null ? dev.evertonsavio.app.models.TransferStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.TransferStatus status = 1;</code>
     */
    public Builder setStatus(dev.evertonsavio.app.models.TransferStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.TransferStatus status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<dev.evertonsavio.app.models.Account> accounts_ =
      java.util.Collections.emptyList();
    private void ensureAccountsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        accounts_ = new java.util.ArrayList<dev.evertonsavio.app.models.Account>(accounts_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        dev.evertonsavio.app.models.Account, dev.evertonsavio.app.models.Account.Builder, dev.evertonsavio.app.models.AccountOrBuilder> accountsBuilder_;

    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public java.util.List<dev.evertonsavio.app.models.Account> getAccountsList() {
      if (accountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accounts_);
      } else {
        return accountsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public int getAccountsCount() {
      if (accountsBuilder_ == null) {
        return accounts_.size();
      } else {
        return accountsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public dev.evertonsavio.app.models.Account getAccounts(int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);
      } else {
        return accountsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder setAccounts(
        int index, dev.evertonsavio.app.models.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.set(index, value);
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder setAccounts(
        int index, dev.evertonsavio.app.models.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder addAccounts(dev.evertonsavio.app.models.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder addAccounts(
        int index, dev.evertonsavio.app.models.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(index, value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder addAccounts(
        dev.evertonsavio.app.models.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder addAccounts(
        int index, dev.evertonsavio.app.models.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder addAllAccounts(
        java.lang.Iterable<? extends dev.evertonsavio.app.models.Account> values) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accounts_);
        onChanged();
      } else {
        accountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder clearAccounts() {
      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        accountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public Builder removeAccounts(int index) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.remove(index);
        onChanged();
      } else {
        accountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public dev.evertonsavio.app.models.Account.Builder getAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public dev.evertonsavio.app.models.AccountOrBuilder getAccountsOrBuilder(
        int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);  } else {
        return accountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public java.util.List<? extends dev.evertonsavio.app.models.AccountOrBuilder> 
         getAccountsOrBuilderList() {
      if (accountsBuilder_ != null) {
        return accountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accounts_);
      }
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public dev.evertonsavio.app.models.Account.Builder addAccountsBuilder() {
      return getAccountsFieldBuilder().addBuilder(
          dev.evertonsavio.app.models.Account.getDefaultInstance());
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public dev.evertonsavio.app.models.Account.Builder addAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().addBuilder(
          index, dev.evertonsavio.app.models.Account.getDefaultInstance());
    }
    /**
     * <code>repeated .Account accounts = 2;</code>
     */
    public java.util.List<dev.evertonsavio.app.models.Account.Builder> 
         getAccountsBuilderList() {
      return getAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        dev.evertonsavio.app.models.Account, dev.evertonsavio.app.models.Account.Builder, dev.evertonsavio.app.models.AccountOrBuilder> 
        getAccountsFieldBuilder() {
      if (accountsBuilder_ == null) {
        accountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            dev.evertonsavio.app.models.Account, dev.evertonsavio.app.models.Account.Builder, dev.evertonsavio.app.models.AccountOrBuilder>(
                accounts_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        accounts_ = null;
      }
      return accountsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TransferResponse)
  }

  // @@protoc_insertion_point(class_scope:TransferResponse)
  private static final dev.evertonsavio.app.models.TransferResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dev.evertonsavio.app.models.TransferResponse();
  }

  public static dev.evertonsavio.app.models.TransferResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferResponse>
      PARSER = new com.google.protobuf.AbstractParser<TransferResponse>() {
    @java.lang.Override
    public TransferResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransferResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransferResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public dev.evertonsavio.app.models.TransferResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

