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
import org.openapitools.client.model.HotelsSearch200ResponseDataInner;

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
 * HotelsSearch200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class HotelsSearch200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<HotelsSearch200ResponseDataInner> data = null;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public HotelsSearch200Response() {
  }

  public HotelsSearch200Response data(List<HotelsSearch200ResponseDataInner> data) {
    
    this.data = data;
    return this;
  }

  public HotelsSearch200Response addDataItem(HotelsSearch200ResponseDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"currency\":\"EUR\",\"hotelId\":\"1000018\",\"price\":91.49},{\"currency\":\"EUR\",\"hotelId\":\"436827\",\"price\":97.73},{\"currency\":\"EUR\",\"hotelId\":\"57871\",\"price\":51.49},{\"currency\":\"EUR\",\"hotelId\":\"99249\",\"price\":169.96},{\"currency\":\"EUR\",\"hotelId\":\"26191\",\"price\":210.26},{\"currency\":\"EUR\",\"hotelId\":\"99121\",\"price\":108},{\"currency\":\"EUR\",\"hotelId\":\"268206\",\"price\":128.2},{\"currency\":\"EUR\",\"hotelId\":\"99119\",\"price\":50.17},{\"currency\":\"EUR\",\"hotelId\":\"497829\",\"price\":88.22},{\"currency\":\"EUR\",\"hotelId\":\"28906\",\"price\":137.04},{\"currency\":\"EUR\",\"hotelId\":\"248093\",\"price\":115.26}]", value = "")

  public List<HotelsSearch200ResponseDataInner> getData() {
    return data;
  }


  public void setData(List<HotelsSearch200ResponseDataInner> data) {
    this.data = data;
  }


  public HotelsSearch200Response sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7D4JVAXY7CKGVBFC2CZGRXHS2Q", value = "")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelsSearch200Response hotelsSearch200Response = (HotelsSearch200Response) o;
    return Objects.equals(this.data, hotelsSearch200Response.data) &&
        Objects.equals(this.sessionId, hotelsSearch200Response.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelsSearch200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("session_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HotelsSearch200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HotelsSearch200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelsSearch200Response is not found in the empty JSON string", HotelsSearch200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HotelsSearch200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelsSearch200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            HotelsSearch200ResponseDataInner.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("session_id") != null && !jsonObj.get("session_id").isJsonNull()) && !jsonObj.get("session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelsSearch200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelsSearch200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelsSearch200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelsSearch200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelsSearch200Response>() {
           @Override
           public void write(JsonWriter out, HotelsSearch200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelsSearch200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HotelsSearch200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HotelsSearch200Response
  * @throws IOException if the JSON string is invalid with respect to HotelsSearch200Response
  */
  public static HotelsSearch200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelsSearch200Response.class);
  }

 /**
  * Convert an instance of HotelsSearch200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

