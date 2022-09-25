package com.dockerexample.serviceb;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/1")
public class UserController {

   @GetMapping("/hello")
    public String saveUser(){
       return "Hello World";
    }
@GetMapping("/message")
    public String getMessage() {
    System.out.println("welcome to coding.....");
    return "welcome to coding.....";
}

}
