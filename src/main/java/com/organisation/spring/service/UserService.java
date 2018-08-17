package com.organisation.spring.service;

import com.organisation.spring.model.User;
import com.organisation.spring.mock.USERS;

import java.util.List;

public class UserService {
    USERS _users;
    public UserService() {
        _users = new USERS();
    }

    public List<User> findAll() {
        return _users.getUsers();
    }

    public User findOne(int id) {
        return _users.getUser(id);
    }

    public List<User> create(User user) {
        return _users.addUser(user);
    }

    public List<User> update(User user) {
        return _users.updateUser(user);
    }

    public List<User> delete(User user) {
        return _users.deleteUser(user);
    }
}
