// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.any



object AnyProto extends _root_.com.trueaccord.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.com.trueaccord.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.google.protobuf.any.Any
  )
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Chlnb29nbGUvcHJvdG9idWYvYW55LnByb3RvEg9nb29nbGUucHJvdG9idWYiNgoDQW55EhkKCHR5cGVfdXJsGAEgASgJUgd0e
  XBlVXJsEhQKBXZhbHVlGAIgASgMUgV2YWx1ZUJvChNjb20uZ29vZ2xlLnByb3RvYnVmQghBbnlQcm90b1ABWiVnaXRodWIuY29tL
  2dvbGFuZy9wcm90b2J1Zi9wdHlwZXMvYW55ogIDR1BCqgIeR29vZ2xlLlByb3RvYnVmLldlbGxLbm93blR5cGVzYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}