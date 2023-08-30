package com.example.user.service;

public interface UserService {

    Object findUser();
    void saveUser(String id, String pw);
    void updateUser();

}
