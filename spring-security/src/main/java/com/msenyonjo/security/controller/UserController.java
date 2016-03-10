package com.msenyonjo.security.controller;


import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.common.collect.Lists;

@Controller
@RequestMapping(value = "users")
public class UserController {

	
	 // API

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll(final UriComponentsBuilder uriBuilder) {
        return Lists.newArrayList(new User("someUser01", "somePass01", null));
    }
}
