/**
 * Lite API
 * lite api hotel booking api
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
 * The HotelsPostRequest model module.
 * @module model/HotelsPostRequest
 * @version 1.0.0
 */
class HotelsPostRequest {
    /**
     * Constructs a new <code>HotelsPostRequest</code>.
     * @alias module:model/HotelsPostRequest
     */
    constructor() { 
        
        HotelsPostRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HotelsPostRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HotelsPostRequest} obj Optional instance to populate.
     * @return {module:model/HotelsPostRequest} The populated <code>HotelsPostRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HotelsPostRequest();

            if (data.hasOwnProperty('checkin')) {
                obj['checkin'] = ApiClient.convertToType(data['checkin'], 'String');
            }
            if (data.hasOwnProperty('checkout')) {
                obj['checkout'] = ApiClient.convertToType(data['checkout'], 'String');
            }
            if (data.hasOwnProperty('latitude')) {
                obj['latitude'] = ApiClient.convertToType(data['latitude'], 'Number');
            }
            if (data.hasOwnProperty('longitude')) {
                obj['longitude'] = ApiClient.convertToType(data['longitude'], 'Number');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
            if (data.hasOwnProperty('distance')) {
                obj['distance'] = ApiClient.convertToType(data['distance'], 'Number');
            }
            if (data.hasOwnProperty('adults')) {
                obj['adults'] = ApiClient.convertToType(data['adults'], 'Number');
            }
            if (data.hasOwnProperty('children')) {
                obj['children'] = ApiClient.convertToType(data['children'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('guestNationality')) {
                obj['guestNationality'] = ApiClient.convertToType(data['guestNationality'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HotelsPostRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HotelsPostRequest</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['checkin'] && !(typeof data['checkin'] === 'string' || data['checkin'] instanceof String)) {
            throw new Error("Expected the field `checkin` to be a primitive type in the JSON string but got " + data['checkin']);
        }
        // ensure the json data is a string
        if (data['checkout'] && !(typeof data['checkout'] === 'string' || data['checkout'] instanceof String)) {
            throw new Error("Expected the field `checkout` to be a primitive type in the JSON string but got " + data['checkout']);
        }
        // ensure the json data is a string
        if (data['country'] && !(typeof data['country'] === 'string' || data['country'] instanceof String)) {
            throw new Error("Expected the field `country` to be a primitive type in the JSON string but got " + data['country']);
        }
        // ensure the json data is a string
        if (data['children'] && !(typeof data['children'] === 'string' || data['children'] instanceof String)) {
            throw new Error("Expected the field `children` to be a primitive type in the JSON string but got " + data['children']);
        }
        // ensure the json data is a string
        if (data['currency'] && !(typeof data['currency'] === 'string' || data['currency'] instanceof String)) {
            throw new Error("Expected the field `currency` to be a primitive type in the JSON string but got " + data['currency']);
        }
        // ensure the json data is a string
        if (data['guestNationality'] && !(typeof data['guestNationality'] === 'string' || data['guestNationality'] instanceof String)) {
            throw new Error("Expected the field `guestNationality` to be a primitive type in the JSON string but got " + data['guestNationality']);
        }

        return true;
    }


}



/**
 * @member {String} checkin
 */
HotelsPostRequest.prototype['checkin'] = undefined;

/**
 * @member {String} checkout
 */
HotelsPostRequest.prototype['checkout'] = undefined;

/**
 * @member {Number} latitude
 */
HotelsPostRequest.prototype['latitude'] = undefined;

/**
 * @member {Number} longitude
 */
HotelsPostRequest.prototype['longitude'] = undefined;

/**
 * @member {String} country
 */
HotelsPostRequest.prototype['country'] = undefined;

/**
 * @member {Number} distance
 */
HotelsPostRequest.prototype['distance'] = undefined;

/**
 * @member {Number} adults
 */
HotelsPostRequest.prototype['adults'] = undefined;

/**
 * @member {String} children
 */
HotelsPostRequest.prototype['children'] = undefined;

/**
 * @member {String} currency
 */
HotelsPostRequest.prototype['currency'] = undefined;

/**
 * @member {String} guestNationality
 */
HotelsPostRequest.prototype['guestNationality'] = undefined;






export default HotelsPostRequest;

