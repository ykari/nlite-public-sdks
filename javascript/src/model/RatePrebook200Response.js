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
import RatePrebook200ResponseData from './RatePrebook200ResponseData';

/**
 * The RatePrebook200Response model module.
 * @module model/RatePrebook200Response
 * @version 1.0.0
 */
class RatePrebook200Response {
    /**
     * Constructs a new <code>RatePrebook200Response</code>.
     * @alias module:model/RatePrebook200Response
     */
    constructor() { 
        
        RatePrebook200Response.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RatePrebook200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RatePrebook200Response} obj Optional instance to populate.
     * @return {module:model/RatePrebook200Response} The populated <code>RatePrebook200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RatePrebook200Response();

            if (data.hasOwnProperty('data')) {
                obj['data'] = RatePrebook200ResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RatePrebook200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RatePrebook200Response</code>.
     */
    static validateJSON(data) {
        // validate the optional field `data`
        if (data['data']) { // data not null
          RatePrebook200ResponseData.validateJSON(data['data']);
        }

        return true;
    }


}



/**
 * @member {module:model/RatePrebook200ResponseData} data
 */
RatePrebook200Response.prototype['data'] = undefined;






export default RatePrebook200Response;

