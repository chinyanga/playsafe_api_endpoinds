package com.playsafe.conversions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping("/ctok/input={input}")
	public UnitConversions celciusToKelvin(@PathVariable String input){
		try {
			double celcius = InputValidators.stringToDouble(input);
			return conversionService.celciusToKelvin(celcius);
		}
		catch(Exception e) {
			return new UnitConversions("Invalid Input format","miles",0.00,"kilometres",0);
		}
	}
	
	@GetMapping("/mtok/input={input}")
	public UnitConversions milesToKilometres(@PathVariable String input){
		try {
			double miles = InputValidators.stringToDouble(input);
			return conversionService.milesToKilometres(miles);
		}
		catch(Exception e) {
			return new UnitConversions("Invalid Input format","miles",0.00,"kilometres",0);
		}
		
	}
	
	@GetMapping("/ktom/input={input}")
	public UnitConversions kilometresToMiles(@PathVariable String input){
		try {
			double kilometres = InputValidators.stringToDouble(input);
			return conversionService.kilometresToMiles(kilometres);
		}
		catch(Exception e) {
			return new UnitConversions("Invalid Input format","kilometres",0.00,"miles",0);
		}
		
	}

}
