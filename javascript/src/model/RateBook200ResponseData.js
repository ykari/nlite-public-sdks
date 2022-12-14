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
import RateBook200ResponseDataBookedRoomsInner from './RateBook200ResponseDataBookedRoomsInner';
import RateBook200ResponseDataCancellation from './RateBook200ResponseDataCancellation';
import RateBook200ResponseDataCancellationPolicies from './RateBook200ResponseDataCancellationPolicies';
import RateBook200ResponseDataContact from './RateBook200ResponseDataContact';
import RateBook200ResponseDataHotel from './RateBook200ResponseDataHotel';
import RateBook200ResponseDataNotes from './RateBook200ResponseDataNotes';

/**
 * The RateBook200ResponseData model module.
 * @module model/RateBook200ResponseData
 * @version 1.0.0
 */
class RateBook200ResponseData {
    /**
     * Constructs a new <code>RateBook200ResponseData</code>.
     * @alias module:model/RateBook200ResponseData
     */
    constructor() { 
        
        RateBook200ResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RateBook200ResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RateBook200ResponseData} obj Optional instance to populate.
     * @return {module:model/RateBook200ResponseData} The populated <code>RateBook200ResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RateBook200ResponseData();

            if (data.hasOwnProperty('bookedRooms')) {
                obj['bookedRooms'] = ApiClient.convertToType(data['bookedRooms'], [RateBook200ResponseDataBookedRoomsInner]);
            }
            if (data.hasOwnProperty('bookingId')) {
                obj['bookingId'] = ApiClient.convertToType(data['bookingId'], 'String');
            }
            if (data.hasOwnProperty('cancellation')) {
                obj['cancellation'] = RateBook200ResponseDataCancellation.constructFromObject(data['cancellation']);
            }
            if (data.hasOwnProperty('cancellationPolicies')) {
                obj['cancellationPolicies'] = RateBook200ResponseDataCancellationPolicies.constructFromObject(data['cancellationPolicies']);
            }
            if (data.hasOwnProperty('contact')) {
                obj['contact'] = RateBook200ResponseDataContact.constructFromObject(data['contact']);
            }
            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
            if (data.hasOwnProperty('hotel')) {
                obj['hotel'] = RateBook200ResponseDataHotel.constructFromObject(data['hotel']);
            }
            if (data.hasOwnProperty('hotelConfirmationCode')) {
                obj['hotelConfirmationCode'] = ApiClient.convertToType(data['hotelConfirmationCode'], 'String');
            }
            if (data.hasOwnProperty('notes')) {
                obj['notes'] = RateBook200ResponseDataNotes.constructFromObject(data['notes']);
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RateBook200ResponseData</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RateBook200ResponseData</code>.
     */
    static validateJSON(data) {
        if (data['bookedRooms']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['bookedRooms'])) {
                throw new Error("Expected the field `bookedRooms` to be an array in the JSON data but got " + data['bookedRooms']);
            }
            // validate the optional field `bookedRooms` (array)
            for (const item of data['bookedRooms']) {
                RateBook200ResponseDataBookedRoomsInner.validateJsonObject(item);
            };
        }
        // ensure the json data is a string
        if (data['bookingId'] && !(typeof data['bookingId'] === 'string' || data['bookingId'] instanceof String)) {
            throw new Error("Expected the field `bookingId` to be a primitive type in the JSON string but got " + data['bookingId']);
        }
        // validate the optional field `cancellation`
        if (data['cancellation']) { // data not null
          RateBook200ResponseDataCancellation.validateJSON(data['cancellation']);
        }
        // validate the optional field `cancellationPolicies`
        if (data['cancellationPolicies']) { // data not null
          RateBook200ResponseDataCancellationPolicies.validateJSON(data['cancellationPolicies']);
        }
        // validate the optional field `contact`
        if (data['contact']) { // data not null
          RateBook200ResponseDataContact.validateJSON(data['contact']);
        }
        // ensure the json data is a string
        if (data['createdAt'] && !(typeof data['createdAt'] === 'string' || data['createdAt'] instanceof String)) {
            throw new Error("Expected the field `createdAt` to be a primitive type in the JSON string but got " + data['createdAt']);
        }
        // ensure the json data is a string
        if (data['end'] && !(typeof data['end'] === 'string' || data['end'] instanceof String)) {
            throw new Error("Expected the field `end` to be a primitive type in the JSON string but got " + data['end']);
        }
        // validate the optional field `hotel`
        if (data['hotel']) { // data not null
          RateBook200ResponseDataHotel.validateJSON(data['hotel']);
        }
        // ensure the json data is a string
        if (data['hotelConfirmationCode'] && !(typeof data['hotelConfirmationCode'] === 'string' || data['hotelConfirmationCode'] instanceof String)) {
            throw new Error("Expected the field `hotelConfirmationCode` to be a primitive type in the JSON string but got " + data['hotelConfirmationCode']);
        }
        // validate the optional field `notes`
        if (data['notes']) { // data not null
          RateBook200ResponseDataNotes.validateJSON(data['notes']);
        }
        // ensure the json data is a string
        if (data['start'] && !(typeof data['start'] === 'string' || data['start'] instanceof String)) {
            throw new Error("Expected the field `start` to be a primitive type in the JSON string but got " + data['start']);
        }
        // ensure the json data is a string
        if (data['status'] && !(typeof data['status'] === 'string' || data['status'] instanceof String)) {
            throw new Error("Expected the field `status` to be a primitive type in the JSON string but got " + data['status']);
        }

        return true;
    }


}



/**
 * @member {Array.<module:model/RateBook200ResponseDataBookedRoomsInner>} bookedRooms
 */
RateBook200ResponseData.prototype['bookedRooms'] = undefined;

/**
 * @member {String} bookingId
 */
RateBook200ResponseData.prototype['bookingId'] = undefined;

/**
 * @member {module:model/RateBook200ResponseDataCancellation} cancellation
 */
RateBook200ResponseData.prototype['cancellation'] = undefined;

/**
 * @member {module:model/RateBook200ResponseDataCancellationPolicies} cancellationPolicies
 */
RateBook200ResponseData.prototype['cancellationPolicies'] = undefined;

/**
 * @member {module:model/RateBook200ResponseDataContact} contact
 */
RateBook200ResponseData.prototype['contact'] = undefined;

/**
 * @member {String} createdAt
 */
RateBook200ResponseData.prototype['createdAt'] = undefined;

/**
 * @member {String} end
 */
RateBook200ResponseData.prototype['end'] = undefined;

/**
 * @member {module:model/RateBook200ResponseDataHotel} hotel
 */
RateBook200ResponseData.prototype['hotel'] = undefined;

/**
 * @member {String} hotelConfirmationCode
 */
RateBook200ResponseData.prototype['hotelConfirmationCode'] = undefined;

/**
 * @member {module:model/RateBook200ResponseDataNotes} notes
 */
RateBook200ResponseData.prototype['notes'] = undefined;

/**
 * @member {String} start
 */
RateBook200ResponseData.prototype['start'] = undefined;

/**
 * @member {String} status
 */
RateBook200ResponseData.prototype['status'] = undefined;






export default RateBook200ResponseData;

