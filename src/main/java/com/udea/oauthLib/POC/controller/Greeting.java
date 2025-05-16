package com.udea.oauthLib.POC.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @GetMapping("/")
    ResponseEntity<String> greeting() {
        return new ResponseEntity<>("Welcome to OAuthPOC", HttpStatus.OK);
    }

}
