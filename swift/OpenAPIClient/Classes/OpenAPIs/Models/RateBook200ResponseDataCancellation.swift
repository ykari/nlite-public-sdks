//
// RateBook200ResponseDataCancellation.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct RateBook200ResponseDataCancellation: Codable, JSONEncodable, Hashable {

    public var fee: RateBook200ResponseDataCancellationFee?

    public init(fee: RateBook200ResponseDataCancellationFee? = nil) {
        self.fee = fee
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case fee
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(fee, forKey: .fee)
    }
}

