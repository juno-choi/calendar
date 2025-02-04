package com.simol.calendarcommon.domain.input.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record InputRequest(
    @Schema(description = "입력값", example = "2025년 2월 3일") String date,
    @Schema(description = "입력값", example = "맑은 날이였다.") String value
) {}
