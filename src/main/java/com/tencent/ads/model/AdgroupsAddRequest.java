/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** AdgroupsAddRequest */
public class AdgroupsAddRequest {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("first_day_begin_time")
  private String firstDayBeginTime = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("billing_event")
  private BillingEvent billingEvent = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("time_series")
  private String timeSeries = null;

  @SerializedName("automatic_site_enabled")
  private Boolean automaticSiteEnabled = null;

  @SerializedName("site_set")
  private List<String> siteSet = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting")
  private WriteTargetingSettingForAdgroup targeting = null;

  @SerializedName("scene_spec")
  private SceneTargetingForWrite sceneSpec = null;

  @SerializedName("flow_optimization_enabled")
  private Boolean flowOptimizationEnabled = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  @SerializedName("customized_category")
  private String customizedCategory = null;

  @SerializedName("dynamic_ad_spec")
  private DynamicAdSpec dynamicAdSpec = null;

  @SerializedName("user_action_sets")
  private List<UserActionSetStruct> userActionSets = null;

  @SerializedName("additional_user_action_sets")
  private List<UserActionSetStruct> additionalUserActionSets = null;

  @SerializedName("dynamic_creative_id")
  private Long dynamicCreativeId = null;

  @SerializedName("bid_strategy")
  private BidStrategy bidStrategy = null;

  @SerializedName("cold_start_audience")
  private List<Long> coldStartAudience = null;

  @SerializedName("auto_audience")
  private Boolean autoAudience = null;

  @SerializedName("expand_enabled")
  private Boolean expandEnabled = null;

  @SerializedName("expand_targeting")
  private List<String> expandTargeting = null;

  @SerializedName("deep_conversion_spec")
  private DeepConversionSpec deepConversionSpec = null;

  @SerializedName("deep_optimization_action_type")
  private DeepOptimizationActionType deepOptimizationActionType = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

  @SerializedName("conversion_id")
  private Long conversionId = null;

  @SerializedName("deep_conversion_behavior_bid")
  private Long deepConversionBehaviorBid = null;

  @SerializedName("deep_conversion_worth_rate")
  private Double deepConversionWorthRate = null;

  @SerializedName("deep_conversion_worth_advanced_rate")
  private Double deepConversionWorthAdvancedRate = null;

  @SerializedName("deep_conversion_behavior_advanced_bid")
  private Long deepConversionBehaviorAdvancedBid = null;

  @SerializedName("bid_mode")
  private BidMode bidMode = null;

  @SerializedName("bid_adjustment")
  private BidAdjustment bidAdjustment = null;

  @SerializedName("auto_acquisition_enabled")
  private Boolean autoAcquisitionEnabled = null;

  @SerializedName("auto_acquisition_budget")
  private Long autoAcquisitionBudget = null;

  @SerializedName("creative_display_type")
  private CreativeDisplayType creativeDisplayType = null;

  @SerializedName("auto_derived_creative_enabled")
  private Boolean autoDerivedCreativeEnabled = null;

  @SerializedName("smart_bid_type")
  private SmartBidType smartBidType = null;

  @SerializedName("marketing_scene")
  private MarketingScene marketingScene = null;

  @SerializedName("custom_adgroup_tag")
  private List<String> customAdgroupTag = null;

  @SerializedName("smart_targeting")
  private SmartTargeting smartTargeting = null;

  @SerializedName("dynamic_creative_id_set")
  private List<Long> dynamicCreativeIdSet = null;

