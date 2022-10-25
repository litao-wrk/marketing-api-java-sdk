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

/** AdgroupsGetNegativewordRequest */
public class AdgroupsGetNegativewordRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adgroup_ids")
  private List<Long> adgroupIds = null;

  public AdgroupsGetNegativewordRequest accountId(Long accountId) {
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

  public AdgroupsGetNegativewordRequest adgroupIds(List<Long> adgroupIds) {
    this.adgroupIds = adgroupIds;
    return this;
  }

  public AdgroupsGetNegativewordRequest addAdgroupIdsItem(Long adgroupIdsItem) {
    if (this.adgroupIds == null) {
      this.adgroupIds = new ArrayList<Long>();
    }
    this.adgroupIds.add(adgroupIdsItem);
    return this;
  }

  /**
   * Get adgroupIds
   *
   * @return adgroupIds
   */
  @ApiModelProperty(value = "")
  public List<Long> getAdgroupIds() {
    return adgroupIds;
  }

  public void setAdgroupIds(List<Long> adgroupIds) {
    this.adgroupIds = adgroupIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupsGetNegativewordRequest adgroupsGetNegativewordRequest =
        (AdgroupsGetNegativewordRequest) o;
    return Objects.equals(this.accountId, adgroupsGetNegativewordRequest.accountId)
        && Objects.equals(this.adgroupIds, adgroupsGetNegativewordRequest.adgroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adgroupIds);
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