package com.organisation.spring.mock;

import com.organisation.spring.model.User;

import java.util.ArrayList;
import java.util.List;

public class USERS {
    List<User> users;
    public USERS() {
        users = new ArrayList<>();
        users.add(new User(0, "surname0", "name0", "email0"));
        users.add(new User(1, "surname1", "name1", "email1"));
        users.add(new User(2, "surname2", "name2", "email2"));
        users.add(new User(3, "surname3", "name3", "email3"));
        users.add(new User(4, "surname4", "name4", "email4"));
        users.add(new User(5, "surname5", "name5", "email5"));
        users.add(new User(6, "surname6", "name6", "email6"));
        users.add(new User(7, "surname7", "name7", "email7"));
        users.add(new User(8, "surname8", "name8", "email8"));
        users.add(new User(9, "surname9", "name9", "email9"));
        users.add(new User(10, "surname10", "name10", "email10"));
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        for(User u: users) {
            if(u.getId() == id)
                return u;
        }
        return null;
    }

    public List<User> addUser(User user) {
        users.add(user);
        return users;
    }

    public List<User> deleteUser(User user) {
        users.remove(user);
        return users;
    }

    public List<User> updateUser(User user) {
        users.forEach((u) -> {
            if(u.getId() == user.getId()) {
                users.remove(u);
                users.add(user);
            }
        });
        return users;
    }
}
