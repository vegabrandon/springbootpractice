package com.example.springbootpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final MongoTemplate mongoTemplate;

    public UserController {
        this.mongoTemplate
    }
    @PostMapping("/")
    public User postUser(@)
}
