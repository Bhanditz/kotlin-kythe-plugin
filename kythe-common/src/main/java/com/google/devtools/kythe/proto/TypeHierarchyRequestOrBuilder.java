// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

public interface TypeHierarchyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.TypeHierarchyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type_ticket = 1;</code>
   */
  java.lang.String getTypeTicket();
  /**
   * <code>string type_ticket = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeTicketBytes();

  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  boolean hasNodeFilter();
  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  com.google.devtools.kythe.proto.NodeFilter getNodeFilter();
  /**
   * <code>.kythe.proto.NodeFilter node_filter = 2;</code>
   */
  com.google.devtools.kythe.proto.NodeFilterOrBuilder getNodeFilterOrBuilder();
}
