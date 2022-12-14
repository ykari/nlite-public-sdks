/**
 * Lite API
 * lite api hotel booking api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.math.BigDecimal;
import org.openapitools.client.model.GetData200Response;
import org.openapitools.client.model.HotelsPostRequest;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class HotelsApi {
  String basePath = "https://api.nlite.ml/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Search by Destination/Hotel
  * 
   * @param countryCode country code Alpha-2 code (example US, RU, CN)
   * @param hotelName hotel name
   * @param cityName city name
   * @param limit limit results (max value 1000)
   * @param offset results offset
   * @param latitude latitude geo coordinates
   * @param longitude longtude geo coordinates
   * @param distance the distance starting from the selected geopgraphic point
   * @return GetData200Response
  */
  public GetData200Response getData (String countryCode, String hotelName, String cityName, BigDecimal limit, BigDecimal offset, BigDecimal latitude, BigDecimal longitude, BigDecimal distance) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getData",
        new ApiException(400, "Missing the required parameter 'countryCode' when calling getData"));
    }

    // create path and map variables
    String path = "/data";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "hotelName", hotelName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cityName", cityName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "latitude", latitude));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "longitude", longitude));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "distance", distance));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (GetData200Response) ApiInvoker.deserialize(localVarResponse, "", GetData200Response.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Search by Destination/Hotel
   * 
   * @param countryCode country code Alpha-2 code (example US, RU, CN)   * @param hotelName hotel name   * @param cityName city name   * @param limit limit results (max value 1000)   * @param offset results offset   * @param latitude latitude geo coordinates   * @param longitude longtude geo coordinates   * @param distance the distance starting from the selected geopgraphic point
  */
  public void getData (String countryCode, String hotelName, String cityName, BigDecimal limit, BigDecimal offset, BigDecimal latitude, BigDecimal longitude, BigDecimal distance, final Response.Listener<GetData200Response> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'countryCode' when calling getData",
        new ApiException(400, "Missing the required parameter 'countryCode' when calling getData"));
    }

    // create path and map variables
    String path = "/data".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "hotelName", hotelName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cityName", cityName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "countryCode", countryCode));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "latitude", latitude));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "longitude", longitude));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "distance", distance));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GetData200Response) ApiInvoker.deserialize(localVarResponse,  "", GetData200Response.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get Room Availability &amp; Rates for a Hotel ID
  * This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.
   * @param hotelId 
   * @param rid 
   * @param xid 
   * @param checkin 
   * @param checkout 
   * @param adults 
   * @param guestNationality 
   * @param currency 
   * @param sessionId 
   * @return Object
  */
  public Object hotelsHotelIdGet (Integer hotelId, String rid, String xid, String checkin, String checkout, Integer adults, String guestNationality, String currency, String sessionId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'hotelId' is set
    if (hotelId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hotelId' when calling hotelsHotelIdGet",
        new ApiException(400, "Missing the required parameter 'hotelId' when calling hotelsHotelIdGet"));
    }

    // create path and map variables
    String path = "/hotels/{hotelId}".replaceAll("\\{" + "hotelId" + "\\}", apiInvoker.escapeString(hotelId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "checkin", checkin));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "checkout", checkout));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "adults", adults));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "guestNationality", guestNationality));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sessionId", sessionId));
    headerParams.put("rid", ApiInvoker.parameterToString(rid));
    headerParams.put("xid", ApiInvoker.parameterToString(xid));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get Room Availability &amp; Rates for a Hotel ID
   * This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.
   * @param hotelId    * @param rid    * @param xid    * @param checkin    * @param checkout    * @param adults    * @param guestNationality    * @param currency    * @param sessionId 
  */
  public void hotelsHotelIdGet (Integer hotelId, String rid, String xid, String checkin, String checkout, Integer adults, String guestNationality, String currency, String sessionId, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'hotelId' is set
    if (hotelId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'hotelId' when calling hotelsHotelIdGet",
        new ApiException(400, "Missing the required parameter 'hotelId' when calling hotelsHotelIdGet"));
    }

    // create path and map variables
    String path = "/hotels/{hotelId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "hotelId" + "\\}", apiInvoker.escapeString(hotelId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "checkin", checkin));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "checkout", checkout));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "adults", adults));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "guestNationality", guestNationality));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sessionId", sessionId));

    headerParams.put("rid", ApiInvoker.parameterToString(rid));
    headerParams.put("xid", ApiInvoker.parameterToString(xid));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get Minimum Price for Available Hotels
  * This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels.
   * @param rid 
   * @param hotelsPostRequest 
   * @return Object
  */
  public Object hotelsPost (String rid, HotelsPostRequest hotelsPostRequest) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = hotelsPostRequest;

    // create path and map variables
    String path = "/hotels";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("rid", ApiInvoker.parameterToString(rid));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get Minimum Price for Available Hotels
   * This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels.
   * @param rid    * @param hotelsPostRequest 
  */
  public void hotelsPost (String rid, HotelsPostRequest hotelsPostRequest, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = hotelsPostRequest;


    // create path and map variables
    String path = "/hotels".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("rid", ApiInvoker.parameterToString(rid));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "ApiKeyAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
