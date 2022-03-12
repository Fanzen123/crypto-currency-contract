package com.contract.cryptocurrency_portfolio_contract.dto;

import java.util.Objects;
import com.contract.cryptocurrency_portfolio_contract.dto.Location;
import com.contract.cryptocurrency_portfolio_contract.dto.Symbol;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GlobalCryptoCurrency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-12T22:15:50.560+01:00[Europe/Paris]")
public class GlobalCryptoCurrency   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("symbol")
  private Symbol symbol;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("entryDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate entryDate;

  @JsonProperty("location")
  private Location location;

  @JsonProperty("oldMarketValue")
  private Double oldMarketValue;

  @JsonProperty("actualMarketValue")
  private Double actualMarketValue;

  public GlobalCryptoCurrency id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GlobalCryptoCurrency symbol(Symbol symbol) {
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

  public GlobalCryptoCurrency amount(Double amount) {
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

  public GlobalCryptoCurrency entryDate(LocalDate entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * Get entryDate
   * @return entryDate
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(LocalDate entryDate) {
    this.entryDate = entryDate;
  }

  public GlobalCryptoCurrency location(Location location) {
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

  public GlobalCryptoCurrency oldMarketValue(Double oldMarketValue) {
    this.oldMarketValue = oldMarketValue;
    return this;
  }

  /**
   * Get oldMarketValue
   * @return oldMarketValue
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getOldMarketValue() {
    return oldMarketValue;
  }

  public void setOldMarketValue(Double oldMarketValue) {
    this.oldMarketValue = oldMarketValue;
  }

  public GlobalCryptoCurrency actualMarketValue(Double actualMarketValue) {
    this.actualMarketValue = actualMarketValue;
    return this;
  }

  /**
   * Get actualMarketValue
   * @return actualMarketValue
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getActualMarketValue() {
    return actualMarketValue;
  }

  public void setActualMarketValue(Double actualMarketValue) {
    this.actualMarketValue = actualMarketValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalCryptoCurrency globalCryptoCurrency = (GlobalCryptoCurrency) o;
    return Objects.equals(this.id, globalCryptoCurrency.id) &&
        Objects.equals(this.symbol, globalCryptoCurrency.symbol) &&
        Objects.equals(this.amount, globalCryptoCurrency.amount) &&
        Objects.equals(this.entryDate, globalCryptoCurrency.entryDate) &&
        Objects.equals(this.location, globalCryptoCurrency.location) &&
        Objects.equals(this.oldMarketValue, globalCryptoCurrency.oldMarketValue) &&
        Objects.equals(this.actualMarketValue, globalCryptoCurrency.actualMarketValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbol, amount, entryDate, location, oldMarketValue, actualMarketValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCryptoCurrency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    oldMarketValue: ").append(toIndentedString(oldMarketValue)).append("\n");
    sb.append("    actualMarketValue: ").append(toIndentedString(actualMarketValue)).append("\n");
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

