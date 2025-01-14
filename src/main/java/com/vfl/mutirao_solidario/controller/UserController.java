package com.vfl.mutirao_solidario.controller;

import com.vfl.mutirao_solidario.controller.dto.Signin;
import com.vfl.mutirao_solidario.controller.dto.Signup;
import com.vfl.mutirao_solidario.controller.dto.AuthResponse;
import com.vfl.mutirao_solidario.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final AuthenticationService authenticationService;

    @RequestMapping(method = RequestMethod.POST, value = "/signin")
    public ResponseEntity<AuthResponse> signin(@Valid @RequestBody Signin user){
        return ResponseEntity.ok(authenticationService.signin(user));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signup")
    public ResponseEntity<AuthResponse> signup(@Valid @RequestBody Signup user){
        return ResponseEntity.ok(authenticationService.signup(user));
    }

}
