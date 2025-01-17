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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 返回结构 */
@ApiModel(description = "返回结构")
public class LocalStoresGetListStruct {
  @SerializedName("poi_id")
  private String poiId = null;

  @SerializedName("local_store_name")
  private String localStoreName = null;

  @SerializedName("local_store_province")
  private String localStoreProvince = null;

  @SerializedName("local_store_city")
  private String localStoreCity = null;

  @SerializedName("local_store_address")
  private String localStoreAddress = null;

  @SerializedName("local_store_biz_info")
  private LocalStoreBizInfoStructRsp localStoreBizInfo = null;

  @SerializedName("wechat_ecosystem_accounts")
  private WechatEcosystemAccounts wechatEcosystemAccounts = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("system_status")
  private AdStatus systemStatus = null;

  @SerializedName("local_store_location")
  private LocalStoreLocation localStoreLocation = null;

  @SerializedName("local_store_category")
  private String localStoreCategory = null;

  @SerializedName("local_store_type")
  private Long localStoreType = null;

  @SerializedName("local_store_adcode")
  private Long localStoreAdcode = null;

  @SerializedName("local_store_district")
  private String localStoreDistrict = null;

  @SerializedName("local_store_street")
  private String localStoreStreet = null;

  @SerializedName("local_store_business_area")
  private String localStoreBusinessArea = null;

  @SerializedName("local_store_remark")
  private String localStoreRemark = null;

  public LocalStoresGetListStruct poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

  /**
   * Get poiId
   *
   * @return poiId
   */
  @ApiModelProperty(value = "")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public LocalStoresGetListStruct localStoreName(String localStoreName) {
    this.localStoreName = localStoreName;
    return this;
  }

  /**
   * Get localStoreName
   *
   * @return localStoreName
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreName() {
    return localStoreName;
  }

  public void setLocalStoreName(String localStoreName) {
    this.localStoreName = localStoreName;
  }

  public LocalStoresGetListStruct localStoreProvince(String localStoreProvince) {
    this.localStoreProvince = localStoreProvince;
    return this;
  }

  /**
   * Get localStoreProvince
   *
   * @return localStoreProvince
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreProvince() {
    return localStoreProvince;
  }

  public void setLocalStoreProvince(String localStoreProvince) {
    this.localStoreProvince = localStoreProvince;
  }

  public LocalStoresGetListStruct localStoreCity(String localStoreCity) {
    this.localStoreCity = localStoreCity;
    return this;
  }

  /**
   * Get localStoreCity
   *
   * @return localStoreCity
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreCity() {
    return localStoreCity;
  }

  public void setLocalStoreCity(String localStoreCity) {
    this.localStoreCity = localStoreCity;
  }

  public LocalStoresGetListStruct localStoreAddress(String localStoreAddress) {
    this.localStoreAddress = localStoreAddress;
    return this;
  }

  /**
   * Get localStoreAddress
   *
   * @return localStoreAddress
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreAddress() {
    return localStoreAddress;
  }

  public void setLocalStoreAddress(String localStoreAddress) {
    this.localStoreAddress = localStoreAddress;
  }

  public LocalStoresGetListStruct localStoreBizInfo(LocalStoreBizInfoStructRsp localStoreBizInfo) {
    this.localStoreBizInfo = localStoreBizInfo;
    return this;
  }

  /**
   * Get localStoreBizInfo
   *
   * @return localStoreBizInfo
   */
  @ApiModelProperty(value = "")
  public LocalStoreBizInfoStructRsp getLocalStoreBizInfo() {
    return localStoreBizInfo;
  }

  public void setLocalStoreBizInfo(LocalStoreBizInfoStructRsp localStoreBizInfo) {
    this.localStoreBizInfo = localStoreBizInfo;
  }

  public LocalStoresGetListStruct wechatEcosystemAccounts(
      WechatEcosystemAccounts wechatEcosystemAccounts) {
    this.wechatEcosystemAccounts = wechatEcosystemAccounts;
    return this;
  }

  /**
   * Get wechatEcosystemAccounts
   *
   * @return wechatEcosystemAccounts
   */
  @ApiModelProperty(value = "")
  public WechatEcosystemAccounts getWechatEcosystemAccounts() {
    return wechatEcosystemAccounts;
  }

  public void setWechatEcosystemAccounts(WechatEcosystemAccounts wechatEcosystemAccounts) {
    this.wechatEcosystemAccounts = wechatEcosystemAccounts;
  }

