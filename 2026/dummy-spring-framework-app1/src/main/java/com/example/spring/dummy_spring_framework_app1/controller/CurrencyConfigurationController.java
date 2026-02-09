package com.example.spring.dummy_spring_framework_app1.controller;

import com.example.spring.dummy_spring_framework_app1.config.CurrencyServiceConfiguration;
import com.example.spring.dummy_spring_framework_app1.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    CurrencyServiceConfiguration currencyConfiguration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveCurrencyConfiguration(){
        return currencyConfiguration;
    }

}
