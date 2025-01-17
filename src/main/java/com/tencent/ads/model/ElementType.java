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

/** 创意元素类型 */
@JsonAdapter(ElementType.Adapter.class)
public enum ElementType {
  ELEMENT_TYPE_TEXT("ELEMENT_TYPE_TEXT"),

  ELEMENT_TYPE_IMAGE("ELEMENT_TYPE_IMAGE"),

  ELEMENT_TYPE_VIDEO("ELEMENT_TYPE_VIDEO"),

  ELEMENT_TYPE_URL("ELEMENT_TYPE_URL"),

  ELEMENT_TYPE_ENUM("ELEMENT_TYPE_ENUM"),

  ELEMENT_TYPE_CANVAS("ELEMENT_TYPE_CANVAS"),

  ELEMENT_TYPE_STRUCT("ELEMENT_TYPE_STRUCT"),

  ELEMENT_TYPE_REFERENCE("ELEMENT_TYPE_REFERENCE"),

  ELEMENT_TYPE_BOOLEAN("ELEMENT_TYPE_BOOLEAN"),

  ELEMENT_TYPE_PHONE("ELEMENT_TYPE_PHONE"),

  ELEMENT_TYPE_FORM("ELEMENT_TYPE_FORM"),

  ELEMENT_TYPE_CONSULT("ELEMENT_TYPE_CONSULT"),

  ELEMENT_TYPE_NUMBER("ELEMENT_TYPE_NUMBER"),

  STRUCT("STRUCT"),

  TEXT("TEXT"),

  URL("URL"),

  IMAGE("IMAGE"),

  VIDEO("VIDEO"),

  BIRTHDAY_ACTIVITY_PAGE_CARD("BIRTHDAY_ACTIVITY_PAGE_CARD"),

  FESTIVAL_ACTIVITY_PAGE_CARD("FESTIVAL_ACTIVITY_PAGE_CARD"),

  ID("ID"),

  PHONE_BY_USER_INPUT("PHONE_BY_USER_INPUT"),

  DYNAMIC_CREATIVE("DYNAMIC_CREATIVE"),

  DEEP_LINK_TYPE("DEEP_LINK_TYPE"),

  CANVAS("CANVAS"),

  ANIMATION_EFFECT("ANIMATION_EFFECT"),

  LABEL("LABEL"),

  LANDING_PAGE_STRUCT("LANDING_PAGE_STRUCT"),

  COMPONENT("COMPONENT");

  private String value;

  ElementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ElementType fromValue(String text) {
    for (ElementType b : ElementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ElementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ElementType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ElementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ElementType.fromValue(String.valueOf(value));
    }
  }
}
