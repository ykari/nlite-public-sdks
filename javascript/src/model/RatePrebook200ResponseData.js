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
import RatePrebook200ResponseDataRoomTypesInner from './RatePrebook200ResponseDataRoomTypesInner';

/**
 * The RatePrebook200ResponseData model module.
 * @module model/RatePrebook200ResponseData
 * @version 1.0.0
 */
class RatePrebook200ResponseData {
    /**
     * Constructs a new <code>RatePrebook200ResponseData</code>.
     * @alias module:model/RatePrebook200ResponseData
     */
    constructor() { 
        
        RatePrebook200ResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RatePrebook200ResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RatePrebook200ResponseData} obj Optional instance to populate.
     * @return {module:model/RatePrebook200ResponseData} The populated <code>RatePrebook200ResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RatePrebook200ResponseData();

            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('hotelId')) {
                obj['hotelId'] = ApiClient.convertToType(data['hotelId'], 'String');
            }
            if (data.hasOwnProperty('prebookId')) {
                obj['prebookId'] = ApiClient.convertToType(data['prebookId'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('roomTypes')) {
                obj['roomTypes'] = ApiClient.convertToType(data['roomTypes'], [RatePrebook200ResponseDataRoomTypesInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RatePrebook200ResponseData</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RatePrebook200ResponseData</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['currency'] && !(typeof data['currency'] === 'string' || data['currency'] instanceof String)) {
            throw new Error("Expected the field `currency` to be a primitive type in the JSON string but got " + data['currency']);
        }
        // ensure the json data is a string
        if (data['hotelId'] && !(typeof data['hotelId'] === 'string' || data['hotelId'] instanceof String)) {
            throw new Error("Expected the field `hotelId` to be a primitive type in the JSON string but got " + data['hotelId']);
        }
        // ensure the json data is a string
        if (data['prebookId'] && !(typeof data['prebookId'] === 'string' || data['prebookId'] instanceof String)) {
            throw new Error("Expected the field `prebookId` to be a primitive type in the JSON string but got " + data['prebookId']);
        }
        if (data['roomTypes']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['roomTypes'])) {
                throw new Error("Expected the field `roomTypes` to be an array in the JSON data but got " + data['roomTypes']);
            }
            // validate the optional field `roomTypes` (array)
            for (const item of data['roomTypes']) {
                RatePrebook200ResponseDataRoomTypesInner.validateJsonObject(item);
            };
        }

        return true;
    }


}



/**
 * @member {String} currency
 */
RatePrebook200ResponseData.prototype['currency'] = undefined;

/**
 * @member {String} hotelId
 */
RatePrebook200ResponseData.prototype['hotelId'] = undefined;

/**
 * @member {String} prebookId
 */
RatePrebook200ResponseData.prototype['prebookId'] = undefined;

/**
 * @member {Number} price
 */
RatePrebook200ResponseData.prototype['price'] = undefined;

/**
 * @member {Array.<module:model/RatePrebook200ResponseDataRoomTypesInner>} roomTypes
 */
RatePrebook200ResponseData.prototype['roomTypes'] = undefined;






export default RatePrebook200ResponseData;

