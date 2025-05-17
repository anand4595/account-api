package com.app.accounting.authentication.controller;

import com.app.accounting.user.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/sign-up")
public class SignUpController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/user", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public User userSignUp(@RequestBody User user){
        user.nullChecker().email().password().check();
        return user;
    }
}
