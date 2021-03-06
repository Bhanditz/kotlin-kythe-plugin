// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/common.proto

package com.google.devtools.kythe.proto;

public interface LinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.common.Link)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Semantic tickets for DEFINITION links.
   * </pre>
   *
   * <code>repeated string definition = 3;</code>
   */
  java.util.List<java.lang.String>
      getDefinitionList();
  /**
   * <pre>
   * Semantic tickets for DEFINITION links.
   * </pre>
   *
   * <code>repeated string definition = 3;</code>
   */
  int getDefinitionCount();
  /**
   * <pre>
   * Semantic tickets for DEFINITION links.
   * </pre>
   *
   * <code>repeated string definition = 3;</code>
   */
  java.lang.String getDefinition(int index);
  /**
   * <pre>
   * Semantic tickets for DEFINITION links.
   * </pre>
   *
   * <code>repeated string definition = 3;</code>
   */
  com.google.protobuf.ByteString
      getDefinitionBytes(int index);

  /**
   * <pre>
   * The kind of this span.
   * </pre>
   *
   * <code>.kythe.proto.common.Link.Kind kind = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getKindValue();
  /**
   * <pre>
   * The kind of this span.
   * </pre>
   *
   * <code>.kythe.proto.common.Link.Kind kind = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.devtools.kythe.proto.Link.Kind getKind();
}
