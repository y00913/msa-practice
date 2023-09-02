package com.example.user.controller;

import com.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public Object userInfo(){
        return userService.findUser();
    }

    @PostMapping("/user2")
    public String saveUser(@RequestBody Map<String, String> u) {
        userService.saveUser(u);

        return "save user";
    }

}
