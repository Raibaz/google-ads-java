// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/ad_group_bid_modifier_error.proto

package com.google.ads.googleads.v1.errors;

public final class AdGroupBidModifierErrorProto {
  private AdGroupBidModifierErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_AdGroupBidModifierErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_AdGroupBidModifierErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v1/errors/ad_grou" +
      "p_bid_modifier_error.proto\022\036google.ads.g" +
      "oogleads.v1.errors\032\034google/api/annotatio" +
      "ns.proto\"\266\001\n\033AdGroupBidModifierErrorEnum" +
      "\"\226\001\n\027AdGroupBidModifierError\022\017\n\013UNSPECIF" +
      "IED\020\000\022\013\n\007UNKNOWN\020\001\022\036\n\032CRITERION_ID_NOT_S" +
      "UPPORTED\020\002\022=\n9CANNOT_OVERRIDE_OPTED_OUT_" +
      "CAMPAIGN_CRITERION_BID_MODIFIER\020\003B\367\001\n\"co" +
      "m.google.ads.googleads.v1.errorsB\034AdGrou" +
      "pBidModifierErrorProtoP\001ZDgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "/errors;errors\242\002\003GAA\252\002\036Google.Ads.Google" +
      "Ads.V1.Errors\312\002\036Google\\Ads\\GoogleAds\\V1\\" +
      "Errors\352\002\"Google::Ads::GoogleAds::V1::Err" +
      "orsb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_errors_AdGroupBidModifierErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_AdGroupBidModifierErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_AdGroupBidModifierErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
