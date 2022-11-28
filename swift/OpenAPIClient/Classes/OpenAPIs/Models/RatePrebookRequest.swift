//
// RatePrebookRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct RatePrebookRequest: Codable, JSONEncodable, Hashable {

    public var rateId: String?
    public var sessionId: String?

    public init(rateId: String? = nil, sessionId: String? = nil) {
        self.rateId = rateId
        self.sessionId = sessionId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case rateId
        case sessionId
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(rateId, forKey: .rateId)
        try container.encodeIfPresent(sessionId, forKey: .sessionId)
    }
}

