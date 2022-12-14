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
import org.openapitools.client.model.HotelsData200ResponseDataInnerLocation;

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
 * HotelsData200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class HotelsData200ResponseDataInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_CREDITCARD_REQUIRED = "creditcard_required";
  @SerializedName(SERIALIZED_NAME_CREDITCARD_REQUIRED)
  private Boolean creditcardRequired;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_HOTEL_DESCRIPTION = "hotel_description";
  @SerializedName(SERIALIZED_NAME_HOTEL_DESCRIPTION)
  private String hotelDescription;

  public static final String SERIALIZED_NAME_HOTEL_IMPORTANT_INFORMATION = "hotel_important_information";
  @SerializedName(SERIALIZED_NAME_HOTEL_IMPORTANT_INFORMATION)
  private String hotelImportantInformation;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private BigDecimal id;

  public static final String SERIALIZED_NAME_IS_CLOSED = "is_closed";
  @SerializedName(SERIALIZED_NAME_IS_CLOSED)
  private Boolean isClosed;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private HotelsData200ResponseDataInnerLocation location;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public HotelsData200ResponseDataInner() {
  }

  public HotelsData200ResponseDataInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4, rue Petit", value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public HotelsData200ResponseDataInner city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Paris", value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public HotelsData200ResponseDataInner country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fr", value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public HotelsData200ResponseDataInner creditcardRequired(Boolean creditcardRequired) {
    
    this.creditcardRequired = creditcardRequired;
    return this;
  }

   /**
   * Get creditcardRequired
   * @return creditcardRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getCreditcardRequired() {
    return creditcardRequired;
  }


  public void setCreditcardRequired(Boolean creditcardRequired) {
    this.creditcardRequired = creditcardRequired;
  }


  public HotelsData200ResponseDataInner currency(String currency) {
    
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


  public HotelsData200ResponseDataInner hotelDescription(String hotelDescription) {
    
    this.hotelDescription = hotelDescription;
    return this;
  }

   /**
   * Get hotelDescription
   * @return hotelDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getHotelDescription() {
    return hotelDescription;
  }


  public void setHotelDescription(String hotelDescription) {
    this.hotelDescription = hotelDescription;
  }


  public HotelsData200ResponseDataInner hotelImportantInformation(String hotelImportantInformation) {
    
    this.hotelImportantInformation = hotelImportantInformation;
    return this;
  }

   /**
   * Get hotelImportantInformation
   * @return hotelImportantInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getHotelImportantInformation() {
    return hotelImportantInformation;
  }


  public void setHotelImportantInformation(String hotelImportantInformation) {
    this.hotelImportantInformation = hotelImportantInformation;
  }


  public HotelsData200ResponseDataInner id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "499641", value = "")

  public BigDecimal getId() {
    return id;
  }


  public void setId(BigDecimal id) {
    this.id = id;
  }


  public HotelsData200ResponseDataInner isClosed(Boolean isClosed) {
    
    this.isClosed = isClosed;
    return this;
  }

   /**
   * Get isClosed
   * @return isClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsClosed() {
    return isClosed;
  }


  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }


  public HotelsData200ResponseDataInner location(HotelsData200ResponseDataInnerLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HotelsData200ResponseDataInnerLocation getLocation() {
    return location;
  }


  public void setLocation(HotelsData200ResponseDataInnerLocation location) {
    this.location = location;
  }


  public HotelsData200ResponseDataInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ibis Styles Paris Buttes Chaumont", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public HotelsData200ResponseDataInner zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75019", value = "")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    this.zip = zip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelsData200ResponseDataInner hotelsData200ResponseDataInner = (HotelsData200ResponseDataInner) o;
    return Objects.equals(this.address, hotelsData200ResponseDataInner.address) &&
        Objects.equals(this.city, hotelsData200ResponseDataInner.city) &&
        Objects.equals(this.country, hotelsData200ResponseDataInner.country) &&
        Objects.equals(this.creditcardRequired, hotelsData200ResponseDataInner.creditcardRequired) &&
        Objects.equals(this.currency, hotelsData200ResponseDataInner.currency) &&
        Objects.equals(this.hotelDescription, hotelsData200ResponseDataInner.hotelDescription) &&
        Objects.equals(this.hotelImportantInformation, hotelsData200ResponseDataInner.hotelImportantInformation) &&
        Objects.equals(this.id, hotelsData200ResponseDataInner.id) &&
        Objects.equals(this.isClosed, hotelsData200ResponseDataInner.isClosed) &&
        Objects.equals(this.location, hotelsData200ResponseDataInner.location) &&
        Objects.equals(this.name, hotelsData200ResponseDataInner.name) &&
        Objects.equals(this.zip, hotelsData200ResponseDataInner.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, country, creditcardRequired, currency, hotelDescription, hotelImportantInformation, id, isClosed, location, name, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelsData200ResponseDataInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    creditcardRequired: ").append(toIndentedString(creditcardRequired)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    hotelDescription: ").append(toIndentedString(hotelDescription)).append("\n");
    sb.append("    hotelImportantInformation: ").append(toIndentedString(hotelImportantInformation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("creditcard_required");
    openapiFields.add("currency");
    openapiFields.add("hotel_description");
    openapiFields.add("hotel_important_information");
    openapiFields.add("id");
    openapiFields.add("is_closed");
    openapiFields.add("location");
    openapiFields.add("name");
    openapiFields.add("zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HotelsData200ResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HotelsData200ResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelsData200ResponseDataInner is not found in the empty JSON string", HotelsData200ResponseDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HotelsData200ResponseDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelsData200ResponseDataInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("hotel_description") != null && !jsonObj.get("hotel_description").isJsonNull()) && !jsonObj.get("hotel_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotel_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotel_description").toString()));
      }
      if ((jsonObj.get("hotel_important_information") != null && !jsonObj.get("hotel_important_information").isJsonNull()) && !jsonObj.get("hotel_important_information").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotel_important_information` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotel_important_information").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        HotelsData200ResponseDataInnerLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelsData200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelsData200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelsData200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelsData200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelsData200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, HotelsData200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelsData200ResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HotelsData200ResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HotelsData200ResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to HotelsData200ResponseDataInner
  */
  public static HotelsData200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelsData200ResponseDataInner.class);
  }

 /**
  * Convert an instance of HotelsData200ResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

