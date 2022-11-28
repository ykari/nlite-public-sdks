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
import java.math.BigDecimal;
import org.openapitools.client.model.HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies;
import org.openapitools.client.model.HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate;

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
 * HotelRates200ResponseDataRoomTypesInnerRatesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class HotelRates200ResponseDataRoomTypesInnerRatesInner {
  public static final String SERIALIZED_NAME_CANCELLATION_POLICIES = "cancellationPolicies";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_POLICIES)
  private HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies;

  public static final String SERIALIZED_NAME_MAX_OCCUPANCY = "maxOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_OCCUPANCY)
  private BigDecimal maxOccupancy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RATE_ID = "rateId";
  @SerializedName(SERIALIZED_NAME_RATE_ID)
  private String rateId;

  public static final String SERIALIZED_NAME_RETAIL_RATE = "retailRate";
  @SerializedName(SERIALIZED_NAME_RETAIL_RATE)
  private HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate retailRate;

  public HotelRates200ResponseDataRoomTypesInnerRatesInner() {
  }

  public HotelRates200ResponseDataRoomTypesInnerRatesInner cancellationPolicies(HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies) {
    
    this.cancellationPolicies = cancellationPolicies;
    return this;
  }

   /**
   * Get cancellationPolicies
   * @return cancellationPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies getCancellationPolicies() {
    return cancellationPolicies;
  }


  public void setCancellationPolicies(HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
  }


  public HotelRates200ResponseDataRoomTypesInnerRatesInner maxOccupancy(BigDecimal maxOccupancy) {
    
    this.maxOccupancy = maxOccupancy;
    return this;
  }

   /**
   * Get maxOccupancy
   * @return maxOccupancy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public BigDecimal getMaxOccupancy() {
    return maxOccupancy;
  }


  public void setMaxOccupancy(BigDecimal maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }


  public HotelRates200ResponseDataRoomTypesInnerRatesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "King Room with Disability Access - Hearing Accessible - single occupancy - Non-refundable", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public HotelRates200ResponseDataRoomTypesInnerRatesInner rateId(String rateId) {
    
    this.rateId = rateId;
    return this;
  }

   /**
   * Get rateId
   * @return rateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1_GI4DSMBWPQZDAMRTFUYDCLJRGV6DEMBSGMWTAMJNGE3HYML4PRGUC7CHJE2EIU2NIJLUOTKZINDU2SSYI5MVQRCBJVBFCR2BLFCECSK2KNEECNCUIFHFEVCHIJIFIU2OJJJEOVK2IRJU4USXJQ2FSVRWJVJTOR2BKJKEKT2CLJDUCM2DI5KEWQQ", value = "")

  public String getRateId() {
    return rateId;
  }


  public void setRateId(String rateId) {
    this.rateId = rateId;
  }


  public HotelRates200ResponseDataRoomTypesInnerRatesInner retailRate(HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate retailRate) {
    
    this.retailRate = retailRate;
    return this;
  }

   /**
   * Get retailRate
   * @return retailRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate getRetailRate() {
    return retailRate;
  }


  public void setRetailRate(HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate retailRate) {
    this.retailRate = retailRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelRates200ResponseDataRoomTypesInnerRatesInner hotelRates200ResponseDataRoomTypesInnerRatesInner = (HotelRates200ResponseDataRoomTypesInnerRatesInner) o;
    return Objects.equals(this.cancellationPolicies, hotelRates200ResponseDataRoomTypesInnerRatesInner.cancellationPolicies) &&
        Objects.equals(this.maxOccupancy, hotelRates200ResponseDataRoomTypesInnerRatesInner.maxOccupancy) &&
        Objects.equals(this.name, hotelRates200ResponseDataRoomTypesInnerRatesInner.name) &&
        Objects.equals(this.rateId, hotelRates200ResponseDataRoomTypesInnerRatesInner.rateId) &&
        Objects.equals(this.retailRate, hotelRates200ResponseDataRoomTypesInnerRatesInner.retailRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationPolicies, maxOccupancy, name, rateId, retailRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRates200ResponseDataRoomTypesInnerRatesInner {\n");
    sb.append("    cancellationPolicies: ").append(toIndentedString(cancellationPolicies)).append("\n");
    sb.append("    maxOccupancy: ").append(toIndentedString(maxOccupancy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    retailRate: ").append(toIndentedString(retailRate)).append("\n");
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
    openapiFields.add("cancellationPolicies");
    openapiFields.add("maxOccupancy");
    openapiFields.add("name");
    openapiFields.add("rateId");
    openapiFields.add("retailRate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HotelRates200ResponseDataRoomTypesInnerRatesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HotelRates200ResponseDataRoomTypesInnerRatesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelRates200ResponseDataRoomTypesInnerRatesInner is not found in the empty JSON string", HotelRates200ResponseDataRoomTypesInnerRatesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HotelRates200ResponseDataRoomTypesInnerRatesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelRates200ResponseDataRoomTypesInnerRatesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `cancellationPolicies`
      if (jsonObj.get("cancellationPolicies") != null && !jsonObj.get("cancellationPolicies").isJsonNull()) {
        HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies.validateJsonObject(jsonObj.getAsJsonObject("cancellationPolicies"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("rateId") != null && !jsonObj.get("rateId").isJsonNull()) && !jsonObj.get("rateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateId").toString()));
      }
      // validate the optional field `retailRate`
      if (jsonObj.get("retailRate") != null && !jsonObj.get("retailRate").isJsonNull()) {
        HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate.validateJsonObject(jsonObj.getAsJsonObject("retailRate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelRates200ResponseDataRoomTypesInnerRatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelRates200ResponseDataRoomTypesInnerRatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelRates200ResponseDataRoomTypesInnerRatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelRates200ResponseDataRoomTypesInnerRatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelRates200ResponseDataRoomTypesInnerRatesInner>() {
           @Override
           public void write(JsonWriter out, HotelRates200ResponseDataRoomTypesInnerRatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelRates200ResponseDataRoomTypesInnerRatesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HotelRates200ResponseDataRoomTypesInnerRatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HotelRates200ResponseDataRoomTypesInnerRatesInner
  * @throws IOException if the JSON string is invalid with respect to HotelRates200ResponseDataRoomTypesInnerRatesInner
  */
  public static HotelRates200ResponseDataRoomTypesInnerRatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelRates200ResponseDataRoomTypesInnerRatesInner.class);
  }

 /**
  * Convert an instance of HotelRates200ResponseDataRoomTypesInnerRatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

