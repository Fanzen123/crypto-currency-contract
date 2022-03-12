package com.contract.cryptocurrency_portfolio_contract.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-12T22:15:50.560+01:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.swagger.base-path:}")
public class ItemApiController implements ItemApi {

    private final ItemApiDelegate delegate;

    public ItemApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ItemApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ItemApiDelegate() {});
    }

    @Override
    public ItemApiDelegate getDelegate() {
        return delegate;
    }

}
