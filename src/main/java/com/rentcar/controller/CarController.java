package com.rentcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rentcar.service.CarServiceImpl;

@Controller
public class CarController {
	
	@Autowired
	private CarServiceImpl carService;
	
}
