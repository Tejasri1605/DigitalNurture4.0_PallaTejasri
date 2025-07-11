package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

@RestController
public class AuthenticationController {

    private static final Key key = Keys.hmacShaKeyFor("your_very_secret_key_that_is_long_enough_123".getBytes());

    @GetMapping("/authenticate")
    public ResponseEntity<String> authenticate(Authentication authentication) {
        String username = authentication.getName();
        String token = generateJwt(username);
        return ResponseEntity.ok(token);
    }

    private String generateJwt(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 hours
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
