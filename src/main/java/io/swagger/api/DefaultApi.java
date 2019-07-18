/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.ExternalDocs;

@Api()
public interface DefaultApi {

    @ApiOperation(value = "", nickname = "rootGet", notes = "", response = ExternalDocs.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExternalDocs.class),
        @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/youdown",
        produces = { "video/mp4" }, 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> videoGet(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "url", required = true) List<String> url);

    
    @ApiOperation(value = "", nickname = "rootGet", notes = "", response = ExternalDocs.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExternalDocs.class),
        @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/audiodown",
        produces = { "audio/mpeg" }, 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> mp3Get(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "url", required = true) List<String> url);

}
