package com.ahme.json;

public class JSONNumber extends JSON{


	private double value; 
	
	public JSONNumber(double v)
	{
		this.value = v; 
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public String toString()
	{
		
		return value+""; 
	}

}
