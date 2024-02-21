package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserRepository userRepository;

    @DeleteMapping("/users/{id}")
    public void removeUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @GetMapping("/userAdmin")
    public String get1() {
        return "admin";
    }
}
