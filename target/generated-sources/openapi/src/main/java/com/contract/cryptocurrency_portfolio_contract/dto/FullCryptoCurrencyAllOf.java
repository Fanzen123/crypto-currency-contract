package com.contract.cryptocurrency_portfolio_contract.dto;

import java.util.Objects;
import com.contract.cryptocurrency_portfolio_contract.dto.Asset;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FullCryptoCurrencyAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-13T16:42:09.929+01:00[Europe/Paris]")
public class FullCryptoCurrencyAllOf   {
  @JsonProperty("assets")
  @Valid
  private List<Asset> assets = new ArrayList<>();

  public FullCryptoCurrencyAllOf assets(List<Asset> assets) {
    this.assets = assets;
    return this;
  }

  public FullCryptoCurrencyAllOf addAssetsItem(Asset assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

  /**
   * Get assets
   * @return assets
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Asset> getAssets() {
    return assets;
  }

  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullCryptoCurrencyAllOf fullCryptoCurrencyAllOf = (FullCryptoCurrencyAllOf) o;
    return Objects.equals(this.assets, fullCryptoCurrencyAllOf.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullCryptoCurrencyAllOf {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

