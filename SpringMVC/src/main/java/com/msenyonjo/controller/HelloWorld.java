package com.msenyonjo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.msenyonjo.person.Person;

/*
 * author: m.senyonjo.com
 * 
 */

@Controller
public class HelloWorld {
	private final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	@Autowired
	@Qualifier("person")
	private Person person;
	

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		logger.info("hello");
		logger.info(person.toString());
		logger.info("-----------------------------------------");

		//this.person.setFirstName("Muhamed");
		return new ModelAndView("welcome", "person", person);
	}

}
