package com.microserviceexample.user.controller;

import com.microserviceexample.user.UserServiceApplication;
import com.microserviceexample.user.VO.ResponseTemplateVO;
import com.microserviceexample.user.entity.Users;
import com.microserviceexample.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users user){
        log.info("saving the user " + user);
        return userService.saveUser(user);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserwithDepartment(userId);
    }
    @GetMapping("all")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }
}
