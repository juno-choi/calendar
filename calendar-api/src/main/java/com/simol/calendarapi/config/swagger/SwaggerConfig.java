package com.simol.calendarapi.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI api() {
        Info info = new Info()
            .title("calendar api")
            .version("1.0")
            .description("calendar api document")
            ;
        return new OpenAPI().info(info);
    }

}
