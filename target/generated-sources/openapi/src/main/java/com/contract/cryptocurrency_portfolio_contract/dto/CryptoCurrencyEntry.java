package com.contract.cryptocurrency_portfolio_contract.dto;

import java.util.Objects;
import com.contract.cryptocurrency_portfolio_contract.dto.Location;
import com.contract.cryptocurrency_portfolio_contract.dto.Symbol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CryptoCurrencyEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-13T16:42:09.929+01:00[Europe/Paris]")
public class CryptoCurrencyEntry   {
  @JsonProperty("symbol")
  private Symbol symbol;

  @JsonProperty("location")
  private Location location;

  @JsonProperty("amount")
  private Double amount;

  public CryptoCurrencyEntry symbol(Symbol symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Symbol getSymbol() {
    return symbol;
  }

  public void setSymbol(Symbol symbol) {
    this.symbol = symbol;
  }

  public CryptoCurrencyEntry location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public CryptoCurrencyEntry amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoCurrencyEntry cryptoCurrencyEntry = (CryptoCurrencyEntry) o;
    return Objects.equals(this.symbol, cryptoCurrencyEntry.symbol) &&
        Objects.equals(this.location, cryptoCurrencyEntry.location) &&
        Objects.equals(this.amount, cryptoCurrencyEntry.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, location, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoCurrencyEntry {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

