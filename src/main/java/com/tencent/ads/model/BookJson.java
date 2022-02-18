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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 小说章节内容 */
@ApiModel(description = "小说章节内容")
public class BookJson {
  @SerializedName("chapters")
  private List<Chapter> chapters = null;

  public BookJson chapters(List<Chapter> chapters) {
    this.chapters = chapters;
    return this;
  }

  public BookJson addChaptersItem(Chapter chaptersItem) {
    if (this.chapters == null) {
      this.chapters = new ArrayList<Chapter>();
    }
    this.chapters.add(chaptersItem);
    return this;
  }

  /**
   * Get chapters
   *
   * @return chapters
   */
  @ApiModelProperty(value = "")
  public List<Chapter> getChapters() {
    return chapters;
  }

  public void setChapters(List<Chapter> chapters) {
    this.chapters = chapters;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookJson bookJson = (BookJson) o;
    return Objects.equals(this.chapters, bookJson.chapters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapters);
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
