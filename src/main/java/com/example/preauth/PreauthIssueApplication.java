package com.example.preauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
public class PreauthIssueApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreauthIssueApplication.class, args);
	}

}
