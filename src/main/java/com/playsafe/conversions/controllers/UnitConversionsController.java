package com.playsafe.conversions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.PlaySafe.FormatInput;
import com.assessment.PlaySafe.models.Conversions;
import com.playsafe.conversions.models.UnitConversions;
import com.playsafe.conversions.services.UnitConversionService;
import com.playsafe.conversions.validators.InputValidators;

@RestController
@RequestMapping("/conversions")
public class UnitConversionsController {
	
	@Autowired
	public UnitConversionService conversionService;
	
	@GetMapping("/test")
	public String test(){
		return "Api works";
	}
	
	@GetMapping("/ktoc/input={input}")
	public UnitConversions kelvinToCelcius(@PathVariable String input){
		try {
			double kelvin = InputValidators.stringToDouble(input);
			return conversionService.kelvinToCelcius(kelvin);
		}
		catch(Exception e) {
			return new UnitConversions("Invalid Input format","miles",0.00,"kilometres",0);
		}
		
	}

}
