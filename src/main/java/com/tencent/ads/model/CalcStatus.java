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

/** 广告状态 */
@JsonAdapter(CalcStatus.Adapter.class)
public enum CalcStatus {
  UNKNOWN("STATUS_UNKNOWN"),

  PENDING("STATUS_PENDING"),

  DENIED("STATUS_DENIED"),

  FROZEN("STATUS_FROZEN"),

  SUSPEND("STATUS_SUSPEND"),

  READY("STATUS_READY"),

  ACTIVE("STATUS_ACTIVE"),

  STOP("STATUS_STOP"),

  PREPARE("STATUS_PREPARE"),

  DELETED("STATUS_DELETED"),

  ACTIVE_ACCOUNT_FROZEN("STATUS_ACTIVE_ACCOUNT_FROZEN"),

  ACTIVE_ACCOUNT_EMPTY("STATUS_ACTIVE_ACCOUNT_EMPTY"),

  ACTIVE_ACCOUNT_LIMIT("STATUS_ACTIVE_ACCOUNT_LIMIT"),

  ACTIVE_CAMPAIGN_LIMIT("STATUS_ACTIVE_CAMPAIGN_LIMIT"),

  ACTIVE_CAMPAIGN_SUSPEND("STATUS_ACTIVE_CAMPAIGN_SUSPEND"),

  ACTIVE_AD_LIMIT("STATUS_ACTIVE_AD_LIMIT"),

  PART_READY("STATUS_PART_READY"),

  PART_ACTIVE("STATUS_PART_ACTIVE"),

  TO_LOCK_FLOW("STATUS_TO_LOCK_FLOW"),

  LOCKING_FLOW("STATUS_LOCKING_FLOW"),

  LOCK_FLOW_SUCCESS("STATUS_LOCK_FLOW_SUCCESS"),

  LOCK_FLOW_FAIL("STATUS_LOCK_FLOW_FAIL"),

  FLOW_CANCELLED("STATUS_FLOW_CANCELLED");

  private String value;

  CalcStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CalcStatus fromValue(String text) {
    for (CalcStatus b : CalcStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CalcStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CalcStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CalcStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CalcStatus.fromValue(String.valueOf(value));
    }
  }
}
