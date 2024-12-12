package com.example.Literatura.configuraciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfiguracionApp {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
