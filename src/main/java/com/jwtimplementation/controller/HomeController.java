package com.jwtimplementation.controller;

import com.jwtimplementation.model.User;
import com.jwtimplementation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    // http://localhost:8081/home/users
    @GetMapping("/users")
    public List<User> home()
    {
        System.out.println("home controller");
        return userService.getUserData();
    }

    // For getting which user is logedin
    // http://localhost:8081/home/current-user
    @GetMapping("/current-user")
    public String getUserLogedIn(Principal principal)
    {
        return principal.getName();
    }
}
