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
import RateBookRequestContact from './RateBookRequestContact';

/**
 * The RateBookRequest model module.
 * @module model/RateBookRequest
 * @version 1.0.0
 */
class RateBookRequest {
    /**
     * Constructs a new <code>RateBookRequest</code>.
     * @alias module:model/RateBookRequest
     */
    constructor() { 
        
        RateBookRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RateBookRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RateBookRequest} obj Optional instance to populate.
     * @return {module:model/RateBookRequest} The populated <code>RateBookRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RateBookRequest();

            if (data.hasOwnProperty('contact')) {
                obj['contact'] = RateBookRequestContact.constructFromObject(data['contact']);
            }
            if (data.hasOwnProperty('prebookId')) {
                obj['prebookId'] = ApiClient.convertToType(data['prebookId'], 'String');
            }
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
     * Validates the JSON data with respect to <code>RateBookRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RateBookRequest</code>.
     */
    static validateJSON(data) {
        // validate the optional field `contact`
        if (data['contact']) { // data not null
          RateBookRequestContact.validateJSON(data['contact']);
        }
        // ensure the json data is a string
        if (data['prebookId'] && !(typeof data['prebookId'] === 'string' || data['prebookId'] instanceof String)) {
            throw new Error("Expected the field `prebookId` to be a primitive type in the JSON string but got " + data['prebookId']);
        }
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
 * @member {module:model/RateBookRequestContact} contact
 */
RateBookRequest.prototype['contact'] = undefined;

/**
 * @member {String} prebookId
 */
RateBookRequest.prototype['prebookId'] = undefined;

/**
 * @member {String} rateId
 */
RateBookRequest.prototype['rateId'] = undefined;

/**
 * @member {String} sessionId
 */
RateBookRequest.prototype['sessionId'] = undefined;






export default RateBookRequest;

