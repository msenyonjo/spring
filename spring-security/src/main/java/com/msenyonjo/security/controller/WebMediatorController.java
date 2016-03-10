package com.msenyonjo.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public final class WebMediatorController {

	 public WebMediatorController() {
	    }

	    // API

	    @RequestMapping(value = "/index")
	    public String home() {
	        return "index";
	    }
}