  public LocalStoresGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public LocalStoresGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public LocalStoresGetListStruct systemStatus(AdStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(AdStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public LocalStoresGetListStruct localStoreLocation(LocalStoreLocation localStoreLocation) {
    this.localStoreLocation = localStoreLocation;
    return this;
  }

  /**
   * Get localStoreLocation
   *
   * @return localStoreLocation
   */
  @ApiModelProperty(value = "")
  public LocalStoreLocation getLocalStoreLocation() {
    return localStoreLocation;
  }

  public void setLocalStoreLocation(LocalStoreLocation localStoreLocation) {
    this.localStoreLocation = localStoreLocation;
  }

  public LocalStoresGetListStruct localStoreCategory(String localStoreCategory) {
    this.localStoreCategory = localStoreCategory;
    return this;
  }

  /**
   * Get localStoreCategory
   *
   * @return localStoreCategory
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreCategory() {
    return localStoreCategory;
  }

  public void setLocalStoreCategory(String localStoreCategory) {
    this.localStoreCategory = localStoreCategory;
  }

  public LocalStoresGetListStruct localStoreType(Long localStoreType) {
    this.localStoreType = localStoreType;
    return this;
  }

  /**
   * Get localStoreType
   *
   * @return localStoreType
   */
  @ApiModelProperty(value = "")
  public Long getLocalStoreType() {
    return localStoreType;
  }

  public void setLocalStoreType(Long localStoreType) {
    this.localStoreType = localStoreType;
  }

  public LocalStoresGetListStruct localStoreAdcode(Long localStoreAdcode) {
    this.localStoreAdcode = localStoreAdcode;
    return this;
  }

  /**
   * Get localStoreAdcode
   *
   * @return localStoreAdcode
   */
  @ApiModelProperty(value = "")
  public Long getLocalStoreAdcode() {
    return localStoreAdcode;
  }

  public void setLocalStoreAdcode(Long localStoreAdcode) {
    this.localStoreAdcode = localStoreAdcode;
  }

  public LocalStoresGetListStruct localStoreDistrict(String localStoreDistrict) {
    this.localStoreDistrict = localStoreDistrict;
    return this;
  }

  /**
   * Get localStoreDistrict
   *
   * @return localStoreDistrict
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreDistrict() {
    return localStoreDistrict;
  }

  public void setLocalStoreDistrict(String localStoreDistrict) {
    this.localStoreDistrict = localStoreDistrict;
  }

  public LocalStoresGetListStruct localStoreStreet(String localStoreStreet) {
    this.localStoreStreet = localStoreStreet;
    return this;
  }

  /**
   * Get localStoreStreet
   *
   * @return localStoreStreet
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreStreet() {
    return localStoreStreet;
  }

  public void setLocalStoreStreet(String localStoreStreet) {
    this.localStoreStreet = localStoreStreet;
  }

  public LocalStoresGetListStruct localStoreBusinessArea(String localStoreBusinessArea) {
    this.localStoreBusinessArea = localStoreBusinessArea;
    return this;
  }

  /**
   * Get localStoreBusinessArea
   *
   * @return localStoreBusinessArea
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreBusinessArea() {
    return localStoreBusinessArea;
  }

  public void setLocalStoreBusinessArea(String localStoreBusinessArea) {
    this.localStoreBusinessArea = localStoreBusinessArea;
  }

  public LocalStoresGetListStruct localStoreRemark(String localStoreRemark) {
    this.localStoreRemark = localStoreRemark;
    return this;
  }

  /**
   * Get localStoreRemark
   *
   * @return localStoreRemark
   */
  @ApiModelProperty(value = "")
  public String getLocalStoreRemark() {
    return localStoreRemark;
  }

  public void setLocalStoreRemark(String localStoreRemark) {
    this.localStoreRemark = localStoreRemark;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalStoresGetListStruct localStoresGetListStruct = (LocalStoresGetListStruct) o;
    return Objects.equals(this.poiId, localStoresGetListStruct.poiId)
        && Objects.equals(this.localStoreName, localStoresGetListStruct.localStoreName)
        && Objects.equals(this.localStoreProvince, localStoresGetListStruct.localStoreProvince)
        && Objects.equals(this.localStoreCity, localStoresGetListStruct.localStoreCity)
        && Objects.equals(this.localStoreAddress, localStoresGetListStruct.localStoreAddress)
        && Objects.equals(this.localStoreBizInfo, localStoresGetListStruct.localStoreBizInfo)
        && Objects.equals(
            this.wechatEcosystemAccounts, localStoresGetListStruct.wechatEcosystemAccounts)
        && Objects.equals(this.createdTime, localStoresGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, localStoresGetListStruct.lastModifiedTime)
        && Objects.equals(this.systemStatus, localStoresGetListStruct.systemStatus)
        && Objects.equals(this.localStoreLocation, localStoresGetListStruct.localStoreLocation)
        && Objects.equals(this.localStoreCategory, localStoresGetListStruct.localStoreCategory)
        && Objects.equals(this.localStoreType, localStoresGetListStruct.localStoreType)
        && Objects.equals(this.localStoreAdcode, localStoresGetListStruct.localStoreAdcode)
        && Objects.equals(this.localStoreDistrict, localStoresGetListStruct.localStoreDistrict)
        && Objects.equals(this.localStoreStreet, localStoresGetListStruct.localStoreStreet)
        && Objects.equals(
            this.localStoreBusinessArea, localStoresGetListStruct.localStoreBusinessArea)
        && Objects.equals(this.localStoreRemark, localStoresGetListStruct.localStoreRemark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        poiId,
        localStoreName,
        localStoreProvince,
        localStoreCity,
        localStoreAddress,
        localStoreBizInfo,
        wechatEcosystemAccounts,
        createdTime,
        lastModifiedTime,
        systemStatus,
        localStoreLocation,
        localStoreCategory,
        localStoreType,
        localStoreAdcode,
        localStoreDistrict,
        localStoreStreet,
        localStoreBusinessArea,
        localStoreRemark);
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
