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

/** 蹊径落地页类型 */
@JsonAdapter(ComponentsPageType.Adapter.class)
public enum ComponentsPageType {
  ANDROID("PAGE_TYPE_XIJING_ANDROID"),

  IOS("PAGE_TYPE_XIJING_IOS");

  private String value;

  ComponentsPageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ComponentsPageType fromValue(String text) {
    for (ComponentsPageType b : ComponentsPageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ComponentsPageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ComponentsPageType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ComponentsPageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ComponentsPageType.fromValue(String.valueOf(value));
    }
  }
}
