package com.ahme.json;

public class JSONBoolean extends JSON{

	private boolean value; 
	
	public JSONBoolean(boolean v)
	{
		this.value = v; 
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
	
	public String toString()
	{
		
		return value+""; 
	}

}
