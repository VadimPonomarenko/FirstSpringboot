package com.example.demo.service;



import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    User show(int id);

    void removeUser(int id);

    List<User> getAllUsers();

    void update(User user);
}
