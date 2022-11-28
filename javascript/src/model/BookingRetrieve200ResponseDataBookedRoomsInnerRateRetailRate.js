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
import BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal from './BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal';

/**
 * The BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate model module.
 * @module model/BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate
 * @version 1.0.0
 */
class BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate {
    /**
     * Constructs a new <code>BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate</code>.
     * @alias module:model/BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate
     */
    constructor() { 
        
        BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate} obj Optional instance to populate.
     * @return {module:model/BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate} The populated <code>BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate();

            if (data.hasOwnProperty('total')) {
                obj['total'] = BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.constructFromObject(data['total']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate</code>.
     */
    static validateJSON(data) {
        // validate the optional field `total`
        if (data['total']) { // data not null
          BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal.validateJSON(data['total']);
        }

        return true;
    }


}



/**
 * @member {module:model/BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal} total
 */
BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate.prototype['total'] = undefined;






export default BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate;

