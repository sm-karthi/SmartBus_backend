package com.fssa.smartbus.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI smartBusOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SmartBus API")
                        .description("API documentation for SmartBus Ticket Booking System")
                        .version("1.0"));
    }
}
