package io.swagger.api;

import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-12T19:22:39.415Z")

@Api(value = "pinValidation", description = "the pinValidation API")
public interface PinValidationApi {

    @ApiOperation(value = "This API is used to validated the PIN Details based on MetRef Id", notes = "", response = InlineResponse200.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = InlineResponse200.class),
        @ApiResponse(code = 404, message = "The specified metrefId is invalid or Data not found (e.g. not a number)", response = InlineResponse200.class),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid", response = InlineResponse200.class) })
    @RequestMapping(value = "/pinValidation/{metrefId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> pinValidationMetrefIdGet(@ApiParam(value = "This will return users generated pin.",required=true ) @PathVariable("metrefId") String metrefId);

}
