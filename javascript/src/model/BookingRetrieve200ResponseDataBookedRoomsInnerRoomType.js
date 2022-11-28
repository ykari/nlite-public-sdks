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
 * The BookingRetrieve200ResponseDataBookedRoomsInnerRoomType model module.
 * @module model/BookingRetrieve200ResponseDataBookedRoomsInnerRoomType
 * @version 1.0.0
 */
class BookingRetrieve200ResponseDataBookedRoomsInnerRoomType {
    /**
     * Constructs a new <code>BookingRetrieve200ResponseDataBookedRoomsInnerRoomType</code>.
     * @alias module:model/BookingRetrieve200ResponseDataBookedRoomsInnerRoomType
     */
    constructor() { 
        
        BookingRetrieve200ResponseDataBookedRoomsInnerRoomType.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BookingRetrieve200ResponseDataBookedRoomsInnerRoomType</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BookingRetrieve200ResponseDataBookedRoomsInnerRoomType} obj Optional instance to populate.
     * @return {module:model/BookingRetrieve200ResponseDataBookedRoomsInnerRoomType} The populated <code>BookingRetrieve200ResponseDataBookedRoomsInnerRoomType</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BookingRetrieve200ResponseDataBookedRoomsInnerRoomType();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BookingRetrieve200ResponseDataBookedRoomsInnerRoomType</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BookingRetrieve200ResponseDataBookedRoomsInnerRoomType</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }

        return true;
    }


}



/**
 * @member {String} name
 */
BookingRetrieve200ResponseDataBookedRoomsInnerRoomType.prototype['name'] = undefined;






export default BookingRetrieve200ResponseDataBookedRoomsInnerRoomType;

