package com.artTrade.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.artTrade.app.domain.EventOrg;
import com.artTrade.app.repository.EventOrgRepositoryImpl;
import com.artTrade.app.services.EventOrgService;

@Controller
public class EventOrgController {
	private static final Logger logger = LoggerFactory.getLogger(EventOrgRepositoryImpl.class);
	
	@Autowired
	EventOrgService eoService;
	
	@RequestMapping(value="/eventOrg", method = RequestMethod.GET)
	public String eventOrgSignUpForm(Model m) {
		logger.info("Get event organizer form");
		m.addAttribute("eventOrg", new EventOrg());
		return "eventOrgSignup";
	}
	
	@RequestMapping(value="/eventOrg", method = RequestMethod.POST)
	public String addEventOrg(Model m, @Valid @ModelAttribute("eventOrg") EventOrg eo, BindingResult result ) {
		logger.info("Event Org Sign Up Post, before validation");
		if (result.hasErrors()) {
			logger.info("Number of Errors: " + result.getErrorCount());
			return "eventOrgSignup";
		}
		List<EventOrg> existEo = eoService.getEventOrgByEmail(eo.getEmail());
		if (existEo != null && existEo.size() > 0){
			result.rejectValue("email", "error.user", "An account already exists for this email.");
			return "eventOrgSignup";
		}
		eo.setPassword(eoService.encryptPassword(eo.getPassword()));
		eoService.addEventOrg(eo);
		logger.info("Validation Passed. Return Sign up Success");
		
		return "signupSuccess";
	}
}
