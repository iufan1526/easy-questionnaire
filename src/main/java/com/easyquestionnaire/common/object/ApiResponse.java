package com.easyquestionnaire.common.object;

import lombok.Data;

@Data
public class ApiResponse {

    private String message;
    private Object data;

    public ApiResponse() {
    }

    public ApiResponse(Object data, String message) {
        this.data = data;
        this.message = message;
    }
}
