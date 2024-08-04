package com.devops.devops_project.controller;

import com.devops.devops_project.model.User;
import com.devops.devops_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docker")
//@RequiredArgsConstructor
@CrossOrigin(origins="*")
public class DockerDemoController {
    @Autowired
    UserService userService;


    //    @GetMapping("/testAPI")
//    public String testMethod() {
//        return "I am soumendra";
//    }
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
