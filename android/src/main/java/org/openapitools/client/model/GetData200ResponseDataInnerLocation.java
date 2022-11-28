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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetData200ResponseDataInnerLocation {
  
  @SerializedName("latitude")
  private BigDecimal latitude = null;
  @SerializedName("longitude")
  private BigDecimal longitude = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetData200ResponseDataInnerLocation getData200ResponseDataInnerLocation = (GetData200ResponseDataInnerLocation) o;
    return (this.latitude == null ? getData200ResponseDataInnerLocation.latitude == null : this.latitude.equals(getData200ResponseDataInnerLocation.latitude)) &&
        (this.longitude == null ? getData200ResponseDataInnerLocation.longitude == null : this.longitude.equals(getData200ResponseDataInnerLocation.longitude));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetData200ResponseDataInnerLocation {\n");
    
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}