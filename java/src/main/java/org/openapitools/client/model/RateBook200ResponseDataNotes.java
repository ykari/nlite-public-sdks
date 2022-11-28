/*
 * nlite API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RateBook200ResponseDataNotes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class RateBook200ResponseDataNotes {
  public static final String SERIALIZED_NAME_FROM_GUEST = "fromGuest";
  @SerializedName(SERIALIZED_NAME_FROM_GUEST)
  private String fromGuest;

  public static final String SERIALIZED_NAME_FROM_SELLER = "fromSeller";
  @SerializedName(SERIALIZED_NAME_FROM_SELLER)
  private String fromSeller;

  public RateBook200ResponseDataNotes() {
  }

  public RateBook200ResponseDataNotes fromGuest(String fromGuest) {
    
    this.fromGuest = fromGuest;
    return this;
  }

   /**
   * Get fromGuest
   * @return fromGuest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getFromGuest() {
    return fromGuest;
  }


  public void setFromGuest(String fromGuest) {
    this.fromGuest = fromGuest;
  }


  public RateBook200ResponseDataNotes fromSeller(String fromSeller) {
    
    this.fromSeller = fromSeller;
    return this;
  }

   /**
   * Get fromSeller
   * @return fromSeller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getFromSeller() {
    return fromSeller;
  }


  public void setFromSeller(String fromSeller) {
    this.fromSeller = fromSeller;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateBook200ResponseDataNotes rateBook200ResponseDataNotes = (RateBook200ResponseDataNotes) o;
    return Objects.equals(this.fromGuest, rateBook200ResponseDataNotes.fromGuest) &&
        Objects.equals(this.fromSeller, rateBook200ResponseDataNotes.fromSeller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromGuest, fromSeller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateBook200ResponseDataNotes {\n");
    sb.append("    fromGuest: ").append(toIndentedString(fromGuest)).append("\n");
    sb.append("    fromSeller: ").append(toIndentedString(fromSeller)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("fromGuest");
    openapiFields.add("fromSeller");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateBook200ResponseDataNotes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RateBook200ResponseDataNotes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateBook200ResponseDataNotes is not found in the empty JSON string", RateBook200ResponseDataNotes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RateBook200ResponseDataNotes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateBook200ResponseDataNotes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fromGuest") != null && !jsonObj.get("fromGuest").isJsonNull()) && !jsonObj.get("fromGuest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromGuest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromGuest").toString()));
      }
      if ((jsonObj.get("fromSeller") != null && !jsonObj.get("fromSeller").isJsonNull()) && !jsonObj.get("fromSeller").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromSeller` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromSeller").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateBook200ResponseDataNotes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateBook200ResponseDataNotes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateBook200ResponseDataNotes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateBook200ResponseDataNotes.class));

       return (TypeAdapter<T>) new TypeAdapter<RateBook200ResponseDataNotes>() {
           @Override
           public void write(JsonWriter out, RateBook200ResponseDataNotes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateBook200ResponseDataNotes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateBook200ResponseDataNotes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateBook200ResponseDataNotes
  * @throws IOException if the JSON string is invalid with respect to RateBook200ResponseDataNotes
  */
  public static RateBook200ResponseDataNotes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateBook200ResponseDataNotes.class);
  }

 /**
  * Convert an instance of RateBook200ResponseDataNotes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

