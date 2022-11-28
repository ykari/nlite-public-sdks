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
import HotelsSearch200ResponseDataInner from './HotelsSearch200ResponseDataInner';

/**
 * The HotelsSearch200Response model module.
 * @module model/HotelsSearch200Response
 * @version 1.0.0
 */
class HotelsSearch200Response {
    /**
     * Constructs a new <code>HotelsSearch200Response</code>.
     * @alias module:model/HotelsSearch200Response
     */
    constructor() { 
        
        HotelsSearch200Response.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HotelsSearch200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HotelsSearch200Response} obj Optional instance to populate.
     * @return {module:model/HotelsSearch200Response} The populated <code>HotelsSearch200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HotelsSearch200Response();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [HotelsSearch200ResponseDataInner]);
            }
            if (data.hasOwnProperty('session_id')) {
                obj['session_id'] = ApiClient.convertToType(data['session_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HotelsSearch200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HotelsSearch200Response</code>.
     */
    static validateJSON(data) {
        if (data['data']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['data'])) {
                throw new Error("Expected the field `data` to be an array in the JSON data but got " + data['data']);
            }
            // validate the optional field `data` (array)
            for (const item of data['data']) {
                HotelsSearch200ResponseDataInner.validateJsonObject(item);
            };
        }
        // ensure the json data is a string
        if (data['session_id'] && !(typeof data['session_id'] === 'string' || data['session_id'] instanceof String)) {
            throw new Error("Expected the field `session_id` to be a primitive type in the JSON string but got " + data['session_id']);
        }

        return true;
    }


}



/**
 * @member {Array.<module:model/HotelsSearch200ResponseDataInner>} data
 */
HotelsSearch200Response.prototype['data'] = undefined;

/**
 * @member {String} session_id
 */
HotelsSearch200Response.prototype['session_id'] = undefined;






export default HotelsSearch200Response;
