// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/common.proto

package com.google.devtools.kythe.proto;

public interface PointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.common.Point)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The offset in bytes from the beginning of the file.
   * Requires 0 ≤ byte_offset ≤ len(file).
   * </pre>
   *
   * <code>int32 byte_offset = 1;</code>
   */
  int getByteOffset();

  /**
   * <pre>
   * The line number containing the point, 1-based.
   * </pre>
   *
   * <code>int32 line_number = 2;</code>
   */
  int getLineNumber();

  /**
   * <pre>
   * The byte offset of the point within its line.
   * </pre>
   *
   * <code>int32 column_offset = 3;</code>
   */
  int getColumnOffset();
}
