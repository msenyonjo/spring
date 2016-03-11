package com.psyclelondon.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.psyclelondon.DAOimpl.BikeDaoImpl;
import com.psyclelondon.bike.PscycleBike;

//Form handling controller

@Controller

public class Bikes2016 {
	private final Logger logger = LoggerFactory.getLogger(Bikes2016.class);

	@Autowired
	@Qualifier("daoimpl")
	private BikeDaoImpl bikes;

	@RequestMapping(value= "/welcome", method=RequestMethod.GET)
	public ModelAndView showBikePage(Model model) {
		List<PscycleBike> bikes = this.bikes.getAllPscycleBikes();

		for (PscycleBike bike : bikes)
			logger.info("Bike info: {}", bike.toString());

		logger.info("Starting");
		ModelAndView mav = new ModelAndView("welcome");
		mav.setViewName("welcome");
		logger.info("Setting the view name to: {} ", mav.getViewName());
		model.addAttribute("bikes", bikes);
		return mav;
	}

}
