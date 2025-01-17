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

/** 应用分包信息 */
@ApiModel(description = "应用分包信息")
public class SplitChannelPackageData {
  @SerializedName("package_id")
  private Long packageId = null;

  @SerializedName("channel_name")
  private String channelName = null;

  @SerializedName("channel_package_id")
  private Long channelPackageId = null;

  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("system_status")
  private UnionPackageSysStatus systemStatus = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  public SplitChannelPackageData packageId(Long packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * Get packageId
   *
   * @return packageId
   */
  @ApiModelProperty(value = "")
  public Long getPackageId() {
    return packageId;
  }

  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }

  public SplitChannelPackageData channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * Get channelName
   *
   * @return channelName
   */
  @ApiModelProperty(value = "")
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public SplitChannelPackageData channelPackageId(Long channelPackageId) {
    this.channelPackageId = channelPackageId;
    return this;
  }

  /**
   * Get channelPackageId
   *
   * @return channelPackageId
   */
  @ApiModelProperty(value = "")
  public Long getChannelPackageId() {
    return channelPackageId;
  }

  public void setChannelPackageId(Long channelPackageId) {
    this.channelPackageId = channelPackageId;
  }

  public SplitChannelPackageData channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   *
   * @return channelId
   */
  @ApiModelProperty(value = "")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public SplitChannelPackageData systemStatus(UnionPackageSysStatus systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  /**
   * Get systemStatus
   *
   * @return systemStatus
   */
  @ApiModelProperty(value = "")
  public UnionPackageSysStatus getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(UnionPackageSysStatus systemStatus) {
    this.systemStatus = systemStatus;
  }

  public SplitChannelPackageData createdTime(Long createdTime) {
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

  public SplitChannelPackageData lastModifiedTime(Long lastModifiedTime) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitChannelPackageData splitChannelPackageData = (SplitChannelPackageData) o;
    return Objects.equals(this.packageId, splitChannelPackageData.packageId)
        && Objects.equals(this.channelName, splitChannelPackageData.channelName)
        && Objects.equals(this.channelPackageId, splitChannelPackageData.channelPackageId)
        && Objects.equals(this.channelId, splitChannelPackageData.channelId)
        && Objects.equals(this.systemStatus, splitChannelPackageData.systemStatus)
        && Objects.equals(this.createdTime, splitChannelPackageData.createdTime)
        && Objects.equals(this.lastModifiedTime, splitChannelPackageData.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        packageId,
        channelName,
        channelPackageId,
        channelId,
        systemStatus,
        createdTime,
        lastModifiedTime);
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
