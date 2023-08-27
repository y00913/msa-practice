package com.example.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Primary
@Service
@Slf4j
@RequiredArgsConstructor
@RefreshScope
public class UserServiceImpl implements UserService{

    @Value("${test}")
    private String user;

    @Value("${test2}")
    private String user2;

    @Override
    public Object findUser() {
        log.info("user  :::  " + user);
        log.info("user2 :::  " + user2);

        Map<String, String> map = new HashMap<>();

        map.put("user", user);
        map.put("user2", user2);

        return map;
    }

    @Override
    public void saveUser() {

    }

    @Override
    public void updateUser() {

    }

}
