package com.Ankit.UserCrudOperations.controller;

import com.Ankit.UserCrudOperations.model.User;
import com.Ankit.UserCrudOperations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
UserService userService;
    @PostMapping("user")
    public String createUser(@RequestBody User user){
        return userService.CreateUser(user);

    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }
    @DeleteMapping("user/phNo/{userId}")
    public String deleteUserPhone(@PathVariable Long userId){
        return userService.deleteUserPhone(userId);
    }
    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable Long id){
       return userService.deleteUser(id);
    }

    @PutMapping("user/{id}")
    public String updateUserDetails(@PathVariable Long id, @RequestBody User user){
        return userService.updateUserDetails(id,user);
    }
}
