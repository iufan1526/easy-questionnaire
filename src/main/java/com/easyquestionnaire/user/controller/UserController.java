package com.easyquestionnaire.user.controller;

import com.easyquestionnaire.common.object.ApiResponse;
import com.easyquestionnaire.user.entity.User;
import com.easyquestionnaire.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public ResponseEntity<ApiResponse> createUser(@RequestBody @Validated User user) {
        ApiResponse apiResponse = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
    }
}
