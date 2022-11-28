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
import org.openapitools.client.model.RateBook200ResponseDataBookedRoomsInnerRateRetailRateTotal;

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
 * RateBook200ResponseDataBookedRoomsInnerRateRetailRate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class RateBook200ResponseDataBookedRoomsInnerRateRetailRate {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private RateBook200ResponseDataBookedRoomsInnerRateRetailRateTotal total;

  public RateBook200ResponseDataBookedRoomsInnerRateRetailRate() {
  }

  public RateBook200ResponseDataBookedRoomsInnerRateRetailRate total(RateBook200ResponseDataBookedRoomsInnerRateRetailRateTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RateBook200ResponseDataBookedRoomsInnerRateRetailRateTotal getTotal() {
    return total;
  }


  public void setTotal(RateBook200ResponseDataBookedRoomsInnerRateRetailRateTotal total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateBook200ResponseDataBookedRoomsInnerRateRetailRate rateBook200ResponseDataBookedRoomsInnerRateRetailRate = (RateBook200ResponseDataBookedRoomsInnerRateRetailRate) o;
    return Objects.equals(this.total, rateBook200ResponseDataBookedRoomsInnerRateRetailRate.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateBook200ResponseDataBookedRoomsInnerRateRetailRate {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateBook200ResponseDataBookedRoomsInnerRateRetailRate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RateBook200ResponseDataBookedRoomsInnerRateRetailRate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateBook200ResponseDataBookedRoomsInnerRateRetailRate is not found in the empty JSON string", RateBook200ResponseDataBookedRoomsInnerRateRetailRate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RateBook200ResponseDataBookedRoomsInnerRateRetailRate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateBook200ResponseDataBookedRoomsInnerRateRetailRate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `total`
      if (jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) {
        RateBook200ResponseDataBookedRoomsInnerRateRetailRateTotal.validateJsonObject(jsonObj.getAsJsonObject("total"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateBook200ResponseDataBookedRoomsInnerRateRetailRate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateBook200ResponseDataBookedRoomsInnerRateRetailRate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateBook200ResponseDataBookedRoomsInnerRateRetailRate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateBook200ResponseDataBookedRoomsInnerRateRetailRate.class));

       return (TypeAdapter<T>) new TypeAdapter<RateBook200ResponseDataBookedRoomsInnerRateRetailRate>() {
           @Override
           public void write(JsonWriter out, RateBook200ResponseDataBookedRoomsInnerRateRetailRate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateBook200ResponseDataBookedRoomsInnerRateRetailRate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateBook200ResponseDataBookedRoomsInnerRateRetailRate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateBook200ResponseDataBookedRoomsInnerRateRetailRate
  * @throws IOException if the JSON string is invalid with respect to RateBook200ResponseDataBookedRoomsInnerRateRetailRate
  */
  public static RateBook200ResponseDataBookedRoomsInnerRateRetailRate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateBook200ResponseDataBookedRoomsInnerRateRetailRate.class);
  }

 /**
  * Convert an instance of RateBook200ResponseDataBookedRoomsInnerRateRetailRate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

