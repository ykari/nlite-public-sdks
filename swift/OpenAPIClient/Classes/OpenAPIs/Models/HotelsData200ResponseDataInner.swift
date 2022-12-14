//
// HotelsData200ResponseDataInner.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct HotelsData200ResponseDataInner: Codable, JSONEncodable, Hashable {

    public var address: String?
    public var city: String?
    public var country: String?
    public var creditcardRequired: Bool?
    public var currency: String?
    public var hotelDescription: String?
    public var hotelImportantInformation: String?
    public var id: Double?
    public var isClosed: Bool?
    public var location: HotelsData200ResponseDataInnerLocation?
    public var name: String?
    public var zip: String?

    public init(address: String? = nil, city: String? = nil, country: String? = nil, creditcardRequired: Bool? = nil, currency: String? = nil, hotelDescription: String? = nil, hotelImportantInformation: String? = nil, id: Double? = nil, isClosed: Bool? = nil, location: HotelsData200ResponseDataInnerLocation? = nil, name: String? = nil, zip: String? = nil) {
        self.address = address
        self.city = city
        self.country = country
        self.creditcardRequired = creditcardRequired
        self.currency = currency
        self.hotelDescription = hotelDescription
        self.hotelImportantInformation = hotelImportantInformation
        self.id = id
        self.isClosed = isClosed
        self.location = location
        self.name = name
        self.zip = zip
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case address
        case city
        case country
        case creditcardRequired = "creditcard_required"
        case currency
        case hotelDescription = "hotel_description"
        case hotelImportantInformation = "hotel_important_information"
        case id
        case isClosed = "is_closed"
        case location
        case name
        case zip
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(address, forKey: .address)
        try container.encodeIfPresent(city, forKey: .city)
        try container.encodeIfPresent(country, forKey: .country)
        try container.encodeIfPresent(creditcardRequired, forKey: .creditcardRequired)
        try container.encodeIfPresent(currency, forKey: .currency)
        try container.encodeIfPresent(hotelDescription, forKey: .hotelDescription)
        try container.encodeIfPresent(hotelImportantInformation, forKey: .hotelImportantInformation)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(isClosed, forKey: .isClosed)
        try container.encodeIfPresent(location, forKey: .location)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(zip, forKey: .zip)
    }
}

