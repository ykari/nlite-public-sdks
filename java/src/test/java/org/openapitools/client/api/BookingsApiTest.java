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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BookingRetrieve200Response;
import org.openapitools.client.model.BookingRetrieve400Response;
import org.openapitools.client.model.RateBook200Response;
import org.openapitools.client.model.RateBookRequest;
import org.openapitools.client.model.RatePrebook200Response;
import org.openapitools.client.model.RatePrebookRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookingsApi
 */
@Disabled
public class BookingsApiTest {

    private final BookingsApi api = new BookingsApi();

    /**
     * booking cancel
     *
     * &lt;!-- theme: danger --&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bookingCancelTest() throws ApiException {
        String bookingId = null;
        api.bookingCancel(bookingId);
        // TODO: test validations
    }

    /**
     * booking retrieve
     *
     * Returns all details for the specified booking.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bookingRetrieveTest() throws ApiException {
        String bookingId = null;
        BookingRetrieve200Response response = api.bookingRetrieve(bookingId);
        // TODO: test validations
    }

    /**
     * rate book
     *
     * rate book
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rateBookTest() throws ApiException {
        RateBookRequest rateBookRequest = null;
        RateBook200Response response = api.rateBook(rateBookRequest);
        // TODO: test validations
    }

    /**
     * rate prebook
     *
     * rate prebook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ratePrebookTest() throws ApiException {
        RatePrebookRequest ratePrebookRequest = null;
        RatePrebook200Response response = api.ratePrebook(ratePrebookRequest);
        // TODO: test validations
    }

}
