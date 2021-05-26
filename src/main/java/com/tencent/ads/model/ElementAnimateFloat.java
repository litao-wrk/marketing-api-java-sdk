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

/** 动画悬浮组件，灰度开放中 */
@ApiModel(description = "动画悬浮组件，灰度开放中")
public class ElementAnimateFloat {
  @SerializedName("title")
  private String title = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("animate_float_button_spec")
  private AnimateFloatButtonSpec animateFloatButtonSpec = null;

  @SerializedName("image_id_list")
  private String imageIdList = null;

  public ElementAnimateFloat title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ElementAnimateFloat desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   *
   * @return desc
   */
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ElementAnimateFloat animateFloatButtonSpec(AnimateFloatButtonSpec animateFloatButtonSpec) {
    this.animateFloatButtonSpec = animateFloatButtonSpec;
    return this;
  }

  /**
   * Get animateFloatButtonSpec
   *
   * @return animateFloatButtonSpec
   */
  @ApiModelProperty(value = "")
  public AnimateFloatButtonSpec getAnimateFloatButtonSpec() {
    return animateFloatButtonSpec;
  }

  public void setAnimateFloatButtonSpec(AnimateFloatButtonSpec animateFloatButtonSpec) {
    this.animateFloatButtonSpec = animateFloatButtonSpec;
  }

  public ElementAnimateFloat imageIdList(String imageIdList) {
    this.imageIdList = imageIdList;
    return this;
  }

  /**
   * Get imageIdList
   *
   * @return imageIdList
   */
  @ApiModelProperty(value = "")
  public String getImageIdList() {
    return imageIdList;
  }

  public void setImageIdList(String imageIdList) {
    this.imageIdList = imageIdList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementAnimateFloat elementAnimateFloat = (ElementAnimateFloat) o;
    return Objects.equals(this.title, elementAnimateFloat.title)
        && Objects.equals(this.desc, elementAnimateFloat.desc)
        && Objects.equals(this.animateFloatButtonSpec, elementAnimateFloat.animateFloatButtonSpec)
        && Objects.equals(this.imageIdList, elementAnimateFloat.imageIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, desc, animateFloatButtonSpec, imageIdList);
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
