// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/campaign_criterion_service.proto

package com.google.ads.googleads.v1.services;

public interface CampaignCriterionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.CampaignCriterionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CampaignCriterion create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CampaignCriterion create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.CampaignCriterion getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CampaignCriterion create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.CampaignCriterionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The criterion is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CampaignCriterion update = 2;</code>
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The criterion is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CampaignCriterion update = 2;</code>
   */
  com.google.ads.googleads.v1.resources.CampaignCriterion getUpdate();
  /**
   * <pre>
   * Update operation: The criterion is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.CampaignCriterion update = 2;</code>
   */
  com.google.ads.googleads.v1.resources.CampaignCriterionOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   * `customers/{customer_id}/campaignCriteria/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   * `customers/{customer_id}/campaignCriteria/{campaign_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3;</code>
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  public com.google.ads.googleads.v1.services.CampaignCriterionOperation.OperationCase getOperationCase();
}