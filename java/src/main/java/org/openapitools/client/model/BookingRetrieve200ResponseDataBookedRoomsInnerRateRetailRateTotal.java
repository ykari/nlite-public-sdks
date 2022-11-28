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
 * BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal() {
  }

  public BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "83.38", value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EUR", value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal bookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal = (BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal) o;
    return Objects.equals(this.amount, bookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.amount) &&
        Objects.equals(this.currency, bookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal is not found in the empty JSON string", BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.class));

       return (TypeAdapter<T>) new TypeAdapter<BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal>() {
           @Override
           public void write(JsonWriter out, BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal
  * @throws IOException if the JSON string is invalid with respect to BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal
  */
  public static BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.class);
  }

 /**
  * Convert an instance of BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

