//
// RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct RatePrebook200ResponseDataRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner: Codable, JSONEncodable, Hashable {

    public var amount: Double?
    public var currency: String?
    public var description: String?
    public var included: Bool?

    public init(amount: Double? = nil, currency: String? = nil, description: String? = nil, included: Bool? = nil) {
        self.amount = amount
        self.currency = currency
        self.description = description
        self.included = included
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case amount
        case currency
        case description
        case included
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(amount, forKey: .amount)
        try container.encodeIfPresent(currency, forKey: .currency)
        try container.encodeIfPresent(description, forKey: .description)
        try container.encodeIfPresent(included, forKey: .included)
    }
}

