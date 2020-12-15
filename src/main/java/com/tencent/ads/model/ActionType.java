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

/** 标准行为类型，当值为 &#39;CUSTOM&#39; 时表示自定义行为类型 */
@JsonAdapter(ActionType.Adapter.class)
public enum ActionType {
  CUSTOM("CUSTOM"),

  REGISTER("REGISTER"),

  VIEW_CONTENT("VIEW_CONTENT"),

  CONSULT("CONSULT"),

  ADD_TO_CART("ADD_TO_CART"),

  PURCHASE("PURCHASE"),

  ACTIVATE_APP("ACTIVATE_APP"),

  SEARCH("SEARCH"),

  ADD_TO_WISHLIST("ADD_TO_WISHLIST"),

  INITIATE_CHECKOUT("INITIATE_CHECKOUT"),

  COMPLETE_ORDER("COMPLETE_ORDER"),

  DOWNLOAD_APP("DOWNLOAD_APP"),

  START_APP("START_APP"),

  RATE("RATE"),

  PAGE_VIEW("PAGE_VIEW"),

  RESERVATION("RESERVATION"),

  SHARE("SHARE"),

  APPLY("APPLY"),

  CLAIM_OFFER("CLAIM_OFFER"),

  NAVIGATE("NAVIGATE"),

  PRODUCT_RECOMMEND("PRODUCT_RECOMMEND"),

  VISIT_STORE("VISIT_STORE"),

  TRY_OUT("TRY_OUT"),

  DELIVER("DELIVER"),

  CONFIRM_EFFECTIVE_LEADS("CONFIRM_EFFECTIVE_LEADS"),

  CONFIRM_POTENTIAL_CUSTOMER("CONFIRM_POTENTIAL_CUSTOMER"),

  CREATE_ROLE("CREATE_ROLE"),

  AUTHORIZE("AUTHORIZE"),

  TUTORIAL_FINISH("TUTORIAL_FINISH"),

  SCANCODE("SCANCODE"),

  ENTER_BACKGROUND("ENTER_BACKGROUND"),

  ENTER_FOREGROUND("ENTER_FOREGROUND"),

  TICKET("TICKET"),

  LOGIN("LOGIN"),

  QUEST("QUEST"),

  UPDATE_LEVEL("UPDATE_LEVEL"),

  CREATE("CREATE"),

  PAUSE("PAUSE"),

  RESUME("RESUME"),

  APP_QUIT("APP_QUIT"),

  BIND_ACCOUNT("BIND_ACCOUNT"),

  ADD_PAYMENT("ADD_PAYMENT"),

  PRE_CREDIT("PRE_CREDIT"),

  CREDIT("CREDIT"),

  WITHDRAW_DEPOSITS("WITHDRAW_DEPOSITS"),

  LANDING_PAGE_CLICK("LANDING_PAGE_CLICK"),

  SELECT_COURSE("SELECT_COURSE"),

  RE_FUND("RE_FUND"),

  PLATFORM_VIEW("PLATFORM_VIEW"),

  ONE_DAY_LEAVE("ONE_DAY_LEAVE"),

  PRODUCT_VIEW("PRODUCT_VIEW"),

  PURCHASE_MEMBER_CARD("PURCHASE_MEMBER_CARD"),

  ONLINE_CONSULT("ONLINE_CONSULT"),

  MAKE_PHONE_CALL("MAKE_PHONE_CALL"),

  FOLLOW("FOLLOW"),

  ADD_DESKTOP("ADD_DESKTOP"),

  RETURN("RETURN"),

  LEAVE_INFORMATION("LEAVE_INFORMATION"),

  PURCHASE_COUPON("PURCHASE_COUPON"),

  ADD_GROUP("ADD_GROUP"),

  ADD_CUSTOMER_PAGE_VIEW("ADD_CUSTOMER_PAGE_VIEW"),

  ADD_CUSTOMER_PAGE_INTERACTIVE("ADD_CUSTOMER_PAGE_INTERACTIVE"),

  CUSTOMER_PROMOTION_PAGE_VIEW("CUSTOMER_PROMOTION_PAGE_VIEW"),

  CUSTOMER_PROMOTION_PAGE_INTERACTIVE("CUSTOMER_PROMOTION_PAGE_INTERACTIVE"),

  AD_CLICK("AD_CLICK"),

  AD_IMPRESSION("AD_IMPRESSION");

  private String value;

  ActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActionType fromValue(String text) {
    for (ActionType b : ActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActionType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActionType.fromValue(String.valueOf(value));
    }
  }
}
