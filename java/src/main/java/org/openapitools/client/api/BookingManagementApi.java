/*
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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BookingManagementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BookingManagementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BookingManagementApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for bookingsBookingIdDelete
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful cancel </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call bookingsBookingIdDeleteCall(String bookingId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bookings/{bookingId}"
            .replace("{" + "bookingId" + "}", localVarApiClient.escapeString(bookingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bookingsBookingIdDeleteValidateBeforeCall(String bookingId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bookingId' is set
        if (bookingId == null) {
            throw new ApiException("Missing the required parameter 'bookingId' when calling bookingsBookingIdDelete(Async)");
        }

        return bookingsBookingIdDeleteCall(bookingId, _callback);

    }

    /**
     * Cancel booking
     * This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful cancel </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public Object bookingsBookingIdDelete(String bookingId) throws ApiException {
        ApiResponse<Object> localVarResp = bookingsBookingIdDeleteWithHttpInfo(bookingId);
        return localVarResp.getData();
    }

    /**
     * Cancel booking
     * This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful cancel </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Object> bookingsBookingIdDeleteWithHttpInfo(String bookingId) throws ApiException {
        okhttp3.Call localVarCall = bookingsBookingIdDeleteValidateBeforeCall(bookingId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel booking (asynchronously)
     * This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful cancel </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call bookingsBookingIdDeleteAsync(String bookingId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = bookingsBookingIdDeleteValidateBeforeCall(bookingId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for bookingsBookingIdGet
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call bookingsBookingIdGetCall(String bookingId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/bookings/{bookingId}"
            .replace("{" + "bookingId" + "}", localVarApiClient.escapeString(bookingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bookingsBookingIdGetValidateBeforeCall(String bookingId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bookingId' is set
        if (bookingId == null) {
            throw new ApiException("Missing the required parameter 'bookingId' when calling bookingsBookingIdGet(Async)");
        }

        return bookingsBookingIdGetCall(bookingId, _callback);

    }

    /**
     * Retrieve booking
     * This endpoint allows you to retrieve all the information for specific booking ID.
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public Object bookingsBookingIdGet(String bookingId) throws ApiException {
        ApiResponse<Object> localVarResp = bookingsBookingIdGetWithHttpInfo(bookingId);
        return localVarResp.getData();
    }

    /**
     * Retrieve booking
     * This endpoint allows you to retrieve all the information for specific booking ID.
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Object> bookingsBookingIdGetWithHttpInfo(String bookingId) throws ApiException {
        okhttp3.Call localVarCall = bookingsBookingIdGetValidateBeforeCall(bookingId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve booking (asynchronously)
     * This endpoint allows you to retrieve all the information for specific booking ID.
     * @param bookingId (Required) The unique identifier of the booking you would like to update. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call bookingsBookingIdGetAsync(String bookingId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = bookingsBookingIdGetValidateBeforeCall(bookingId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
