package com.example.course_booking_server.controller.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course_booking_server.dto.user.CreateUserDTO;
import com.example.course_booking_server.service.user.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> createUser(@RequestBody() CreateUserDTO newUserInfo) {
        String response = userService.createUser(newUserInfo);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
