package com.example.spring.dummy_spring_framework_app1.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    // Setters are required for @ConfigurationProperties to bind
    // Getters only (immutable style)
    private String name;
    private String description;
    private String version;
    private String owner;

}
