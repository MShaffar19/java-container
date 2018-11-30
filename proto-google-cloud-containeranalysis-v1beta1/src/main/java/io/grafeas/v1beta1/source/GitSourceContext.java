// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

/**
 *
 *
 * <pre>
 * A GitSourceContext denotes a particular revision in a third party Git
 * repository (e.g., GitHub).
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.source.GitSourceContext}
 */
public final class GitSourceContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.source.GitSourceContext)
    GitSourceContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GitSourceContext.newBuilder() to construct.
  private GitSourceContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GitSourceContext() {
    url_ = "";
    revisionId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GitSourceContext(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              url_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              revisionId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.source.Source
        .internal_static_grafeas_v1beta1_source_GitSourceContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.source.Source
        .internal_static_grafeas_v1beta1_source_GitSourceContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.source.GitSourceContext.class,
            io.grafeas.v1beta1.source.GitSourceContext.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   *
   *
   * <pre>
   * Git repository URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   */
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Git repository URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   */
  public com.google.protobuf.ByteString getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVISION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object revisionId_;
  /**
   *
   *
   * <pre>
   * Git commit hash.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  public java.lang.String getRevisionId() {
    java.lang.Object ref = revisionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revisionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Git commit hash.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  public com.google.protobuf.ByteString getRevisionIdBytes() {
    java.lang.Object ref = revisionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      revisionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (!getRevisionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revisionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (!getRevisionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revisionId_);
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
    if (!(obj instanceof io.grafeas.v1beta1.source.GitSourceContext)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.source.GitSourceContext other =
        (io.grafeas.v1beta1.source.GitSourceContext) obj;

    boolean result = true;
    result = result && getUrl().equals(other.getUrl());
    result = result && getRevisionId().equals(other.getRevisionId());
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + REVISION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRevisionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.source.GitSourceContext parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.grafeas.v1beta1.source.GitSourceContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A GitSourceContext denotes a particular revision in a third party Git
   * repository (e.g., GitHub).
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.source.GitSourceContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.source.GitSourceContext)
      io.grafeas.v1beta1.source.GitSourceContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_GitSourceContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_GitSourceContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.source.GitSourceContext.class,
              io.grafeas.v1beta1.source.GitSourceContext.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.source.GitSourceContext.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      url_ = "";

      revisionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.source.Source
          .internal_static_grafeas_v1beta1_source_GitSourceContext_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.GitSourceContext getDefaultInstanceForType() {
      return io.grafeas.v1beta1.source.GitSourceContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.GitSourceContext build() {
      io.grafeas.v1beta1.source.GitSourceContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.source.GitSourceContext buildPartial() {
      io.grafeas.v1beta1.source.GitSourceContext result =
          new io.grafeas.v1beta1.source.GitSourceContext(this);
      result.url_ = url_;
      result.revisionId_ = revisionId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.source.GitSourceContext) {
        return mergeFrom((io.grafeas.v1beta1.source.GitSourceContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.source.GitSourceContext other) {
      if (other == io.grafeas.v1beta1.source.GitSourceContext.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (!other.getRevisionId().isEmpty()) {
        revisionId_ = other.revisionId_;
        onChanged();
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
      io.grafeas.v1beta1.source.GitSourceContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.source.GitSourceContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     *
     *
     * <pre>
     * Git repository URL.
     * </pre>
     *
     * <code>string url = 1;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Git repository URL.
     * </pre>
     *
     * <code>string url = 1;</code>
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Git repository URL.
     * </pre>
     *
     * <code>string url = 1;</code>
     */
    public Builder setUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      url_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Git repository URL.
     * </pre>
     *
     * <code>string url = 1;</code>
     */
    public Builder clearUrl() {

      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Git repository URL.
     * </pre>
     *
     * <code>string url = 1;</code>
     */
    public Builder setUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object revisionId_ = "";
    /**
     *
     *
     * <pre>
     * Git commit hash.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public java.lang.String getRevisionId() {
      java.lang.Object ref = revisionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revisionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Git commit hash.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public com.google.protobuf.ByteString getRevisionIdBytes() {
      java.lang.Object ref = revisionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        revisionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Git commit hash.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder setRevisionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      revisionId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Git commit hash.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder clearRevisionId() {

      revisionId_ = getDefaultInstance().getRevisionId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Git commit hash.
     * </pre>
     *
     * <code>string revision_id = 2;</code>
     */
    public Builder setRevisionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      revisionId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.source.GitSourceContext)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.source.GitSourceContext)
  private static final io.grafeas.v1beta1.source.GitSourceContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.source.GitSourceContext();
  }

  public static io.grafeas.v1beta1.source.GitSourceContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GitSourceContext> PARSER =
      new com.google.protobuf.AbstractParser<GitSourceContext>() {
        @java.lang.Override
        public GitSourceContext parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GitSourceContext(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GitSourceContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GitSourceContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.source.GitSourceContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
