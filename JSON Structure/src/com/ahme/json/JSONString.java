package com.ahme.json;

public class JSONString extends JSON
{
	private String value; 
	
	public JSONString(String v)
	{
		value = v; 
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString()
	{
		
		return "\"" +value +"\""; 
	}
}
