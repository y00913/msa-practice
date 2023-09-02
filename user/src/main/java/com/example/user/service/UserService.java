package com.example.user.service;

import java.util.Map;

public interface UserService {

    Object findUser();
    void saveUser(Map<String, String> u);
    void updateUser();

}
