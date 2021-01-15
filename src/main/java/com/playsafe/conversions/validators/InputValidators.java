package com.playsafe.conversions.validators;

public class InputValidators {

	public static double stringToDouble(String input) {
		try {
			if (input != null || !input.isEmpty()) {
				if (input.contains(","))
					input = input.replace(",", ".");
			}
			return Double.parseDouble(input);
		} catch (Exception e) {
			throw e;
		}
	}
}
