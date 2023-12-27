package com.example.gameservice.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyApiConfig {

    @Value("${currency.api.url}")
    private String currencyApiUrl;

    @Value("${currency.api.accessKey}")
    private String currencyApiAccessKey;

    @Bean
    public String endpoint() {
        return String.format("%s?apikey=%s", currencyApiUrl, currencyApiAccessKey);
    }
}
