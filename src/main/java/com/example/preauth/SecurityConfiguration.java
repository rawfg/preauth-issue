package com.example.preauth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
// when this annotation is present there is an exception:
// Found more than one annotation of type interface org.springframework.security.access.prepost.PreAuthorize
@EnableMethodSecurity(jsr250Enabled = true)
// when this deprecated annotation is present there is no exception and everything works just fine
// @EnableGlobalMethodSecurity(jsr250Enabled = true, prePostEnabled = true)
public class SecurityConfiguration {

    @Bean
    public UserDetailsService users() {
        UserDetails user = User.builder()
            .username("user")
            .password("{noop}pass")
            .roles("ABC")
            .build();
        return new InMemoryUserDetailsManager(user);
    }

}
