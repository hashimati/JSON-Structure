package com.ahme.json;
import java.util.ArrayList;
import java.util.HashMap;


public class JSONObject extends JSON {



	HashMap<String, JSON> objs = new HashMap<String, JSON>();
	private ArrayList<String> structureOrder = new ArrayList<String>(); 

	public JSONObject bind(String name, JSON obj)
	{
		objs.put(name, obj);
		structureOrder.add(name); 
		return this; 
	}
	public JSON get(String obj)
	{
		return objs.get(obj); 	
	}
	public void remove(String obj)
	{
		
		objs.remove(obj); 
	}
	
	public String toString()
	{
		String result = "{\n"; 
		
		for(String s: structureOrder){
			
			result +="\t"+s+ ":" + get(s).toString() + ",\n "; 
		}
		result = result.substring(0, result.lastIndexOf(",")); 
		result= result +"\n}"; 
		  
		
		return result; 
	}
}
