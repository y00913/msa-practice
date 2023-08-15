package com.example.user.service;

import com.example.user.config.TestConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final TestConfig testConfig;

    @Override
    public String findUser() {


        return testConfig.getTest();
    }

}
