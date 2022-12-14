//
// RateBookRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct RateBookRequest: Codable, JSONEncodable, Hashable {

    public var contact: RateBookRequestContact?
    public var prebookId: String?
    public var rateId: String?
    public var sessionId: String?

    public init(contact: RateBookRequestContact? = nil, prebookId: String? = nil, rateId: String? = nil, sessionId: String? = nil) {
        self.contact = contact
        self.prebookId = prebookId
        self.rateId = rateId
        self.sessionId = sessionId
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case contact
        case prebookId
        case rateId
        case sessionId
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(contact, forKey: .contact)
        try container.encodeIfPresent(prebookId, forKey: .prebookId)
        try container.encodeIfPresent(rateId, forKey: .rateId)
        try container.encodeIfPresent(sessionId, forKey: .sessionId)
    }
}

