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
 * The HotelsSearch400ResponseError model module.
 * @module model/HotelsSearch400ResponseError
 * @version 1.0.0
 */
class HotelsSearch400ResponseError {
    /**
     * Constructs a new <code>HotelsSearch400ResponseError</code>.
     * @alias module:model/HotelsSearch400ResponseError
     */
    constructor() { 
        
        HotelsSearch400ResponseError.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HotelsSearch400ResponseError</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HotelsSearch400ResponseError} obj Optional instance to populate.
     * @return {module:model/HotelsSearch400ResponseError} The populated <code>HotelsSearch400ResponseError</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HotelsSearch400ResponseError();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'Number');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HotelsSearch400ResponseError</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HotelsSearch400ResponseError</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['message'] && !(typeof data['message'] === 'string' || data['message'] instanceof String)) {
            throw new Error("Expected the field `message` to be a primitive type in the JSON string but got " + data['message']);
        }

        return true;
    }


}



/**
 * @member {Number} code
 */
HotelsSearch400ResponseError.prototype['code'] = undefined;

/**
 * @member {String} message
 */
HotelsSearch400ResponseError.prototype['message'] = undefined;






export default HotelsSearch400ResponseError;

