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

/**
 * The HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner model module.
 * @module model/HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner
 * @version 1.0.0
 */
class HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner {
    /**
     * Constructs a new <code>HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner</code>.
     * @alias module:model/HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner
     */
    constructor() { 
        
        HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner} obj Optional instance to populate.
     * @return {module:model/HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner} The populated <code>HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner();

            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
            if (data.hasOwnProperty('cancelTime')) {
                obj['cancelTime'] = ApiClient.convertToType(data['cancelTime'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['cancelTime'] && !(typeof data['cancelTime'] === 'string' || data['cancelTime'] instanceof String)) {
            throw new Error("Expected the field `cancelTime` to be a primitive type in the JSON string but got " + data['cancelTime']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }

        return true;
    }


}



/**
 * @member {Number} amount
 */
HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.prototype['amount'] = undefined;

/**
 * @member {String} cancelTime
 */
HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.prototype['cancelTime'] = undefined;

/**
 * @member {String} type
 */
HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.prototype['type'] = undefined;






export default HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner;

