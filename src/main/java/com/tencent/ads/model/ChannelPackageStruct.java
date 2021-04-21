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

/** 渠道包信息 */
@ApiModel(description = "渠道包信息")
public class ChannelPackageStruct {
  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  @SerializedName("package_name")
  private String packageName = null;

  @SerializedName("system_status")
  private UnionPackageSysStatus systemStatus = null;

  @SerializedName("package_origin_url")
  private String packageOriginUrl = null;

  public ChannelPackageStruct appAndroidChannelPackageId(String appAndroidChannelPackageId) {
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

  public ChannelPackageStruct packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Get packageName
   *
   * @return packageName
   */
  @ApiModelProperty(value = "")
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public ChannelPackageStruct systemStatus(UnionPackageSysStatus systemStatus) {
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

  public ChannelPackageStruct packageOriginUrl(String packageOriginUrl) {
    this.packageOriginUrl = packageOriginUrl;
    return this;
  }

  /**
   * Get packageOriginUrl
   *
   * @return packageOriginUrl
   */
  @ApiModelProperty(value = "")
  public String getPackageOriginUrl() {
    return packageOriginUrl;
  }

  public void setPackageOriginUrl(String packageOriginUrl) {
    this.packageOriginUrl = packageOriginUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelPackageStruct channelPackageStruct = (ChannelPackageStruct) o;
    return Objects.equals(
            this.appAndroidChannelPackageId, channelPackageStruct.appAndroidChannelPackageId)
        && Objects.equals(this.packageName, channelPackageStruct.packageName)
        && Objects.equals(this.systemStatus, channelPackageStruct.systemStatus)
        && Objects.equals(this.packageOriginUrl, channelPackageStruct.packageOriginUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAndroidChannelPackageId, packageName, systemStatus, packageOriginUrl);
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
