package com.example.spring.dummy_spring_framework_app1.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfiguration {

    private String url;
    private String key;
    private String username;

}
