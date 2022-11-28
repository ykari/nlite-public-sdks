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
import RateBook200ResponseDataHotelAddress from './RateBook200ResponseDataHotelAddress';
import RateBook200ResponseDataHotelLocation from './RateBook200ResponseDataHotelLocation';

/**
 * The RateBook200ResponseDataHotel model module.
 * @module model/RateBook200ResponseDataHotel
 * @version 1.0.0
 */
class RateBook200ResponseDataHotel {
    /**
     * Constructs a new <code>RateBook200ResponseDataHotel</code>.
     * @alias module:model/RateBook200ResponseDataHotel
     */
    constructor() { 
        
        RateBook200ResponseDataHotel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RateBook200ResponseDataHotel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RateBook200ResponseDataHotel} obj Optional instance to populate.
     * @return {module:model/RateBook200ResponseDataHotel} The populated <code>RateBook200ResponseDataHotel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RateBook200ResponseDataHotel();

            if (data.hasOwnProperty('address')) {
                obj['address'] = RateBook200ResponseDataHotelAddress.constructFromObject(data['address']);
            }
            if (data.hasOwnProperty('hotelId')) {
                obj['hotelId'] = ApiClient.convertToType(data['hotelId'], 'String');
            }
            if (data.hasOwnProperty('location')) {
                obj['location'] = RateBook200ResponseDataHotelLocation.constructFromObject(data['location']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('starRating')) {
                obj['starRating'] = ApiClient.convertToType(data['starRating'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RateBook200ResponseDataHotel</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RateBook200ResponseDataHotel</code>.
     */
    static validateJSON(data) {
        // validate the optional field `address`
        if (data['address']) { // data not null
          RateBook200ResponseDataHotelAddress.validateJSON(data['address']);
        }
        // ensure the json data is a string
        if (data['hotelId'] && !(typeof data['hotelId'] === 'string' || data['hotelId'] instanceof String)) {
            throw new Error("Expected the field `hotelId` to be a primitive type in the JSON string but got " + data['hotelId']);
        }
        // validate the optional field `location`
        if (data['location']) { // data not null
          RateBook200ResponseDataHotelLocation.validateJSON(data['location']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }

        return true;
    }


}



/**
 * @member {module:model/RateBook200ResponseDataHotelAddress} address
 */
RateBook200ResponseDataHotel.prototype['address'] = undefined;

/**
 * @member {String} hotelId
 */
RateBook200ResponseDataHotel.prototype['hotelId'] = undefined;

/**
 * @member {module:model/RateBook200ResponseDataHotelLocation} location
 */
RateBook200ResponseDataHotel.prototype['location'] = undefined;

/**
 * @member {String} name
 */
RateBook200ResponseDataHotel.prototype['name'] = undefined;

/**
 * @member {Number} starRating
 */
RateBook200ResponseDataHotel.prototype['starRating'] = undefined;






export default RateBook200ResponseDataHotel;

