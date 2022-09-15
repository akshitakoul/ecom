package com.ex.eco.controller;

import com.ex.eco.dto.ResponseDto;
import com.ex.eco.dto.user.SignInDto;
import com.ex.eco.dto.user.SignInReponseDto;
import com.ex.eco.dto.user.SignupDto;
import com.ex.eco.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    // two apis

    // signup

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }


    // signin

    @PostMapping("/signin")
    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }


}
