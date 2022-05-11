package com.example.springbootcrud.dao;

import com.example.springbootcrud.model.User;

import java.util.List;

public interface UserDao {

    User findById(Long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(Long id);

    User update(User user);
}
