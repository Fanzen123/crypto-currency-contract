package com.contract.cryptocurrency_portfolio_contract.api;

import com.contract.cryptocurrency_portfolio_contract.dto.CryptoCurrency;
import com.contract.cryptocurrency_portfolio_contract.dto.CryptoCurrencyEntry;
import com.contract.cryptocurrency_portfolio_contract.dto.FullCryptoCurrency;
import com.contract.cryptocurrency_portfolio_contract.dto.Symbol;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ItemApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-13T16:42:09.929+01:00[Europe/Paris]")
public interface ItemApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /item : Add a new cryptoCurrency asset
     *
     * @param cryptoCurrencyEntry CryptoCurrency (required)
     * @return successful operation (status code 200)
     * @see ItemApi#addCryptoCurrencyAsset
     */
    default ResponseEntity<CryptoCurrency> addCryptoCurrencyAsset(CryptoCurrencyEntry cryptoCurrencyEntry) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 6.027456183070403, \"entryDate\" : \"2000-01-23\", \"oldMarketValue\" : 1.4658129805029452, \"id\" : 0, \"actualMarketValue\" : 5.962133916683182 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /item/{symbol} : delete cryptoCurrency
     *
     * @param symbol Cryptocurrency to delete (required)
     * @return successful operation (status code 200)
     * @see ItemApi#deleteCryptoCurrency
     */
    default ResponseEntity<Void> deleteCryptoCurrency(Symbol symbol) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /item : get cryptoCurrencies
     *
     * @return successful operation (status code 200)
     * @see ItemApi#getCryptoCurrencies
     */
    default ResponseEntity<List<CryptoCurrency>> getCryptoCurrencies() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 6.027456183070403, \"entryDate\" : \"2000-01-23\", \"oldMarketValue\" : 1.4658129805029452, \"id\" : 0, \"actualMarketValue\" : 5.962133916683182 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /item/{symbol} : get cryptoCurrency
     *
     * @param symbol Cryptocurrency to get (required)
     * @return successful operation (status code 200)
     * @see ItemApi#getCryptoCurrency
     */
    default ResponseEntity<CryptoCurrency> getCryptoCurrency(Symbol symbol) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"amount\" : 6.027456183070403, \"entryDate\" : \"2000-01-23\", \"oldMarketValue\" : 1.4658129805029452, \"id\" : 0, \"actualMarketValue\" : 5.962133916683182 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /item : update a cryptoCurrency
     *
     * @param fullCryptoCurrency FullCryptoCurrency (required)
     * @return successful operation (status code 200)
     * @see ItemApi#updateCryptoCurrency
     */
    default ResponseEntity<FullCryptoCurrency> updateCryptoCurrency(FullCryptoCurrency fullCryptoCurrency) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
