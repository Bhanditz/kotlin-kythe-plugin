// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/xref.proto

package com.google.devtools.kythe.proto;

/**
 * Protobuf type {@code kythe.proto.Printable}
 */
public  final class Printable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kythe.proto.Printable)
    PrintableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Printable.newBuilder() to construct.
  private Printable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Printable() {
    rawText_ = "";
    link_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Printable(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            rawText_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              link_ = new java.util.ArrayList<com.google.devtools.kythe.proto.Link>();
              mutable_bitField0_ |= 0x00000002;
            }
            link_.add(
                input.readMessage(com.google.devtools.kythe.proto.Link.parser(), extensionRegistry));
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
        link_ = java.util.Collections.unmodifiableList(link_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.kythe.proto.Xref.internal_static_kythe_proto_Printable_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.kythe.proto.Xref.internal_static_kythe_proto_Printable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.kythe.proto.Printable.class, com.google.devtools.kythe.proto.Printable.Builder.class);
  }

  private int bitField0_;
  public static final int RAW_TEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object rawText_;
  /**
   * <pre>
   * Raw text that can be displayed to the user (but may also contain
   * markup that can be interpreted, like Doxygen comments). Links are
   * marked using []. &#92; is an escape character (where possible escape
   * sequences are &#92;[, &#92;], and &#92;&#92;).
   * </pre>
   *
   * <code>string raw_text = 1;</code>
   */
  public java.lang.String getRawText() {
    java.lang.Object ref = rawText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rawText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Raw text that can be displayed to the user (but may also contain
   * markup that can be interpreted, like Doxygen comments). Links are
   * marked using []. &#92; is an escape character (where possible escape
   * sequences are &#92;[, &#92;], and &#92;&#92;).
   * </pre>
   *
   * <code>string raw_text = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRawTextBytes() {
    java.lang.Object ref = rawText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rawText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINK_FIELD_NUMBER = 2;
  private java.util.List<com.google.devtools.kythe.proto.Link> link_;
  /**
   * <pre>
   * Annotations for spans in raw_text. The ith Link corresponds to the span
   * starting at the ith [.
   * </pre>
   *
   * <code>repeated .kythe.proto.common.Link link = 2;</code>
   */
  public java.util.List<com.google.devtools.kythe.proto.Link> getLinkList() {
    return link_;
  }
  /**
   * <pre>
   * Annotations for spans in raw_text. The ith Link corresponds to the span
   * starting at the ith [.
   * </pre>
   *
   * <code>repeated .kythe.proto.common.Link link = 2;</code>
   */
  public java.util.List<? extends com.google.devtools.kythe.proto.LinkOrBuilder> 
      getLinkOrBuilderList() {
    return link_;
  }
  /**
   * <pre>
   * Annotations for spans in raw_text. The ith Link corresponds to the span
   * starting at the ith [.
   * </pre>
   *
   * <code>repeated .kythe.proto.common.Link link = 2;</code>
   */
  public int getLinkCount() {
    return link_.size();
  }
  /**
   * <pre>
   * Annotations for spans in raw_text. The ith Link corresponds to the span
   * starting at the ith [.
   * </pre>
   *
   * <code>repeated .kythe.proto.common.Link link = 2;</code>
   */
  public com.google.devtools.kythe.proto.Link getLink(int index) {
    return link_.get(index);
  }
  /**
   * <pre>
   * Annotations for spans in raw_text. The ith Link corresponds to the span
   * starting at the ith [.
   * </pre>
   *
   * <code>repeated .kythe.proto.common.Link link = 2;</code>
   */
  public com.google.devtools.kythe.proto.LinkOrBuilder getLinkOrBuilder(
      int index) {
    return link_.get(index);
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
    if (!getRawTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rawText_);
    }
    for (int i = 0; i < link_.size(); i++) {
      output.writeMessage(2, link_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRawTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rawText_);
    }
    for (int i = 0; i < link_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, link_.get(i));
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
    if (!(obj instanceof com.google.devtools.kythe.proto.Printable)) {
      return super.equals(obj);
    }
    com.google.devtools.kythe.proto.Printable other = (com.google.devtools.kythe.proto.Printable) obj;

    boolean result = true;
    result = result && getRawText()
        .equals(other.getRawText());
    result = result && getLinkList()
        .equals(other.getLinkList());
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
    hash = (37 * hash) + RAW_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getRawText().hashCode();
    if (getLinkCount() > 0) {
      hash = (37 * hash) + LINK_FIELD_NUMBER;
      hash = (53 * hash) + getLinkList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.kythe.proto.Printable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Printable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.Printable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.kythe.proto.Printable parseFrom(
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
  public static Builder newBuilder(com.google.devtools.kythe.proto.Printable prototype) {
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
   * Protobuf type {@code kythe.proto.Printable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kythe.proto.Printable)
      com.google.devtools.kythe.proto.PrintableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.kythe.proto.Xref.internal_static_kythe_proto_Printable_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.kythe.proto.Xref.internal_static_kythe_proto_Printable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.kythe.proto.Printable.class, com.google.devtools.kythe.proto.Printable.Builder.class);
    }

    // Construct using com.google.devtools.kythe.proto.Printable.newBuilder()
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
        getLinkFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      rawText_ = "";

      if (linkBuilder_ == null) {
        link_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        linkBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.kythe.proto.Xref.internal_static_kythe_proto_Printable_descriptor;
    }

    public com.google.devtools.kythe.proto.Printable getDefaultInstanceForType() {
      return com.google.devtools.kythe.proto.Printable.getDefaultInstance();
    }

    public com.google.devtools.kythe.proto.Printable build() {
      com.google.devtools.kythe.proto.Printable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.devtools.kythe.proto.Printable buildPartial() {
      com.google.devtools.kythe.proto.Printable result = new com.google.devtools.kythe.proto.Printable(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.rawText_ = rawText_;
      if (linkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          link_ = java.util.Collections.unmodifiableList(link_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.link_ = link_;
      } else {
        result.link_ = linkBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.kythe.proto.Printable) {
        return mergeFrom((com.google.devtools.kythe.proto.Printable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.kythe.proto.Printable other) {
      if (other == com.google.devtools.kythe.proto.Printable.getDefaultInstance()) return this;
      if (!other.getRawText().isEmpty()) {
        rawText_ = other.rawText_;
        onChanged();
      }
      if (linkBuilder_ == null) {
        if (!other.link_.isEmpty()) {
          if (link_.isEmpty()) {
            link_ = other.link_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLinkIsMutable();
            link_.addAll(other.link_);
          }
          onChanged();
        }
      } else {
        if (!other.link_.isEmpty()) {
          if (linkBuilder_.isEmpty()) {
            linkBuilder_.dispose();
            linkBuilder_ = null;
            link_ = other.link_;
            bitField0_ = (bitField0_ & ~0x00000002);
            linkBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLinkFieldBuilder() : null;
          } else {
            linkBuilder_.addAllMessages(other.link_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.devtools.kythe.proto.Printable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.kythe.proto.Printable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object rawText_ = "";
    /**
     * <pre>
     * Raw text that can be displayed to the user (but may also contain
     * markup that can be interpreted, like Doxygen comments). Links are
     * marked using []. &#92; is an escape character (where possible escape
     * sequences are &#92;[, &#92;], and &#92;&#92;).
     * </pre>
     *
     * <code>string raw_text = 1;</code>
     */
    public java.lang.String getRawText() {
      java.lang.Object ref = rawText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rawText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Raw text that can be displayed to the user (but may also contain
     * markup that can be interpreted, like Doxygen comments). Links are
     * marked using []. &#92; is an escape character (where possible escape
     * sequences are &#92;[, &#92;], and &#92;&#92;).
     * </pre>
     *
     * <code>string raw_text = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRawTextBytes() {
      java.lang.Object ref = rawText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Raw text that can be displayed to the user (but may also contain
     * markup that can be interpreted, like Doxygen comments). Links are
     * marked using []. &#92; is an escape character (where possible escape
     * sequences are &#92;[, &#92;], and &#92;&#92;).
     * </pre>
     *
     * <code>string raw_text = 1;</code>
     */
    public Builder setRawText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rawText_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Raw text that can be displayed to the user (but may also contain
     * markup that can be interpreted, like Doxygen comments). Links are
     * marked using []. &#92; is an escape character (where possible escape
     * sequences are &#92;[, &#92;], and &#92;&#92;).
     * </pre>
     *
     * <code>string raw_text = 1;</code>
     */
    public Builder clearRawText() {
      
      rawText_ = getDefaultInstance().getRawText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Raw text that can be displayed to the user (but may also contain
     * markup that can be interpreted, like Doxygen comments). Links are
     * marked using []. &#92; is an escape character (where possible escape
     * sequences are &#92;[, &#92;], and &#92;&#92;).
     * </pre>
     *
     * <code>string raw_text = 1;</code>
     */
    public Builder setRawTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rawText_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.devtools.kythe.proto.Link> link_ =
      java.util.Collections.emptyList();
    private void ensureLinkIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        link_ = new java.util.ArrayList<com.google.devtools.kythe.proto.Link>(link_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.kythe.proto.Link, com.google.devtools.kythe.proto.Link.Builder, com.google.devtools.kythe.proto.LinkOrBuilder> linkBuilder_;

    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public java.util.List<com.google.devtools.kythe.proto.Link> getLinkList() {
      if (linkBuilder_ == null) {
        return java.util.Collections.unmodifiableList(link_);
      } else {
        return linkBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public int getLinkCount() {
      if (linkBuilder_ == null) {
        return link_.size();
      } else {
        return linkBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public com.google.devtools.kythe.proto.Link getLink(int index) {
      if (linkBuilder_ == null) {
        return link_.get(index);
      } else {
        return linkBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder setLink(
        int index, com.google.devtools.kythe.proto.Link value) {
      if (linkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinkIsMutable();
        link_.set(index, value);
        onChanged();
      } else {
        linkBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder setLink(
        int index, com.google.devtools.kythe.proto.Link.Builder builderForValue) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.set(index, builderForValue.build());
        onChanged();
      } else {
        linkBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder addLink(com.google.devtools.kythe.proto.Link value) {
      if (linkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinkIsMutable();
        link_.add(value);
        onChanged();
      } else {
        linkBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder addLink(
        int index, com.google.devtools.kythe.proto.Link value) {
      if (linkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinkIsMutable();
        link_.add(index, value);
        onChanged();
      } else {
        linkBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder addLink(
        com.google.devtools.kythe.proto.Link.Builder builderForValue) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.add(builderForValue.build());
        onChanged();
      } else {
        linkBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder addLink(
        int index, com.google.devtools.kythe.proto.Link.Builder builderForValue) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.add(index, builderForValue.build());
        onChanged();
      } else {
        linkBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder addAllLink(
        java.lang.Iterable<? extends com.google.devtools.kythe.proto.Link> values) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, link_);
        onChanged();
      } else {
        linkBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder clearLink() {
      if (linkBuilder_ == null) {
        link_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        linkBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public Builder removeLink(int index) {
      if (linkBuilder_ == null) {
        ensureLinkIsMutable();
        link_.remove(index);
        onChanged();
      } else {
        linkBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public com.google.devtools.kythe.proto.Link.Builder getLinkBuilder(
        int index) {
      return getLinkFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public com.google.devtools.kythe.proto.LinkOrBuilder getLinkOrBuilder(
        int index) {
      if (linkBuilder_ == null) {
        return link_.get(index);  } else {
        return linkBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public java.util.List<? extends com.google.devtools.kythe.proto.LinkOrBuilder> 
         getLinkOrBuilderList() {
      if (linkBuilder_ != null) {
        return linkBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(link_);
      }
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public com.google.devtools.kythe.proto.Link.Builder addLinkBuilder() {
      return getLinkFieldBuilder().addBuilder(
          com.google.devtools.kythe.proto.Link.getDefaultInstance());
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public com.google.devtools.kythe.proto.Link.Builder addLinkBuilder(
        int index) {
      return getLinkFieldBuilder().addBuilder(
          index, com.google.devtools.kythe.proto.Link.getDefaultInstance());
    }
    /**
     * <pre>
     * Annotations for spans in raw_text. The ith Link corresponds to the span
     * starting at the ith [.
     * </pre>
     *
     * <code>repeated .kythe.proto.common.Link link = 2;</code>
     */
    public java.util.List<com.google.devtools.kythe.proto.Link.Builder> 
         getLinkBuilderList() {
      return getLinkFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.devtools.kythe.proto.Link, com.google.devtools.kythe.proto.Link.Builder, com.google.devtools.kythe.proto.LinkOrBuilder> 
        getLinkFieldBuilder() {
      if (linkBuilder_ == null) {
        linkBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.kythe.proto.Link, com.google.devtools.kythe.proto.Link.Builder, com.google.devtools.kythe.proto.LinkOrBuilder>(
                link_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        link_ = null;
      }
      return linkBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kythe.proto.Printable)
  }

  // @@protoc_insertion_point(class_scope:kythe.proto.Printable)
  private static final com.google.devtools.kythe.proto.Printable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.kythe.proto.Printable();
  }

  public static com.google.devtools.kythe.proto.Printable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Printable>
      PARSER = new com.google.protobuf.AbstractParser<Printable>() {
    public Printable parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Printable(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Printable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Printable> getParserForType() {
    return PARSER;
  }

  public com.google.devtools.kythe.proto.Printable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

