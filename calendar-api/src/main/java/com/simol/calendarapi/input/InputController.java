package com.simol.calendarapi.input;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simol.calendarcommon.domain.input.dto.InputRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/input")
@Tag(name = "input api", description = "input api document")
public class InputController {
    
    @Operation(summary = "입력", description = "입력 api")
        @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "정상", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
            @ApiResponse(responseCode = "500", description = "서버 에러", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)),
    })
    @PostMapping("")
    public ResponseEntity<?> postInput(@RequestBody InputRequest inputRequest) {
        // todo aws 연동해서 데이터 처리하기.

        return ResponseEntity.ok(inputRequest);
    }
}
