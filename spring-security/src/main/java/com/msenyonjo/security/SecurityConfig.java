package com.msenyonjo.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({ "com.msenyonjo.security" })
@EnableWebMvc
public class SecurityConfig {

	   public SecurityConfig() {
	        super();
	    }
}
