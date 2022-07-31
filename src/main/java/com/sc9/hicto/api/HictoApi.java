/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.sc9.hicto.api;

import com.sc9.hicto.api.model.EventDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "Hicto", description = "the Hicto API")
public interface HictoApi {

    /**
     * POST /api/v1/event
     *
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "createEvent",
        tags = { "Hicto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  EventDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/event",
        produces = { "application/json" }
    )
    ResponseEntity<List<EventDto>> createEvent(
        
    );


    /**
     * DELETE /api/v1/event/{event_id}
     *
     * @param eventId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "deleteEvent",
        tags = { "Hicto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  EventDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/event/{event_id}",
        produces = { "application/json" }
    )
    ResponseEntity<List<EventDto>> deleteEvent(
        @Parameter(name = "event_id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("event_id") Long eventId
    );


    /**
     * GET /api/v1/event/{event_id}
     *
     * @param eventId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getEvent",
        tags = { "Hicto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  EventDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/event/{event_id}",
        produces = { "application/json" }
    )
    ResponseEntity<List<EventDto>> getEvent(
        @Parameter(name = "event_id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("event_id") Long eventId
    );


    /**
     * PUT /api/v1/event/{event_id}
     *
     * @param eventId  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "updateEvent",
        tags = { "Hicto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  EventDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/event/{event_id}",
        produces = { "application/json" }
    )
    ResponseEntity<List<EventDto>> updateEvent(
        @Parameter(name = "event_id", description = "", required = true, schema = @Schema(description = "")) @PathVariable("event_id") Long eventId
    );

}