  @SerializedName("auto_derived_landing_page_switch")
  private Boolean autoDerivedLandingPageSwitch = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public AdgroupsAddRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdgroupsAddRequest adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  /**
   * Get adgroupName
   *
   * @return adgroupName
   */
  @ApiModelProperty(value = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public AdgroupsAddRequest promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public AdgroupsAddRequest beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   *
   * @return beginDate
   */
  @ApiModelProperty(value = "")
  public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public AdgroupsAddRequest firstDayBeginTime(String firstDayBeginTime) {
    this.firstDayBeginTime = firstDayBeginTime;
    return this;
  }

  /**
   * Get firstDayBeginTime
   *
   * @return firstDayBeginTime
   */
  @ApiModelProperty(value = "")
  public String getFirstDayBeginTime() {
    return firstDayBeginTime;
  }

  public void setFirstDayBeginTime(String firstDayBeginTime) {
    this.firstDayBeginTime = firstDayBeginTime;
  }

  public AdgroupsAddRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   *
   * @return endDate
   */
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdgroupsAddRequest billingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

  /**
   * Get billingEvent
   *
   * @return billingEvent
   */
  @ApiModelProperty(value = "")
  public BillingEvent getBillingEvent() {
    return billingEvent;
  }

  public void setBillingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
  }

