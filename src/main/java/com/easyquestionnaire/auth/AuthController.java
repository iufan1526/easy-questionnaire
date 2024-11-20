package com.easyquestionnaire.auth;

import com.easyquestionnaire.common.object.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping()
    public ApiResponse login() {

    }
}
