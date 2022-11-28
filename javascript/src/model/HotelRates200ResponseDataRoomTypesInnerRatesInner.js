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
import HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies from './HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies';
import HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate from './HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate';

/**
 * The HotelRates200ResponseDataRoomTypesInnerRatesInner model module.
 * @module model/HotelRates200ResponseDataRoomTypesInnerRatesInner
 * @version 1.0.0
 */
class HotelRates200ResponseDataRoomTypesInnerRatesInner {
    /**
     * Constructs a new <code>HotelRates200ResponseDataRoomTypesInnerRatesInner</code>.
     * @alias module:model/HotelRates200ResponseDataRoomTypesInnerRatesInner
     */
    constructor() { 
        
        HotelRates200ResponseDataRoomTypesInnerRatesInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HotelRates200ResponseDataRoomTypesInnerRatesInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HotelRates200ResponseDataRoomTypesInnerRatesInner} obj Optional instance to populate.
     * @return {module:model/HotelRates200ResponseDataRoomTypesInnerRatesInner} The populated <code>HotelRates200ResponseDataRoomTypesInnerRatesInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HotelRates200ResponseDataRoomTypesInnerRatesInner();

            if (data.hasOwnProperty('cancellationPolicies')) {
                obj['cancellationPolicies'] = HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies.constructFromObject(data['cancellationPolicies']);
            }
            if (data.hasOwnProperty('maxOccupancy')) {
                obj['maxOccupancy'] = ApiClient.convertToType(data['maxOccupancy'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('rateId')) {
                obj['rateId'] = ApiClient.convertToType(data['rateId'], 'String');
            }
            if (data.hasOwnProperty('retailRate')) {
                obj['retailRate'] = HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate.constructFromObject(data['retailRate']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HotelRates200ResponseDataRoomTypesInnerRatesInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HotelRates200ResponseDataRoomTypesInnerRatesInner</code>.
     */
    static validateJSON(data) {
        // validate the optional field `cancellationPolicies`
        if (data['cancellationPolicies']) { // data not null
          HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies.validateJSON(data['cancellationPolicies']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['rateId'] && !(typeof data['rateId'] === 'string' || data['rateId'] instanceof String)) {
            throw new Error("Expected the field `rateId` to be a primitive type in the JSON string but got " + data['rateId']);
        }
        // validate the optional field `retailRate`
        if (data['retailRate']) { // data not null
          HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate.validateJSON(data['retailRate']);
        }

        return true;
    }


}



/**
 * @member {module:model/HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies} cancellationPolicies
 */
HotelRates200ResponseDataRoomTypesInnerRatesInner.prototype['cancellationPolicies'] = undefined;

/**
 * @member {Number} maxOccupancy
 */
HotelRates200ResponseDataRoomTypesInnerRatesInner.prototype['maxOccupancy'] = undefined;

/**
 * @member {String} name
 */
HotelRates200ResponseDataRoomTypesInnerRatesInner.prototype['name'] = undefined;

/**
 * @member {String} rateId
 */
HotelRates200ResponseDataRoomTypesInnerRatesInner.prototype['rateId'] = undefined;

/**
 * @member {module:model/HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate} retailRate
 */
HotelRates200ResponseDataRoomTypesInnerRatesInner.prototype['retailRate'] = undefined;






export default HotelRates200ResponseDataRoomTypesInnerRatesInner;
