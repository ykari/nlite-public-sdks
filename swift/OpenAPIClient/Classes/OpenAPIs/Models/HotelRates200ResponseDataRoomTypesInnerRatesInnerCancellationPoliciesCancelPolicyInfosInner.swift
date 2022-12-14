//
// HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct HotelRates200ResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner: Codable, JSONEncodable, Hashable {

    public var amount: Double?
    public var cancelTime: String?
    public var type: String?

    public init(amount: Double? = nil, cancelTime: String? = nil, type: String? = nil) {
        self.amount = amount
        self.cancelTime = cancelTime
        self.type = type
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case amount
        case cancelTime
        case type
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(amount, forKey: .amount)
        try container.encodeIfPresent(cancelTime, forKey: .cancelTime)
        try container.encodeIfPresent(type, forKey: .type)
    }
}

