package com.fortex.xcloud.restapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class ResponseObj {

    private Integer statusCode;
    private String message;
    private Map<String, Object> data = new HashMap<String, Object>();
    public ResponseObj(String key, Object obj, Integer statusCode, String message) {
        if (key != null)
            data.put(key, obj);
        this.statusCode = statusCode;
        this.message = message;
    }

    public ResponseObj(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
