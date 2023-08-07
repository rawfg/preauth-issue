package com.example.preauth;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Validated
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SayHelloController implements SayHello {

    @Override
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.of(Optional.of("Hello!"));
    }
}
