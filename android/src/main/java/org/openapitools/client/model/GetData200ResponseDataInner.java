/**
 * Lite API
 * lite api hotel booking api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.GetData200ResponseDataInnerLocation;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetData200ResponseDataInner {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("hotel_description")
  private String hotelDescription = null;
  @SerializedName("hotel_important_information")
  private String hotelImportantInformation = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("location")
  private GetData200ResponseDataInnerLocation location = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("zip")
  private String zip = null;
  @SerializedName("is_closed")
  private Boolean isClosed = null;
  @SerializedName("creditcard_required")
  private Boolean creditcardRequired = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHotelDescription() {
    return hotelDescription;
  }
  public void setHotelDescription(String hotelDescription) {
    this.hotelDescription = hotelDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHotelImportantInformation() {
    return hotelImportantInformation;
  }
  public void setHotelImportantInformation(String hotelImportantInformation) {
    this.hotelImportantInformation = hotelImportantInformation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public GetData200ResponseDataInnerLocation getLocation() {
    return location;
  }
  public void setLocation(GetData200ResponseDataInnerLocation location) {
    this.location = location;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsClosed() {
    return isClosed;
  }
  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCreditcardRequired() {
    return creditcardRequired;
  }
  public void setCreditcardRequired(Boolean creditcardRequired) {
    this.creditcardRequired = creditcardRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetData200ResponseDataInner getData200ResponseDataInner = (GetData200ResponseDataInner) o;
    return (this.id == null ? getData200ResponseDataInner.id == null : this.id.equals(getData200ResponseDataInner.id)) &&
        (this.name == null ? getData200ResponseDataInner.name == null : this.name.equals(getData200ResponseDataInner.name)) &&
        (this.hotelDescription == null ? getData200ResponseDataInner.hotelDescription == null : this.hotelDescription.equals(getData200ResponseDataInner.hotelDescription)) &&
        (this.hotelImportantInformation == null ? getData200ResponseDataInner.hotelImportantInformation == null : this.hotelImportantInformation.equals(getData200ResponseDataInner.hotelImportantInformation)) &&
        (this.currency == null ? getData200ResponseDataInner.currency == null : this.currency.equals(getData200ResponseDataInner.currency)) &&
        (this.country == null ? getData200ResponseDataInner.country == null : this.country.equals(getData200ResponseDataInner.country)) &&
        (this.city == null ? getData200ResponseDataInner.city == null : this.city.equals(getData200ResponseDataInner.city)) &&
        (this.location == null ? getData200ResponseDataInner.location == null : this.location.equals(getData200ResponseDataInner.location)) &&
        (this.address == null ? getData200ResponseDataInner.address == null : this.address.equals(getData200ResponseDataInner.address)) &&
        (this.zip == null ? getData200ResponseDataInner.zip == null : this.zip.equals(getData200ResponseDataInner.zip)) &&
        (this.isClosed == null ? getData200ResponseDataInner.isClosed == null : this.isClosed.equals(getData200ResponseDataInner.isClosed)) &&
        (this.creditcardRequired == null ? getData200ResponseDataInner.creditcardRequired == null : this.creditcardRequired.equals(getData200ResponseDataInner.creditcardRequired));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.hotelDescription == null ? 0: this.hotelDescription.hashCode());
    result = 31 * result + (this.hotelImportantInformation == null ? 0: this.hotelImportantInformation.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.zip == null ? 0: this.zip.hashCode());
    result = 31 * result + (this.isClosed == null ? 0: this.isClosed.hashCode());
    result = 31 * result + (this.creditcardRequired == null ? 0: this.creditcardRequired.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetData200ResponseDataInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  hotelDescription: ").append(hotelDescription).append("\n");
    sb.append("  hotelImportantInformation: ").append(hotelImportantInformation).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  zip: ").append(zip).append("\n");
    sb.append("  isClosed: ").append(isClosed).append("\n");
    sb.append("  creditcardRequired: ").append(creditcardRequired).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