  public AdgroupsAddRequest bidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
    return this;
  }

  /**
   * Get bidAmount
   *
   * @return bidAmount
   */
  @ApiModelProperty(value = "")
  public Long getBidAmount() {
    return bidAmount;
  }

  public void setBidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
  }

  public AdgroupsAddRequest optimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   */
  @ApiModelProperty(value = "")
  public OptimizationGoal getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public AdgroupsAddRequest timeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  /**
   * Get timeSeries
   *
   * @return timeSeries
   */
  @ApiModelProperty(value = "")
  public String getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(String timeSeries) {
    this.timeSeries = timeSeries;
  }

  public AdgroupsAddRequest automaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
    return this;
  }

  /**
   * Get automaticSiteEnabled
   *
   * @return automaticSiteEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutomaticSiteEnabled() {
    return automaticSiteEnabled;
  }

  public void setAutomaticSiteEnabled(Boolean automaticSiteEnabled) {
    this.automaticSiteEnabled = automaticSiteEnabled;
  }

  public AdgroupsAddRequest siteSet(List<String> siteSet) {
    this.siteSet = siteSet;
    return this;
  }

  public AdgroupsAddRequest addSiteSetItem(String siteSetItem) {
    if (this.siteSet == null) {
      this.siteSet = new ArrayList<String>();
    }
    this.siteSet.add(siteSetItem);
    return this;
  }

  /**
   * Get siteSet
   *
   * @return siteSet
   */
  @ApiModelProperty(value = "")
  public List<String> getSiteSet() {
    return siteSet;
  }

  public void setSiteSet(List<String> siteSet) {
    this.siteSet = siteSet;
  }

  public AdgroupsAddRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   */
  @ApiModelProperty(value = "")
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public AdgroupsAddRequest promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public AdgroupsAddRequest appAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }

  /**
   * Get appAndroidChannelPackageId
   *
   * @return appAndroidChannelPackageId
   */
  @ApiModelProperty(value = "")
  public String getAppAndroidChannelPackageId() {
    return appAndroidChannelPackageId;
  }

  public void setAppAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
  }

  public AdgroupsAddRequest targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  /**
   * Get targetingId
   *
   * @return targetingId
   */
  @ApiModelProperty(value = "")
  public Long getTargetingId() {
    return targetingId;
  }

  public void setTargetingId(Long targetingId) {
    this.targetingId = targetingId;
  }

  public AdgroupsAddRequest targeting(WriteTargetingSettingForAdgroup targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public WriteTargetingSettingForAdgroup getTargeting() {
    return targeting;
  }

  public void setTargeting(WriteTargetingSettingForAdgroup targeting) {
    this.targeting = targeting;
  }

  public AdgroupsAddRequest sceneSpec(SceneTargetingForWrite sceneSpec) {
    this.sceneSpec = sceneSpec;
    return this;
  }

  /**
   * Get sceneSpec
   *
   * @return sceneSpec
   */
  @ApiModelProperty(value = "")
  public SceneTargetingForWrite getSceneSpec() {
    return sceneSpec;
  }

  public void setSceneSpec(SceneTargetingForWrite sceneSpec) {
    this.sceneSpec = sceneSpec;
  }

  public AdgroupsAddRequest flowOptimizationEnabled(Boolean flowOptimizationEnabled) {
    this.flowOptimizationEnabled = flowOptimizationEnabled;
    return this;
  }

  /**
   * Get flowOptimizationEnabled
   *
   * @return flowOptimizationEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isFlowOptimizationEnabled() {
    return flowOptimizationEnabled;
  }

  public void setFlowOptimizationEnabled(Boolean flowOptimizationEnabled) {
    this.flowOptimizationEnabled = flowOptimizationEnabled;
  }

  public AdgroupsAddRequest configuredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public AdgroupsAddRequest customizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
    return this;
  }

  /**
   * Get customizedCategory
   *
   * @return customizedCategory
   */
  @ApiModelProperty(value = "")
  public String getCustomizedCategory() {
    return customizedCategory;
  }

  public void setCustomizedCategory(String customizedCategory) {
    this.customizedCategory = customizedCategory;
  }

  public AdgroupsAddRequest dynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
    return this;
  }

  /**
   * Get dynamicAdSpec
   *
   * @return dynamicAdSpec
   */
  @ApiModelProperty(value = "")
  public DynamicAdSpec getDynamicAdSpec() {
    return dynamicAdSpec;
  }

  public void setDynamicAdSpec(DynamicAdSpec dynamicAdSpec) {
    this.dynamicAdSpec = dynamicAdSpec;
  }

  public AdgroupsAddRequest userActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
    return this;
  }

  public AdgroupsAddRequest addUserActionSetsItem(UserActionSetStruct userActionSetsItem) {
    if (this.userActionSets == null) {
      this.userActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.userActionSets.add(userActionSetsItem);
    return this;
  }

  /**
   * Get userActionSets
   *
   * @return userActionSets
   */
  @ApiModelProperty(value = "")
  public List<UserActionSetStruct> getUserActionSets() {
    return userActionSets;
  }

  public void setUserActionSets(List<UserActionSetStruct> userActionSets) {
    this.userActionSets = userActionSets;
  }

  public AdgroupsAddRequest additionalUserActionSets(
      List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
    return this;
  }

  public AdgroupsAddRequest addAdditionalUserActionSetsItem(
      UserActionSetStruct additionalUserActionSetsItem) {
    if (this.additionalUserActionSets == null) {
      this.additionalUserActionSets = new ArrayList<UserActionSetStruct>();
    }
    this.additionalUserActionSets.add(additionalUserActionSetsItem);
    return this;
  }

  /**
   * Get additionalUserActionSets
   *
   * @return additionalUserActionSets
   */
  @ApiModelProperty(value = "")
  public List<UserActionSetStruct> getAdditionalUserActionSets() {
    return additionalUserActionSets;
  }

  public void setAdditionalUserActionSets(List<UserActionSetStruct> additionalUserActionSets) {
    this.additionalUserActionSets = additionalUserActionSets;
  }

  public AdgroupsAddRequest dynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
    return this;
  }

  /**
   * Get dynamicCreativeId
   *
   * @return dynamicCreativeId
   */
  @ApiModelProperty(value = "")
  public Long getDynamicCreativeId() {
    return dynamicCreativeId;
  }

  public void setDynamicCreativeId(Long dynamicCreativeId) {
    this.dynamicCreativeId = dynamicCreativeId;
  }

  public AdgroupsAddRequest bidStrategy(BidStrategy bidStrategy) {
    this.bidStrategy = bidStrategy;
    return this;
  }

  /**
   * Get bidStrategy
   *
   * @return bidStrategy
   */
  @ApiModelProperty(value = "")
  public BidStrategy getBidStrategy() {
    return bidStrategy;
  }

  public void setBidStrategy(BidStrategy bidStrategy) {
    this.bidStrategy = bidStrategy;
  }

  public AdgroupsAddRequest coldStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
    return this;
  }

  public AdgroupsAddRequest addColdStartAudienceItem(Long coldStartAudienceItem) {
    if (this.coldStartAudience == null) {
      this.coldStartAudience = new ArrayList<Long>();
    }
    this.coldStartAudience.add(coldStartAudienceItem);
    return this;
  }

  /**
   * Get coldStartAudience
   *
   * @return coldStartAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getColdStartAudience() {
    return coldStartAudience;
  }

  public void setColdStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
  }

  public AdgroupsAddRequest autoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
    return this;
  }

  /**
   * Get autoAudience
   *
   * @return autoAudience
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoAudience() {
    return autoAudience;
  }

  public void setAutoAudience(Boolean autoAudience) {
    this.autoAudience = autoAudience;
  }

  public AdgroupsAddRequest expandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
    return this;
  }

  /**
   * Get expandEnabled
   *
   * @return expandEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isExpandEnabled() {
    return expandEnabled;
  }

  public void setExpandEnabled(Boolean expandEnabled) {
    this.expandEnabled = expandEnabled;
  }

  public AdgroupsAddRequest expandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
    return this;
  }

  public AdgroupsAddRequest addExpandTargetingItem(String expandTargetingItem) {
    if (this.expandTargeting == null) {
      this.expandTargeting = new ArrayList<String>();
    }
    this.expandTargeting.add(expandTargetingItem);
    return this;
  }

  /**
   * Get expandTargeting
   *
   * @return expandTargeting
   */
  @ApiModelProperty(value = "")
  public List<String> getExpandTargeting() {
    return expandTargeting;
  }

  public void setExpandTargeting(List<String> expandTargeting) {
    this.expandTargeting = expandTargeting;
  }

  public AdgroupsAddRequest deepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
    return this;
  }

  /**
   * Get deepConversionSpec
   *
   * @return deepConversionSpec
   */
  @ApiModelProperty(value = "")
  public DeepConversionSpec getDeepConversionSpec() {
    return deepConversionSpec;
  }

  public void setDeepConversionSpec(DeepConversionSpec deepConversionSpec) {
    this.deepConversionSpec = deepConversionSpec;
  }

  public AdgroupsAddRequest deepOptimizationActionType(
      DeepOptimizationActionType deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
    return this;
  }

  /**
   * Get deepOptimizationActionType
   *
   * @return deepOptimizationActionType
   */
  @ApiModelProperty(value = "")
  public DeepOptimizationActionType getDeepOptimizationActionType() {
    return deepOptimizationActionType;
  }

  public void setDeepOptimizationActionType(DeepOptimizationActionType deepOptimizationActionType) {
    this.deepOptimizationActionType = deepOptimizationActionType;
  }

  public AdgroupsAddRequest poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupsAddRequest addPoiListItem(String poiListItem) {
    if (this.poiList == null) {
      this.poiList = new ArrayList<String>();
    }
    this.poiList.add(poiListItem);
    return this;
  }

  /**
   * Get poiList
   *
   * @return poiList
   */
  @ApiModelProperty(value = "")
  public List<String> getPoiList() {
    return poiList;
  }

  public void setPoiList(List<String> poiList) {
    this.poiList = poiList;
  }

  public AdgroupsAddRequest conversionId(Long conversionId) {
    this.conversionId = conversionId;
    return this;
  }

  /**
   * Get conversionId
   *
   * @return conversionId
   */
  @ApiModelProperty(value = "")
  public Long getConversionId() {
    return conversionId;
  }

  public void setConversionId(Long conversionId) {
    this.conversionId = conversionId;
  }

  public AdgroupsAddRequest deepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
    return this;
  }

  /**
   * Get deepConversionBehaviorBid
   *
   * @return deepConversionBehaviorBid
   */
  @ApiModelProperty(value = "")
  public Long getDeepConversionBehaviorBid() {
    return deepConversionBehaviorBid;
  }

  public void setDeepConversionBehaviorBid(Long deepConversionBehaviorBid) {
    this.deepConversionBehaviorBid = deepConversionBehaviorBid;
  }

  public AdgroupsAddRequest deepConversionWorthRate(Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
    return this;
  }

  /**
   * Get deepConversionWorthRate
   *
   * @return deepConversionWorthRate
   */
  @ApiModelProperty(value = "")
  public Double getDeepConversionWorthRate() {
    return deepConversionWorthRate;
  }

  public void setDeepConversionWorthRate(Double deepConversionWorthRate) {
    this.deepConversionWorthRate = deepConversionWorthRate;
  }

  public AdgroupsAddRequest deepConversionWorthAdvancedRate(
      Double deepConversionWorthAdvancedRate) {
    this.deepConversionWorthAdvancedRate = deepConversionWorthAdvancedRate;
    return this;
  }

  /**
   * Get deepConversionWorthAdvancedRate
   *
   * @return deepConversionWorthAdvancedRate
   */
  @ApiModelProperty(value = "")
  public Double getDeepConversionWorthAdvancedRate() {
    return deepConversionWorthAdvancedRate;
  }

  public void setDeepConversionWorthAdvancedRate(Double deepConversionWorthAdvancedRate) {
    this.deepConversionWorthAdvancedRate = deepConversionWorthAdvancedRate;
  }

  public AdgroupsAddRequest deepConversionBehaviorAdvancedBid(
      Long deepConversionBehaviorAdvancedBid) {
    this.deepConversionBehaviorAdvancedBid = deepConversionBehaviorAdvancedBid;
    return this;
  }

  /**
   * Get deepConversionBehaviorAdvancedBid
   *
   * @return deepConversionBehaviorAdvancedBid
   */
  @ApiModelProperty(value = "")
  public Long getDeepConversionBehaviorAdvancedBid() {
    return deepConversionBehaviorAdvancedBid;
  }

  public void setDeepConversionBehaviorAdvancedBid(Long deepConversionBehaviorAdvancedBid) {
    this.deepConversionBehaviorAdvancedBid = deepConversionBehaviorAdvancedBid;
  }

  public AdgroupsAddRequest bidMode(BidMode bidMode) {
    this.bidMode = bidMode;
    return this;
  }

  /**
   * Get bidMode
   *
   * @return bidMode
   */
  @ApiModelProperty(value = "")
  public BidMode getBidMode() {
    return bidMode;
  }

  public void setBidMode(BidMode bidMode) {
    this.bidMode = bidMode;
  }

  public AdgroupsAddRequest bidAdjustment(BidAdjustment bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
    return this;
  }

  /**
   * Get bidAdjustment
   *
   * @return bidAdjustment
   */
  @ApiModelProperty(value = "")
  public BidAdjustment getBidAdjustment() {
    return bidAdjustment;
  }

  public void setBidAdjustment(BidAdjustment bidAdjustment) {
    this.bidAdjustment = bidAdjustment;
  }

  public AdgroupsAddRequest autoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
    this.autoAcquisitionEnabled = autoAcquisitionEnabled;
    return this;
  }

  /**
   * Get autoAcquisitionEnabled
   *
   * @return autoAcquisitionEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoAcquisitionEnabled() {
    return autoAcquisitionEnabled;
  }

  public void setAutoAcquisitionEnabled(Boolean autoAcquisitionEnabled) {
    this.autoAcquisitionEnabled = autoAcquisitionEnabled;
  }

  public AdgroupsAddRequest autoAcquisitionBudget(Long autoAcquisitionBudget) {
    this.autoAcquisitionBudget = autoAcquisitionBudget;
    return this;
  }

  /**
   * Get autoAcquisitionBudget
   *
   * @return autoAcquisitionBudget
   */
  @ApiModelProperty(value = "")
  public Long getAutoAcquisitionBudget() {
    return autoAcquisitionBudget;
  }

  public void setAutoAcquisitionBudget(Long autoAcquisitionBudget) {
    this.autoAcquisitionBudget = autoAcquisitionBudget;
  }

  public AdgroupsAddRequest creativeDisplayType(CreativeDisplayType creativeDisplayType) {
    this.creativeDisplayType = creativeDisplayType;
    return this;
  }

  /**
   * Get creativeDisplayType
   *
   * @return creativeDisplayType
   */
  @ApiModelProperty(value = "")
  public CreativeDisplayType getCreativeDisplayType() {
    return creativeDisplayType;
  }

  public void setCreativeDisplayType(CreativeDisplayType creativeDisplayType) {
    this.creativeDisplayType = creativeDisplayType;
  }

  public AdgroupsAddRequest autoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
    return this;
  }

  /**
   * Get autoDerivedCreativeEnabled
   *
   * @return autoDerivedCreativeEnabled
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedCreativeEnabled() {
    return autoDerivedCreativeEnabled;
  }

  public void setAutoDerivedCreativeEnabled(Boolean autoDerivedCreativeEnabled) {
    this.autoDerivedCreativeEnabled = autoDerivedCreativeEnabled;
  }

  public AdgroupsAddRequest smartBidType(SmartBidType smartBidType) {
    this.smartBidType = smartBidType;
    return this;
  }

  /**
   * Get smartBidType
   *
   * @return smartBidType
   */
  @ApiModelProperty(value = "")
  public SmartBidType getSmartBidType() {
    return smartBidType;
  }

  public void setSmartBidType(SmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }

  public AdgroupsAddRequest marketingScene(MarketingScene marketingScene) {
    this.marketingScene = marketingScene;
    return this;
  }

  /**
   * Get marketingScene
   *
   * @return marketingScene
   */
  @ApiModelProperty(value = "")
  public MarketingScene getMarketingScene() {
    return marketingScene;
  }

  public void setMarketingScene(MarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }

  public AdgroupsAddRequest customAdgroupTag(List<String> customAdgroupTag) {
    this.customAdgroupTag = customAdgroupTag;
    return this;
  }

  public AdgroupsAddRequest addCustomAdgroupTagItem(String customAdgroupTagItem) {
    if (this.customAdgroupTag == null) {
      this.customAdgroupTag = new ArrayList<String>();
    }
    this.customAdgroupTag.add(customAdgroupTagItem);
    return this;
  }

  /**
   * Get customAdgroupTag
   *
   * @return customAdgroupTag
   */
  @ApiModelProperty(value = "")
  public List<String> getCustomAdgroupTag() {
    return customAdgroupTag;
  }

  public void setCustomAdgroupTag(List<String> customAdgroupTag) {
    this.customAdgroupTag = customAdgroupTag;
  }

  public AdgroupsAddRequest smartTargeting(SmartTargeting smartTargeting) {
    this.smartTargeting = smartTargeting;
    return this;
  }

  /**
   * Get smartTargeting
   *
   * @return smartTargeting
   */
  @ApiModelProperty(value = "")
  public SmartTargeting getSmartTargeting() {
    return smartTargeting;
  }

  public void setSmartTargeting(SmartTargeting smartTargeting) {
    this.smartTargeting = smartTargeting;
  }

  public AdgroupsAddRequest dynamicCreativeIdSet(List<Long> dynamicCreativeIdSet) {
    this.dynamicCreativeIdSet = dynamicCreativeIdSet;
    return this;
  }

  public AdgroupsAddRequest addDynamicCreativeIdSetItem(Long dynamicCreativeIdSetItem) {
    if (this.dynamicCreativeIdSet == null) {
      this.dynamicCreativeIdSet = new ArrayList<Long>();
    }
    this.dynamicCreativeIdSet.add(dynamicCreativeIdSetItem);
    return this;
  }

  /**
   * Get dynamicCreativeIdSet
   *
   * @return dynamicCreativeIdSet
   */
  @ApiModelProperty(value = "")
  public List<Long> getDynamicCreativeIdSet() {
    return dynamicCreativeIdSet;
  }

  public void setDynamicCreativeIdSet(List<Long> dynamicCreativeIdSet) {
    this.dynamicCreativeIdSet = dynamicCreativeIdSet;
  }

  public AdgroupsAddRequest autoDerivedLandingPageSwitch(Boolean autoDerivedLandingPageSwitch) {
    this.autoDerivedLandingPageSwitch = autoDerivedLandingPageSwitch;
    return this;
  }

  /**
   * Get autoDerivedLandingPageSwitch
   *
   * @return autoDerivedLandingPageSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoDerivedLandingPageSwitch() {
    return autoDerivedLandingPageSwitch;
  }

  public void setAutoDerivedLandingPageSwitch(Boolean autoDerivedLandingPageSwitch) {
    this.autoDerivedLandingPageSwitch = autoDerivedLandingPageSwitch;
  }

  public AdgroupsAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsAddRequest adgroupsAddRequest = (AdgroupsAddRequest) o;
    return Objects.equals(this.campaignId, adgroupsAddRequest.campaignId)
        && Objects.equals(this.adgroupName, adgroupsAddRequest.adgroupName)
        && Objects.equals(this.promotedObjectType, adgroupsAddRequest.promotedObjectType)
        && Objects.equals(this.beginDate, adgroupsAddRequest.beginDate)
        && Objects.equals(this.firstDayBeginTime, adgroupsAddRequest.firstDayBeginTime)
        && Objects.equals(this.endDate, adgroupsAddRequest.endDate)
        && Objects.equals(this.billingEvent, adgroupsAddRequest.billingEvent)
        && Objects.equals(this.bidAmount, adgroupsAddRequest.bidAmount)
        && Objects.equals(this.optimizationGoal, adgroupsAddRequest.optimizationGoal)
        && Objects.equals(this.timeSeries, adgroupsAddRequest.timeSeries)
        && Objects.equals(this.automaticSiteEnabled, adgroupsAddRequest.automaticSiteEnabled)
        && Objects.equals(this.siteSet, adgroupsAddRequest.siteSet)
        && Objects.equals(this.dailyBudget, adgroupsAddRequest.dailyBudget)
        && Objects.equals(this.promotedObjectId, adgroupsAddRequest.promotedObjectId)
        && Objects.equals(
            this.appAndroidChannelPackageId, adgroupsAddRequest.appAndroidChannelPackageId)
        && Objects.equals(this.targetingId, adgroupsAddRequest.targetingId)
        && Objects.equals(this.targeting, adgroupsAddRequest.targeting)
        && Objects.equals(this.sceneSpec, adgroupsAddRequest.sceneSpec)
        && Objects.equals(this.flowOptimizationEnabled, adgroupsAddRequest.flowOptimizationEnabled)
        && Objects.equals(this.configuredStatus, adgroupsAddRequest.configuredStatus)
        && Objects.equals(this.customizedCategory, adgroupsAddRequest.customizedCategory)
        && Objects.equals(this.dynamicAdSpec, adgroupsAddRequest.dynamicAdSpec)
        && Objects.equals(this.userActionSets, adgroupsAddRequest.userActionSets)
        && Objects.equals(
            this.additionalUserActionSets, adgroupsAddRequest.additionalUserActionSets)
        && Objects.equals(this.dynamicCreativeId, adgroupsAddRequest.dynamicCreativeId)
        && Objects.equals(this.bidStrategy, adgroupsAddRequest.bidStrategy)
        && Objects.equals(this.coldStartAudience, adgroupsAddRequest.coldStartAudience)
        && Objects.equals(this.autoAudience, adgroupsAddRequest.autoAudience)
        && Objects.equals(this.expandEnabled, adgroupsAddRequest.expandEnabled)
        && Objects.equals(this.expandTargeting, adgroupsAddRequest.expandTargeting)
        && Objects.equals(this.deepConversionSpec, adgroupsAddRequest.deepConversionSpec)
        && Objects.equals(
            this.deepOptimizationActionType, adgroupsAddRequest.deepOptimizationActionType)
        && Objects.equals(this.poiList, adgroupsAddRequest.poiList)
        && Objects.equals(this.conversionId, adgroupsAddRequest.conversionId)
        && Objects.equals(
            this.deepConversionBehaviorBid, adgroupsAddRequest.deepConversionBehaviorBid)
        && Objects.equals(this.deepConversionWorthRate, adgroupsAddRequest.deepConversionWorthRate)
        && Objects.equals(
            this.deepConversionWorthAdvancedRate,
            adgroupsAddRequest.deepConversionWorthAdvancedRate)
        && Objects.equals(
            this.deepConversionBehaviorAdvancedBid,
            adgroupsAddRequest.deepConversionBehaviorAdvancedBid)
        && Objects.equals(this.bidMode, adgroupsAddRequest.bidMode)
        && Objects.equals(this.bidAdjustment, adgroupsAddRequest.bidAdjustment)
        && Objects.equals(this.autoAcquisitionEnabled, adgroupsAddRequest.autoAcquisitionEnabled)
        && Objects.equals(this.autoAcquisitionBudget, adgroupsAddRequest.autoAcquisitionBudget)
        && Objects.equals(this.creativeDisplayType, adgroupsAddRequest.creativeDisplayType)
        && Objects.equals(
            this.autoDerivedCreativeEnabled, adgroupsAddRequest.autoDerivedCreativeEnabled)
        && Objects.equals(this.smartBidType, adgroupsAddRequest.smartBidType)
        && Objects.equals(this.marketingScene, adgroupsAddRequest.marketingScene)
        && Objects.equals(this.customAdgroupTag, adgroupsAddRequest.customAdgroupTag)
        && Objects.equals(this.smartTargeting, adgroupsAddRequest.smartTargeting)
        && Objects.equals(this.dynamicCreativeIdSet, adgroupsAddRequest.dynamicCreativeIdSet)
        && Objects.equals(
            this.autoDerivedLandingPageSwitch, adgroupsAddRequest.autoDerivedLandingPageSwitch)
        && Objects.equals(this.accountId, adgroupsAddRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        campaignId,
        adgroupName,
        promotedObjectType,
        beginDate,
        firstDayBeginTime,
        endDate,
        billingEvent,
        bidAmount,
        optimizationGoal,
        timeSeries,
        automaticSiteEnabled,
        siteSet,
        dailyBudget,
        promotedObjectId,
        appAndroidChannelPackageId,
        targetingId,
        targeting,
        sceneSpec,
        flowOptimizationEnabled,
        configuredStatus,
        customizedCategory,
        dynamicAdSpec,
        userActionSets,
        additionalUserActionSets,
        dynamicCreativeId,
        bidStrategy,
        coldStartAudience,
        autoAudience,
        expandEnabled,
        expandTargeting,
        deepConversionSpec,
        deepOptimizationActionType,
        poiList,
        conversionId,
        deepConversionBehaviorBid,
        deepConversionWorthRate,
        deepConversionWorthAdvancedRate,
        deepConversionBehaviorAdvancedBid,
        bidMode,
        bidAdjustment,
        autoAcquisitionEnabled,
        autoAcquisitionBudget,
        creativeDisplayType,
        autoDerivedCreativeEnabled,
        smartBidType,
        marketingScene,
        customAdgroupTag,
        smartTargeting,
        dynamicCreativeIdSet,
        autoDerivedLandingPageSwitch,
        accountId);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
