//
// RateBook200ResponseDataCancellationFee.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct RateBook200ResponseDataCancellationFee: Codable, JSONEncodable, Hashable {

    public var count: Double?
    public var price: RateBook200ResponseDataCancellationFeePrice?
    public var type: String?

    public init(count: Double? = nil, price: RateBook200ResponseDataCancellationFeePrice? = nil, type: String? = nil) {
        self.count = count
        self.price = price
        self.type = type
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case count
        case price
        case type
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(count, forKey: .count)
        try container.encodeIfPresent(price, forKey: .price)
        try container.encodeIfPresent(type, forKey: .type)
    }
}
