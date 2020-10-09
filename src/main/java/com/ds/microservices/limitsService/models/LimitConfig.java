package com.ds.microservices.limitsService.models;

public class LimitConfig {
    private Integer maximum;
    private Integer minimum;

    public LimitConfig() {
    }

    public LimitConfig(Integer maximum, Integer minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }
}
