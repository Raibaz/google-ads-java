// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/click_view.proto

package com.google.ads.googleads.v1.resources;

public final class ClickViewProto {
  private ClickViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_ClickView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_ClickView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v1/resources/clic" +
      "k_view.proto\022!google.ads.googleads.v1.re" +
      "sources\0323google/ads/googleads/v1/common/" +
      "click_location.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\227\002\n\tClickView\022\025\n\rresource_name\030\001 \001(\t\022" +
      "+\n\005gclid\030\002 \001(\0132\034.google.protobuf.StringV" +
      "alue\022G\n\020area_of_interest\030\003 \001(\0132-.google." +
      "ads.googleads.v1.common.ClickLocation\022K\n" +
      "\024location_of_presence\030\004 \001(\0132-.google.ads" +
      ".googleads.v1.common.ClickLocation\0220\n\013pa" +
      "ge_number\030\005 \001(\0132\033.google.protobuf.Int64V" +
      "alueB\373\001\n%com.google.ads.googleads.v1.res" +
      "ourcesB\016ClickViewProtoP\001ZJgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "/resources;resources\242\002\003GAA\252\002!Google.Ads." +
      "GoogleAds.V1.Resources\312\002!Google\\Ads\\Goog" +
      "leAds\\V1\\Resources\352\002%Google::Ads::Google" +
      "Ads::V1::Resourcesb\006proto3"
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
          com.google.ads.googleads.v1.common.ClickLocationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_ClickView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_ClickView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_ClickView_descriptor,
        new java.lang.String[] { "ResourceName", "Gclid", "AreaOfInterest", "LocationOfPresence", "PageNumber", });
    com.google.ads.googleads.v1.common.ClickLocationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
