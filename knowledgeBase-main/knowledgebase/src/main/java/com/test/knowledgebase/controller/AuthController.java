package com.test.knowledgebase.controller;

import com.test.knowledgebase.entity.User;
import com.test.knowledgebase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // @PostMapping("/register")
    // public ResponseEntity<?> register(@RequestBody User user) {
    //     if (userService.existsByEmail(user.getEmail())) {
    //         return ResponseEntity.badRequest().body("Email already exists");
    //     }
    //     return ResponseEntity.ok(userService.save(user));
    // }


    @PostMapping("/register")
    public ResponseEntity<?> register(@ModelAttribute User user) {
    if (userService.existsByEmail(user.getEmail())) {
        return ResponseEntity.badRequest().body("Email already exists");
    }
    return ResponseEntity.ok(userService.save(user));
}


    // Login endpoint can be implemented using JWT authentication logic
}
