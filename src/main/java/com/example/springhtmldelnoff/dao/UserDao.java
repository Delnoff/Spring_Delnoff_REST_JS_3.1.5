package com.example.springhtmldelnoff.dao;

import com.example.springhtmldelnoff.model.User;

import java.util.List;

public interface UserDao {
    User findByName(String username);

    void delete(Long id);

    void update(User user);

    void add(User user);

    List<User> listUsers();

    User findById(Long id);
}
