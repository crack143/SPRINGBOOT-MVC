/*package com.cbs.resource;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafResource {

	 private final Logger log = LoggerFactory.getLogger(ThymeleafResource.class);
 
	
	    @RequestMapping(value ="/")
	    String requisitionMain(Model model) {
 	    	log.debug("This is the page:" + model);
	        return "homeMain";
	    }	
	
	    
	    @RequestMapping(value ="/login")
	    String login(Model model) {
 	    	log.debug("This is the page:" + model);
	        return "/script/login/login.jsp";
	    }	
	    
}
*/