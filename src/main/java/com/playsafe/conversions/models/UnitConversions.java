package com.playsafe.conversions.models;

public class UnitConversions {
	
	private String requestStatus="Success";
	private String inputType;
	private double input;
	private String outputType;
	private double result;
	public UnitConversions(String requestStatus, String inputType, double input, String outputType, double result) {
		this.requestStatus = requestStatus;
		this.inputType = inputType;
		this.input = input;
		this.outputType = outputType;
		this.result = result;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getInputType() {
		return inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
	public double getInput() {
		return input;
	}
	public void setInput(double input) {
		this.input = input;
	}
	public String getOutputType() {
		return outputType;
	}
	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

}
