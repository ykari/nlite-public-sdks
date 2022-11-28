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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner;
import org.openapitools.client.model.RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTotalInner;

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
 * RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate {
  public static final String SERIALIZED_NAME_TAXES_AND_FEES = "taxesAndFees";
  @SerializedName(SERIALIZED_NAME_TAXES_AND_FEES)
  private List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner> taxesAndFees = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTotalInner> total = null;

  public RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate() {
  }

  public RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate taxesAndFees(List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner> taxesAndFees) {
    
    this.taxesAndFees = taxesAndFees;
    return this;
  }

  public RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate addTaxesAndFeesItem(RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner taxesAndFeesItem) {
    if (this.taxesAndFees == null) {
      this.taxesAndFees = new ArrayList<>();
    }
    this.taxesAndFees.add(taxesAndFeesItem);
    return this;
  }

   /**
   * Get taxesAndFees
   * @return taxesAndFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"amount\":0,\"currency\":\"EUR\",\"description\":\"roomTax\",\"included\":true},{\"amount\":0,\"currency\":\"EUR\",\"description\":\"salesTax\",\"included\":true},{\"amount\":0,\"currency\":\"EUR\",\"description\":\"otherCharges\",\"included\":true}]", value = "")

  public List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner> getTaxesAndFees() {
    return taxesAndFees;
  }


  public void setTaxesAndFees(List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner> taxesAndFees) {
    this.taxesAndFees = taxesAndFees;
  }


  public RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate total(List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTotalInner> total) {
    
    this.total = total;
    return this;
  }

  public RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate addTotalItem(RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTotalInner totalItem) {
    if (this.total == null) {
      this.total = new ArrayList<>();
    }
    this.total.add(totalItem);
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"amount\":137.02458727256,\"currency\":\"EUR\"}]", value = "")

  public List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTotalInner> getTotal() {
    return total;
  }


  public void setTotal(List<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTotalInner> total) {
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
    RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate ratePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate = (RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate) o;
    return Objects.equals(this.taxesAndFees, ratePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.taxesAndFees) &&
        Objects.equals(this.total, ratePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxesAndFees, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate {\n");
    sb.append("    taxesAndFees: ").append(toIndentedString(taxesAndFees)).append("\n");
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
    openapiFields.add("taxesAndFees");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate is not found in the empty JSON string", RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("taxesAndFees") != null && !jsonObj.get("taxesAndFees").isJsonNull()) {
        JsonArray jsonArraytaxesAndFees = jsonObj.getAsJsonArray("taxesAndFees");
        if (jsonArraytaxesAndFees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taxesAndFees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taxesAndFees` to be an array in the JSON string but got `%s`", jsonObj.get("taxesAndFees").toString()));
          }

          // validate the optional field `taxesAndFees` (array)
          for (int i = 0; i < jsonArraytaxesAndFees.size(); i++) {
            RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.validateJsonObject(jsonArraytaxesAndFees.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("total") != null && !jsonObj.get("total").isJsonNull()) {
        JsonArray jsonArraytotal = jsonObj.getAsJsonArray("total");
        if (jsonArraytotal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("total").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `total` to be an array in the JSON string but got `%s`", jsonObj.get("total").toString()));
          }

          // validate the optional field `total` (array)
          for (int i = 0; i < jsonArraytotal.size(); i++) {
            RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTotalInner.validateJsonObject(jsonArraytotal.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.class));

       return (TypeAdapter<T>) new TypeAdapter<RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate>() {
           @Override
           public void write(JsonWriter out, RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate
  * @throws IOException if the JSON string is invalid with respect to RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate
  */
  public static RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate.class);
  }

 /**
  * Convert an instance of RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

