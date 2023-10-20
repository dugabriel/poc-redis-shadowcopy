package com.redis.test.api;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class RedisDTO {

    @NotNull
    @NotEmpty
    private String key;

    @NotNull
    @NotEmpty
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
