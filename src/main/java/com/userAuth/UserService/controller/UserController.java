package com.userAuth.UserService.controller;

import com.userAuth.UserService.domain.User;
import com.userAuth.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/fetch/{username}")
    public ResponseEntity<User> fetchUser(@PathVariable String username) {
        Optional<User> user = userService.fetchUserByUsername(username);
        return user.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.status(404).body(null));
    }
}
