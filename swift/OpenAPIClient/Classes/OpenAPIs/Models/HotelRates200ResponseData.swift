//
// HotelRates200ResponseData.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct HotelRates200ResponseData: Codable, JSONEncodable, Hashable {

    public var hotelId: String?
    public var roomTypes: [HotelRates200ResponseDataRoomTypesInner]?
    public var termsAndConditions: String?

    public init(hotelId: String? = nil, roomTypes: [HotelRates200ResponseDataRoomTypesInner]? = nil, termsAndConditions: String? = nil) {
        self.hotelId = hotelId
        self.roomTypes = roomTypes
        self.termsAndConditions = termsAndConditions
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case hotelId
        case roomTypes
        case termsAndConditions
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(hotelId, forKey: .hotelId)
        try container.encodeIfPresent(roomTypes, forKey: .roomTypes)
        try container.encodeIfPresent(termsAndConditions, forKey: .termsAndConditions)
    }
}
