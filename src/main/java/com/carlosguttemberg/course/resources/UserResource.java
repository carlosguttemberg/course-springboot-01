package com.carlosguttemberg.course.resources;

import com.carlosguttemberg.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Joao", "joao@gmail.com", "(22)99999-9999", "123");

        return ResponseEntity.ok().body(user);
    }
}
