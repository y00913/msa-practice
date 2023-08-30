package com.example.user.controller;

import com.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public Object userInfo(){
        return userService.findUser();
    }

    @GetMapping("/user2")
    public String saveUser(String id, String pw) {
        userService.saveUser(id, pw);

        return "save user";
    }

}
