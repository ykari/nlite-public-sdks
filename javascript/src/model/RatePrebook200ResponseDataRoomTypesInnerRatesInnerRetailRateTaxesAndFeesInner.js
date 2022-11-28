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
 * The RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner model module.
 * @module model/RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner
 * @version 1.0.0
 */
class RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner {
    /**
     * Constructs a new <code>RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner</code>.
     * @alias module:model/RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner
     */
    constructor() { 
        
        RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner} obj Optional instance to populate.
     * @return {module:model/RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner} The populated <code>RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner();

            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('included')) {
                obj['included'] = ApiClient.convertToType(data['included'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['currency'] && !(typeof data['currency'] === 'string' || data['currency'] instanceof String)) {
            throw new Error("Expected the field `currency` to be a primitive type in the JSON string but got " + data['currency']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }

        return true;
    }


}



/**
 * @member {Number} amount
 */
RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.prototype['amount'] = undefined;

/**
 * @member {String} currency
 */
RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.prototype['currency'] = undefined;

/**
 * @member {String} description
 */
RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.prototype['description'] = undefined;

/**
 * @member {Boolean} included
 */
RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.prototype['included'] = undefined;






export default RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner;

