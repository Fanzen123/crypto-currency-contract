package com.contract.cryptocurrency_portfolio_contract.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Asset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-13T16:42:09.929+01:00[Europe/Paris]")
public class Asset   {
  @JsonProperty("number")
  private Double number;

  @JsonProperty("valueAtTheTimeOfPurchase")
  private Double valueAtTheTimeOfPurchase;

  public Asset number(Double number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getNumber() {
    return number;
  }

  public void setNumber(Double number) {
    this.number = number;
  }

  public Asset valueAtTheTimeOfPurchase(Double valueAtTheTimeOfPurchase) {
    this.valueAtTheTimeOfPurchase = valueAtTheTimeOfPurchase;
    return this;
  }

  /**
   * Get valueAtTheTimeOfPurchase
   * @return valueAtTheTimeOfPurchase
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getValueAtTheTimeOfPurchase() {
    return valueAtTheTimeOfPurchase;
  }

  public void setValueAtTheTimeOfPurchase(Double valueAtTheTimeOfPurchase) {
    this.valueAtTheTimeOfPurchase = valueAtTheTimeOfPurchase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.number, asset.number) &&
        Objects.equals(this.valueAtTheTimeOfPurchase, asset.valueAtTheTimeOfPurchase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, valueAtTheTimeOfPurchase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    valueAtTheTimeOfPurchase: ").append(toIndentedString(valueAtTheTimeOfPurchase)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

