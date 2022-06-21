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


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 头像点击跳转信息 */
@JsonAdapter(HeadClickType.Adapter.class)
public enum HeadClickType {
  DEFAULT("HEAD_CLICK_TYPE_DEFAULT"),

  CUSTOMIZED("HEAD_CLICK_TYPE_CUSTOMIZED"),

  CELEBRITY_ACCOUNT("HEAD_CLICK_TYPE_CELEBRITY_ACCOUNT"),

  VIRTUAL_ACCOUNT("HEAD_CLICK_TYPE_VIRTUAL_ACCOUNT"),

  LIVE_PROFILE("HEAD_CLICK_TYPE_LIVE_PROFILE"),

  LIVE_EVENT("HEAD_CLICK_TYPE_LIVE_EVENT"),

  BRAND_PROGRAM("HEAD_CLICK_TYPE_BRAND_PROGRAM"),

  CNY_PROFILE("HEAD_CLICK_TYPE_CNY_PROFILE");

  private String value;

  HeadClickType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HeadClickType fromValue(String text) {
    for (HeadClickType b : HeadClickType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HeadClickType> {
    @Override
    public void write(final JsonWriter jsonWriter, final HeadClickType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HeadClickType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HeadClickType.fromValue(String.valueOf(value));
    }
  }
}
