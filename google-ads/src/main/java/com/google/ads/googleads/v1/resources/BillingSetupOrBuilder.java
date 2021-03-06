// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/billing_setup.proto

package com.google.ads.googleads.v1.resources;

public interface BillingSetupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.BillingSetup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the billing setup.
   * BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the billing setup.
   * BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3;</code>
   */
  com.google.ads.googleads.v1.enums.BillingSetupStatusEnum.BillingSetupStatus getStatus();

  /**
   * <pre>
   * The resource name of the Payments account associated with this billing
   * setup. Payments resource names have the form:
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing Payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account = 11;</code>
   */
  boolean hasPaymentsAccount();
  /**
   * <pre>
   * The resource name of the Payments account associated with this billing
   * setup. Payments resource names have the form:
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing Payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account = 11;</code>
   */
  com.google.protobuf.StringValue getPaymentsAccount();
  /**
   * <pre>
   * The resource name of the Payments account associated with this billing
   * setup. Payments resource names have the form:
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * When setting up billing, this is used to signup with an existing Payments
   * account (and then payments_account_info should not be set).
   * When getting a billing setup, this and payments_account_info will be
   * populated.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPaymentsAccountOrBuilder();

  /**
   * <pre>
   * The Payments account information associated with this billing setup.
   * When setting up billing, this is used to signup with a new Payments account
   * (and then payments_account should not be set).
   * When getting a billing setup, this and payments_account will be
   * populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12;</code>
   */
  boolean hasPaymentsAccountInfo();
  /**
   * <pre>
   * The Payments account information associated with this billing setup.
   * When setting up billing, this is used to signup with a new Payments account
   * (and then payments_account should not be set).
   * When getting a billing setup, this and payments_account will be
   * populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12;</code>
   */
  com.google.ads.googleads.v1.resources.BillingSetup.PaymentsAccountInfo getPaymentsAccountInfo();
  /**
   * <pre>
   * The Payments account information associated with this billing setup.
   * When setting up billing, this is used to signup with a new Payments account
   * (and then payments_account should not be set).
   * When getting a billing setup, this and payments_account will be
   * populated.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.BillingSetup.PaymentsAccountInfo payments_account_info = 12;</code>
   */
  com.google.ads.googleads.v1.resources.BillingSetup.PaymentsAccountInfoOrBuilder getPaymentsAccountInfoOrBuilder();

  /**
   * <pre>
   * The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format. Only a
   * future time is allowed.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date_time = 9;</code>
   */
  boolean hasStartDateTime();
  /**
   * <pre>
   * The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format. Only a
   * future time is allowed.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date_time = 9;</code>
   */
  com.google.protobuf.StringValue getStartDateTime();
  /**
   * <pre>
   * The start date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format. Only a
   * future time is allowed.
   * </pre>
   *
   * <code>.google.protobuf.StringValue start_date_time = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getStartDateTimeOrBuilder();

  /**
   * <pre>
   * The start time as a type. Only NOW is allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.TimeTypeEnum.TimeType start_time_type = 10;</code>
   */
  int getStartTimeTypeValue();
  /**
   * <pre>
   * The start time as a type. Only NOW is allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.TimeTypeEnum.TimeType start_time_type = 10;</code>
   */
  com.google.ads.googleads.v1.enums.TimeTypeEnum.TimeType getStartTimeType();

  /**
   * <pre>
   * The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date_time = 13;</code>
   */
  boolean hasEndDateTime();
  /**
   * <pre>
   * The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date_time = 13;</code>
   */
  com.google.protobuf.StringValue getEndDateTime();
  /**
   * <pre>
   * The end date time in yyyy-MM-dd or yyyy-MM-dd HH:mm:ss format.
   * </pre>
   *
   * <code>.google.protobuf.StringValue end_date_time = 13;</code>
   */
  com.google.protobuf.StringValueOrBuilder getEndDateTimeOrBuilder();

  /**
   * <pre>
   * The end time as a type.  The only possible value is FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.TimeTypeEnum.TimeType end_time_type = 14;</code>
   */
  int getEndTimeTypeValue();
  /**
   * <pre>
   * The end time as a type.  The only possible value is FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.TimeTypeEnum.TimeType end_time_type = 14;</code>
   */
  com.google.ads.googleads.v1.enums.TimeTypeEnum.TimeType getEndTimeType();

  public com.google.ads.googleads.v1.resources.BillingSetup.StartTimeCase getStartTimeCase();

  public com.google.ads.googleads.v1.resources.BillingSetup.EndTimeCase getEndTimeCase();
}
