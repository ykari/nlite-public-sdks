//
// BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRate: Codable, JSONEncodable, Hashable {

    public var total: BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal?

    public init(total: BookingRetrieve200ResponseDataBookedRoomsInnerRateRetailRateTotal? = nil) {
        self.total = total
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case total
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(total, forKey: .total)
    }
}

