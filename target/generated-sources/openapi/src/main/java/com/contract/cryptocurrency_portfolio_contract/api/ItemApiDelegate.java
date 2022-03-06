package com.contract.cryptocurrency_portfolio_contract.api;

import com.contract.cryptocurrency_portfolio_contract.dto.CryptoCurrency;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-06T20:45:24.448+01:00[Europe/Paris]")
public interface ItemApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /item : Add a new cryptoCurrency asset
     *
     * @param cryptoCurrency CryptoCurrency (required)
     * @return successful operation (status code 200)
     * @see ItemApi#addCryptoCurrencyAsset
     */
    default ResponseEntity<CryptoCurrency> addCryptoCurrencyAsset(CryptoCurrency cryptoCurrency) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2000-01-23\", \"symbol\" : \"symbol\", \"location\" : \"location\", \"value\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
