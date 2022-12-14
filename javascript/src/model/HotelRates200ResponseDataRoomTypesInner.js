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
import HotelRates200ResponseDataRoomTypesInnerRatesInner from './HotelRates200ResponseDataRoomTypesInnerRatesInner';

/**
 * The HotelRates200ResponseDataRoomTypesInner model module.
 * @module model/HotelRates200ResponseDataRoomTypesInner
 * @version 1.0.0
 */
class HotelRates200ResponseDataRoomTypesInner {
    /**
     * Constructs a new <code>HotelRates200ResponseDataRoomTypesInner</code>.
     * @alias module:model/HotelRates200ResponseDataRoomTypesInner
     */
    constructor() { 
        
        HotelRates200ResponseDataRoomTypesInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HotelRates200ResponseDataRoomTypesInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HotelRates200ResponseDataRoomTypesInner} obj Optional instance to populate.
     * @return {module:model/HotelRates200ResponseDataRoomTypesInner} The populated <code>HotelRates200ResponseDataRoomTypesInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HotelRates200ResponseDataRoomTypesInner();

            if (data.hasOwnProperty('maxOccupancy')) {
                obj['maxOccupancy'] = ApiClient.convertToType(data['maxOccupancy'], 'Number');
            }
            if (data.hasOwnProperty('rates')) {
                obj['rates'] = ApiClient.convertToType(data['rates'], [HotelRates200ResponseDataRoomTypesInnerRatesInner]);
            }
            if (data.hasOwnProperty('roomTypeId')) {
                obj['roomTypeId'] = ApiClient.convertToType(data['roomTypeId'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HotelRates200ResponseDataRoomTypesInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HotelRates200ResponseDataRoomTypesInner</code>.
     */
    static validateJSON(data) {
        if (data['rates']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['rates'])) {
                throw new Error("Expected the field `rates` to be an array in the JSON data but got " + data['rates']);
            }
            // validate the optional field `rates` (array)
            for (const item of data['rates']) {
                HotelRates200ResponseDataRoomTypesInnerRatesInner.validateJsonObject(item);
            };
        }
        // ensure the json data is a string
        if (data['roomTypeId'] && !(typeof data['roomTypeId'] === 'string' || data['roomTypeId'] instanceof String)) {
            throw new Error("Expected the field `roomTypeId` to be a primitive type in the JSON string but got " + data['roomTypeId']);
        }

        return true;
    }


}



/**
 * @member {Number} maxOccupancy
 */
HotelRates200ResponseDataRoomTypesInner.prototype['maxOccupancy'] = undefined;

/**
 * @member {Array.<module:model/HotelRates200ResponseDataRoomTypesInnerRatesInner>} rates
 */
HotelRates200ResponseDataRoomTypesInner.prototype['rates'] = undefined;

/**
 * @member {String} roomTypeId
 */
HotelRates200ResponseDataRoomTypesInner.prototype['roomTypeId'] = undefined;






export default HotelRates200ResponseDataRoomTypesInner;

