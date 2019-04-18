/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.doctor.api;

import com.bytatech.ayoos.client.doctor.model.RattingDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-18T10:03:07.389+05:30[Asia/Calcutta]")

@Api(value = "RattingResource", description = "the RattingResource API")
public interface RattingResourceApi {

    @ApiOperation(value = "createRatting", nickname = "createRattingUsingPOST", notes = "", response = RattingDTO.class, tags={ "ratting-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RattingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rattings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<RattingDTO> createRattingUsingPOST(@ApiParam(value = "rattingDTO" ,required=true )  @Valid @RequestBody RattingDTO rattingDTO);


    @ApiOperation(value = "deleteRatting", nickname = "deleteRattingUsingDELETE", notes = "", tags={ "ratting-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/rattings/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteRattingUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllRattings", nickname = "getAllRattingsUsingGET", notes = "", response = RattingDTO.class, responseContainer = "List", tags={ "ratting-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RattingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rattings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RattingDTO>> getAllRattingsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getRatting", nickname = "getRattingUsingGET", notes = "", response = RattingDTO.class, tags={ "ratting-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RattingDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rattings/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<RattingDTO> getRattingUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchRattings", nickname = "searchRattingsUsingGET", notes = "", response = RattingDTO.class, responseContainer = "List", tags={ "ratting-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RattingDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/rattings",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<RattingDTO>> searchRattingsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateRatting", nickname = "updateRattingUsingPUT", notes = "", response = RattingDTO.class, tags={ "ratting-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RattingDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/rattings",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<RattingDTO> updateRattingUsingPUT(@ApiParam(value = "rattingDTO" ,required=true )  @Valid @RequestBody RattingDTO rattingDTO);

}
