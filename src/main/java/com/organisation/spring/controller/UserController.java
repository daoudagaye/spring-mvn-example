package com.organisation.spring.controller;

import com.organisation.spring.model.User;
import com.organisation.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User findOne(@PathVariable("id") int id) {
        return userService.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public List<User> create(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<User> update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<User> delete(@RequestBody User user) {
        return userService.delete(user);
    }

}
