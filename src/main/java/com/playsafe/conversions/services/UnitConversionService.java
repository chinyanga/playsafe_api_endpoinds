package com.playsafe.conversions.services;

import org.springframework.stereotype.Service;

import com.playsafe.conversions.models.UnitConversions;

@Service
public class UnitConversionService {

	public UnitConversions kelvinToCelcius(double kelvin) {

		double celcius = (double) Math.round((kelvin - 273.15) * 100) * 100.00;
		return new UnitConversions("Success", "kelvin", kelvin, "celcius", celcius);
	}

	public UnitConversions celciusToKelvin(double celcius) {
		double kelvin = (double) Math.round((celcius + 273.15) * 100) / 100.00;
		return new UnitConversions("Success", "celcius", celcius, "kelvin", kelvin);
	}

	public UnitConversions kilometresToMiles(double kilometres) {

		double miles = (double) Math.round((kilometres / 1.60934) * 100) / 100.00;
		return new UnitConversions("Success", "kilometres", kilometres, "miles", miles);
	}

	public UnitConversions milesToKilometres(double miles) {
		double kilometres = (double) Math.round((miles * 1.60934) * 100) / 100.00;
		return new UnitConversions("Success", "miles", miles, "kilometres", kilometres);
	}

}
