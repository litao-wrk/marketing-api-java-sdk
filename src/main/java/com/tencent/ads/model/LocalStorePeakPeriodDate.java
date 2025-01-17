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

/** 门店经营信息客流高峰日期 */
@JsonAdapter(LocalStorePeakPeriodDate.Adapter.class)
public enum LocalStorePeakPeriodDate {
  UNKNOWN("UNKNOWN"),

  WORKDAY("WORKDAY"),

  WEEKEND("WEEKEND"),

  WHOLE_WEEK("WHOLE_WEEK");

  private String value;

  LocalStorePeakPeriodDate(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalStorePeakPeriodDate fromValue(String text) {
    for (LocalStorePeakPeriodDate b : LocalStorePeakPeriodDate.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalStorePeakPeriodDate> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalStorePeakPeriodDate enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalStorePeakPeriodDate read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalStorePeakPeriodDate.fromValue(String.valueOf(value));
    }
  }
}
