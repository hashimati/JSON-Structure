package com.ahme.test;
import java.util.ArrayList;

import com.ahme.json.JSONList;
import com.ahme.json.JSONObject;
import com.ahme.json.JSONString;
import com.ahme.json.JSONBoolean;

public class test {

	
	public static void main(String... args)
	{
		
		JSONObject myData = new JSONObject()
				.bind("firstname", new JSONString("Ahmed"))
				.bind("lastname",new JSONString("Al Hashmi"))
				.bind("From",new JSONString("Saudi Arabia"))
				.bind("reading", new JSONList().add(new JSONString("Java Books")).add(new JSONString("Python Books")))
				.bind("Programmer", new JSONBoolean(true))
				.bind("Address", new JSONObject()
					.bind("Country",new JSONString("Saudi Arabia"))
					.bind("City", new JSONString("Saihat"))
				)
				
			;
		
		System.out.println(myData); 
	}
}
