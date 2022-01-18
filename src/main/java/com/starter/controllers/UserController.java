package com.starter.controllers;

import com.starter.models.UserObject;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import com.starter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/{seed}")
    public Mono<UserObject[]> getUserBySeed(@PathVariable String seed) {
        return service.getUserBySeed(seed);
    }
}
