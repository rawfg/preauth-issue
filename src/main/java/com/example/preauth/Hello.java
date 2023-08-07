package com.example.preauth;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Validated
public interface Hello {

    @PreAuthorize("hasRole('ROLE_ABC')")
    @GetMapping("/hello")
    ResponseEntity<String> sayHello();
}
