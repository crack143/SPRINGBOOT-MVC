package com.cbs.model.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LandingPage {

	
	private final Logger log = LoggerFactory.getLogger(LandingPage.class);
	 
	
    @RequestMapping(value ="/")
    String requisitionMain(Model model) {
	    	log.debug("This is the page:" + model);
        return "index";
    }	
	
    @RequestMapping(value ="/login",method = RequestMethod.GET)
    String loginPage(ModelMap modelMap) {
	    	log.debug("This is the page:" + modelMap);
        return "script/login/login";
    }	
	
    
    @RequestMapping(value ="/test")
    String testCase(Model model) {
	    	log.debug("This is the page:" + model);
        return "test";
    }	
    
    
    
}
