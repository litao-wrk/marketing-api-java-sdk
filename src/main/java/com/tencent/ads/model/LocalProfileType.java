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

/** 头像类型,使用自定义类型需要传profile id，通过该字段实现类型的切换 */
@JsonAdapter(LocalProfileType.Adapter.class)
public enum LocalProfileType {
  INVAILD("LOCAL_PROFILE_TYPE_INVAILD"),

  DEFAULT("LOCAL_PROFILE_TYPE_DEFAULT"),

  CUSTOMIZED("LOCAL_PROFILE_TYPE_CUSTOMIZED");

  private String value;

  LocalProfileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProfileType fromValue(String text) {
    for (LocalProfileType b : LocalProfileType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalProfileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProfileType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProfileType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProfileType.fromValue(String.valueOf(value));
    }
  }
}
