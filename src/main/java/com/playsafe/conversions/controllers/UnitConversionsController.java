package com.playsafe.conversions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversions")
public class UnitConversionsController {
	
	@GetMapping("/test")
	public String test(){
		return "Api works";
	}

}
