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

/** WechatPagesCsgrouplistUpdateRequest */
public class WechatPagesCsgrouplistUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("corp_id")
  private String corpId = null;

  @SerializedName("group_id")
  private Long groupId = null;

  @SerializedName("group_name")
  private String groupName = null;

  @SerializedName("user_id_list")
  private List<String> userIdList = null;

  public WechatPagesCsgrouplistUpdateRequest accountId(Long accountId) {
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

  public WechatPagesCsgrouplistUpdateRequest corpId(String corpId) {
    this.corpId = corpId;
    return this;
  }

  /**
   * Get corpId
   *
   * @return corpId
   */
  @ApiModelProperty(value = "")
  public String getCorpId() {
    return corpId;
  }

  public void setCorpId(String corpId) {
    this.corpId = corpId;
  }

  public WechatPagesCsgrouplistUpdateRequest groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   *
   * @return groupId
   */
  @ApiModelProperty(value = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public WechatPagesCsgrouplistUpdateRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   *
   * @return groupName
   */
  @ApiModelProperty(value = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public WechatPagesCsgrouplistUpdateRequest userIdList(List<String> userIdList) {
    this.userIdList = userIdList;
    return this;
  }

  public WechatPagesCsgrouplistUpdateRequest addUserIdListItem(String userIdListItem) {
    if (this.userIdList == null) {
      this.userIdList = new ArrayList<String>();
    }
    this.userIdList.add(userIdListItem);
    return this;
  }

  /**
   * Get userIdList
   *
   * @return userIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getUserIdList() {
    return userIdList;
  }

  public void setUserIdList(List<String> userIdList) {
    this.userIdList = userIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatPagesCsgrouplistUpdateRequest wechatPagesCsgrouplistUpdateRequest =
        (WechatPagesCsgrouplistUpdateRequest) o;
    return Objects.equals(this.accountId, wechatPagesCsgrouplistUpdateRequest.accountId)
        && Objects.equals(this.corpId, wechatPagesCsgrouplistUpdateRequest.corpId)
        && Objects.equals(this.groupId, wechatPagesCsgrouplistUpdateRequest.groupId)
        && Objects.equals(this.groupName, wechatPagesCsgrouplistUpdateRequest.groupName)
        && Objects.equals(this.userIdList, wechatPagesCsgrouplistUpdateRequest.userIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, corpId, groupId, groupName, userIdList);
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
