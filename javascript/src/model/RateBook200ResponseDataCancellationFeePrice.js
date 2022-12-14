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
 * The RateBook200ResponseDataCancellationFeePrice model module.
 * @module model/RateBook200ResponseDataCancellationFeePrice
 * @version 1.0.0
 */
class RateBook200ResponseDataCancellationFeePrice {
    /**
     * Constructs a new <code>RateBook200ResponseDataCancellationFeePrice</code>.
     * @alias module:model/RateBook200ResponseDataCancellationFeePrice
     */
    constructor() { 
        
        RateBook200ResponseDataCancellationFeePrice.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RateBook200ResponseDataCancellationFeePrice</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RateBook200ResponseDataCancellationFeePrice} obj Optional instance to populate.
     * @return {module:model/RateBook200ResponseDataCancellationFeePrice} The populated <code>RateBook200ResponseDataCancellationFeePrice</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RateBook200ResponseDataCancellationFeePrice();

            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RateBook200ResponseDataCancellationFeePrice</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RateBook200ResponseDataCancellationFeePrice</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['currency'] && !(typeof data['currency'] === 'string' || data['currency'] instanceof String)) {
            throw new Error("Expected the field `currency` to be a primitive type in the JSON string but got " + data['currency']);
        }

        return true;
    }


}



/**
 * @member {Number} amount
 */
RateBook200ResponseDataCancellationFeePrice.prototype['amount'] = undefined;

/**
 * @member {String} currency
 */
RateBook200ResponseDataCancellationFeePrice.prototype['currency'] = undefined;






export default RateBook200ResponseDataCancellationFeePrice;

