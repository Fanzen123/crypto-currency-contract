package com.contract.cryptocurrency_portfolio_contract.api;

import com.contract.cryptocurrency_portfolio_contract.dto.CryptoCurrency;
import com.contract.cryptocurrency_portfolio_contract.dto.GlobalCryptoCurrency;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-12T17:26:38.123+01:00[Europe/Paris]")
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
    default ResponseEntity<GlobalCryptoCurrency> addCryptoCurrencyAsset(CryptoCurrency cryptoCurrency) {
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

}
