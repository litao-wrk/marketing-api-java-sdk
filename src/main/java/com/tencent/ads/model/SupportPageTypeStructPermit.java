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

/** 支持落地页类型结构 */
@ApiModel(description = "支持落地页类型结构")
public class SupportPageTypeStructPermit {
  @SerializedName("page_type")
  private String pageType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("support_link_name_type")
  private SupportLinkNameTypePermit supportLinkNameType = null;

  @SerializedName("support_link_page_type")
  private SupportLinkPageTypePermit supportLinkPageType = null;

  public SupportPageTypeStructPermit pageType(String pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   */
  @ApiModelProperty(value = "")
  public String getPageType() {
    return pageType;
  }

  public void setPageType(String pageType) {
    this.pageType = pageType;
  }

  public SupportPageTypeStructPermit description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SupportPageTypeStructPermit supportLinkNameType(
      SupportLinkNameTypePermit supportLinkNameType) {
    this.supportLinkNameType = supportLinkNameType;
    return this;
  }

  /**
   * Get supportLinkNameType
   *
   * @return supportLinkNameType
   */
  @ApiModelProperty(value = "")
  public SupportLinkNameTypePermit getSupportLinkNameType() {
    return supportLinkNameType;
  }

  public void setSupportLinkNameType(SupportLinkNameTypePermit supportLinkNameType) {
    this.supportLinkNameType = supportLinkNameType;
  }

  public SupportPageTypeStructPermit supportLinkPageType(
      SupportLinkPageTypePermit supportLinkPageType) {
    this.supportLinkPageType = supportLinkPageType;
    return this;
  }

  /**
   * Get supportLinkPageType
   *
   * @return supportLinkPageType
   */
  @ApiModelProperty(value = "")
  public SupportLinkPageTypePermit getSupportLinkPageType() {
    return supportLinkPageType;
  }

  public void setSupportLinkPageType(SupportLinkPageTypePermit supportLinkPageType) {
    this.supportLinkPageType = supportLinkPageType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportPageTypeStructPermit supportPageTypeStructPermit = (SupportPageTypeStructPermit) o;
    return Objects.equals(this.pageType, supportPageTypeStructPermit.pageType)
        && Objects.equals(this.description, supportPageTypeStructPermit.description)
        && Objects.equals(this.supportLinkNameType, supportPageTypeStructPermit.supportLinkNameType)
        && Objects.equals(
            this.supportLinkPageType, supportPageTypeStructPermit.supportLinkPageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageType, description, supportLinkNameType, supportLinkPageType);
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