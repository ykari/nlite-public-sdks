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
 * The RatePrebookRequest model module.
 * @module model/RatePrebookRequest
 * @version 1.0.0
 */
class RatePrebookRequest {
    /**
     * Constructs a new <code>RatePrebookRequest</code>.
     * @alias module:model/RatePrebookRequest
     */
    constructor() { 
        
        RatePrebookRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RatePrebookRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RatePrebookRequest} obj Optional instance to populate.
     * @return {module:model/RatePrebookRequest} The populated <code>RatePrebookRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RatePrebookRequest();

            if (data.hasOwnProperty('rateId')) {
                obj['rateId'] = ApiClient.convertToType(data['rateId'], 'String');
            }
            if (data.hasOwnProperty('sessionId')) {
                obj['sessionId'] = ApiClient.convertToType(data['sessionId'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RatePrebookRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RatePrebookRequest</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['rateId'] && !(typeof data['rateId'] === 'string' || data['rateId'] instanceof String)) {
            throw new Error("Expected the field `rateId` to be a primitive type in the JSON string but got " + data['rateId']);
        }
        // ensure the json data is a string
        if (data['sessionId'] && !(typeof data['sessionId'] === 'string' || data['sessionId'] instanceof String)) {
            throw new Error("Expected the field `sessionId` to be a primitive type in the JSON string but got " + data['sessionId']);
        }

        return true;
    }


}



/**
 * @member {String} rateId
 */
RatePrebookRequest.prototype['rateId'] = undefined;

/**
 * @member {String} sessionId
 */
RatePrebookRequest.prototype['sessionId'] = undefined;






export default RatePrebookRequest;

