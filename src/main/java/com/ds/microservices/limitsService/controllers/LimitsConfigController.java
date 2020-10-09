package com.ds.microservices.limitsService.controllers;

import com.ds.microservices.limitsService.configs.Configuration;
import com.ds.microservices.limitsService.models.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {
    @Autowired
    private Configuration configuration;

    @GetMapping(path = "/limits")
    public LimitConfig getLimitConfigs() {
        return new LimitConfig(configuration.getMaximum(), configuration.getMinimum());
    }
}
