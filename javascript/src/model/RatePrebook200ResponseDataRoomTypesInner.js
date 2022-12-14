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
import RatePrebook200ResponseDataRoomTypesInnerRatesInner from './RatePrebook200ResponseDataRoomTypesInnerRatesInner';

/**
 * The RatePrebook200ResponseDataRoomTypesInner model module.
 * @module model/RatePrebook200ResponseDataRoomTypesInner
 * @version 1.0.0
 */
class RatePrebook200ResponseDataRoomTypesInner {
    /**
     * Constructs a new <code>RatePrebook200ResponseDataRoomTypesInner</code>.
     * @alias module:model/RatePrebook200ResponseDataRoomTypesInner
     */
    constructor() { 
        
        RatePrebook200ResponseDataRoomTypesInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RatePrebook200ResponseDataRoomTypesInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RatePrebook200ResponseDataRoomTypesInner} obj Optional instance to populate.
     * @return {module:model/RatePrebook200ResponseDataRoomTypesInner} The populated <code>RatePrebook200ResponseDataRoomTypesInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RatePrebook200ResponseDataRoomTypesInner();

            if (data.hasOwnProperty('maxOccupancy')) {
                obj['maxOccupancy'] = ApiClient.convertToType(data['maxOccupancy'], 'Number');
            }
            if (data.hasOwnProperty('rates')) {
                obj['rates'] = ApiClient.convertToType(data['rates'], [RatePrebook200ResponseDataRoomTypesInnerRatesInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RatePrebook200ResponseDataRoomTypesInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RatePrebook200ResponseDataRoomTypesInner</code>.
     */
    static validateJSON(data) {
        if (data['rates']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['rates'])) {
                throw new Error("Expected the field `rates` to be an array in the JSON data but got " + data['rates']);
            }
            // validate the optional field `rates` (array)
            for (const item of data['rates']) {
                RatePrebook200ResponseDataRoomTypesInnerRatesInner.validateJsonObject(item);
            };
        }

        return true;
    }


}



/**
 * @member {Number} maxOccupancy
 */
RatePrebook200ResponseDataRoomTypesInner.prototype['maxOccupancy'] = undefined;

/**
 * @member {Array.<module:model/RatePrebook200ResponseDataRoomTypesInnerRatesInner>} rates
 */
RatePrebook200ResponseDataRoomTypesInner.prototype['rates'] = undefined;






export default RatePrebook200ResponseDataRoomTypesInner;

