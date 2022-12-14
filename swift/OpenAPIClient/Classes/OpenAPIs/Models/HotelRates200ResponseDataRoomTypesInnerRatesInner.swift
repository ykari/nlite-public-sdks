//
// HotelRates200ResponseDataRoomTypesInnerRatesInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct HotelRates200ResponseDataRoomTypesInnerRatesInner: Codable, JSONEncodable, Hashable {

    public var cancellationPolicies: HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies?
    public var maxOccupancy: Double?
    public var name: String?
    public var rateId: String?
    public var retailRate: HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate?

    public init(cancellationPolicies: HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPolicies? = nil, maxOccupancy: Double? = nil, name: String? = nil, rateId: String? = nil, retailRate: HotelRates200ResponseDataRoomTypesInnerRatesInnerRetailRate? = nil) {
        self.cancellationPolicies = cancellationPolicies
        self.maxOccupancy = maxOccupancy
        self.name = name
        self.rateId = rateId
        self.retailRate = retailRate
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case cancellationPolicies
        case maxOccupancy
        case name
        case rateId
        case retailRate
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(cancellationPolicies, forKey: .cancellationPolicies)
        try container.encodeIfPresent(maxOccupancy, forKey: .maxOccupancy)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(rateId, forKey: .rateId)
        try container.encodeIfPresent(retailRate, forKey: .retailRate)
    }
}

