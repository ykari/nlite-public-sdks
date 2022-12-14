/**
 * nlite API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BookingRetrieve200ResponseData from './BookingRetrieve200ResponseData';

/**
 * The BookingRetrieve200Response model module.
 * @module model/BookingRetrieve200Response
 * @version 1.0.0
 */
class BookingRetrieve200Response {
    /**
     * Constructs a new <code>BookingRetrieve200Response</code>.
     * @alias module:model/BookingRetrieve200Response
     */
    constructor() { 
        
        BookingRetrieve200Response.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BookingRetrieve200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BookingRetrieve200Response} obj Optional instance to populate.
     * @return {module:model/BookingRetrieve200Response} The populated <code>BookingRetrieve200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BookingRetrieve200Response();

            if (data.hasOwnProperty('data')) {
                obj['data'] = BookingRetrieve200ResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BookingRetrieve200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BookingRetrieve200Response</code>.
     */
    static validateJSON(data) {
        // validate the optional field `data`
        if (data['data']) { // data not null
          BookingRetrieve200ResponseData.validateJSON(data['data']);
        }

        return true;
    }


}



/**
 * @member {module:model/BookingRetrieve200ResponseData} data
 */
BookingRetrieve200Response.prototype['data'] = undefined;






export default BookingRetrieve200Response;

