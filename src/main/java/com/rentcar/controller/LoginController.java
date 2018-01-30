package com.rentcar.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value ={"/", "/welcome**"}, method = RequestMethod.GET)
	public ModelAndView welcomePage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page");
		model.setViewName("welcome");
		return model;
	}
	
	@RequestMapping(value ={"/admin**"}, method = RequestMethod.GET)
	public ModelAndView adminPage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Admin Page");
		model.setViewName("admin");
		return model;
	}
	
	
	
	@RequestMapping(value ={"/login"}, method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value="error", required = false) String error, @RequestParam(value="logout", required = false) String logout){
		ModelAndView model = new ModelAndView();
		if (error != null){
			model.addObject("error","Invalid Username and Password!");
		}
		if (logout != null){
			model.addObject("message","Logged Out Succesfull");
		}
		model.setViewName("login");
		return model;
	}
	
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView model = new ModelAndView();

		//check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			model.addObject("username", userDetail.getUsername());
		}

		model.setViewName("403");
		return model;

	}
}
