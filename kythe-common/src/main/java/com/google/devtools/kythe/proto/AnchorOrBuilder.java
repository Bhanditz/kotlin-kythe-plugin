// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/xref.proto

package com.google.devtools.kythe.proto;

public interface AnchorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.Anchor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Ticket of the anchor node
   * </pre>
   *
   * <code>string ticket = 1;</code>
   */
  java.lang.String getTicket();
  /**
   * <pre>
   * Ticket of the anchor node
   * </pre>
   *
   * <code>string ticket = 1;</code>
   */
  com.google.protobuf.ByteString
      getTicketBytes();

  /**
   * <pre>
   * Edge kind describing the anchor's relationship with its referenced node
   * </pre>
   *
   * <code>string kind = 2;</code>
   */
  java.lang.String getKind();
  /**
   * <pre>
   * Edge kind describing the anchor's relationship with its referenced node
   * </pre>
   *
   * <code>string kind = 2;</code>
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * Parent ticket of the anchor; this is the file containing the anchor
   * </pre>
   *
   * <code>string parent = 3;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Parent ticket of the anchor; this is the file containing the anchor
   * </pre>
   *
   * <code>string parent = 3;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Span of the anchor within its parent's text
   * </pre>
   *
   * <code>.kythe.proto.common.Span span = 10;</code>
   */
  boolean hasSpan();
  /**
   * <pre>
   * Span of the anchor within its parent's text
   * </pre>
   *
   * <code>.kythe.proto.common.Span span = 10;</code>
   */
  com.google.devtools.kythe.proto.Span getSpan();
  /**
   * <pre>
   * Span of the anchor within its parent's text
   * </pre>
   *
   * <code>.kythe.proto.common.Span span = 10;</code>
   */
  com.google.devtools.kythe.proto.SpanOrBuilder getSpanOrBuilder();

  /**
   * <pre>
   * The anchor's spanning text within the anchor parent's text
   * </pre>
   *
   * <code>string text = 6;</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   * The anchor's spanning text within the anchor parent's text
   * </pre>
   *
   * <code>string text = 6;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * User-readable snippet of the anchor parent's text at the location of this
   * anchor
   * </pre>
   *
   * <code>string snippet = 7;</code>
   */
  java.lang.String getSnippet();
  /**
   * <pre>
   * User-readable snippet of the anchor parent's text at the location of this
   * anchor
   * </pre>
   *
   * <code>string snippet = 7;</code>
   */
  com.google.protobuf.ByteString
      getSnippetBytes();

  /**
   * <pre>
   * Span of the anchor's snippet within its parent's text
   * </pre>
   *
   * <code>.kythe.proto.common.Span snippet_span = 11;</code>
   */
  boolean hasSnippetSpan();
  /**
   * <pre>
   * Span of the anchor's snippet within its parent's text
   * </pre>
   *
   * <code>.kythe.proto.common.Span snippet_span = 11;</code>
   */
  com.google.devtools.kythe.proto.Span getSnippetSpan();
  /**
   * <pre>
   * Span of the anchor's snippet within its parent's text
   * </pre>
   *
   * <code>.kythe.proto.common.Span snippet_span = 11;</code>
   */
  com.google.devtools.kythe.proto.SpanOrBuilder getSnippetSpanOrBuilder();
}
