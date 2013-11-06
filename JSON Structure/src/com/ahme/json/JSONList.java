package com.ahme.json;


import java.util.*;
public class JSONList extends JSON {

	ArrayList<JSON> list = new ArrayList<JSON>(); 
	
	
	public JSONList add(JSON obj)
	{
		list.add(obj); 
		return this; 
	}
	
	public String toString()
	{
		String result = "["; 
		
		for(JSON j :list)
		{
			
			result =result  + j.toString()+ ", "; 
		}
		result = result.substring(0, result.lastIndexOf(",")); 
		result= result +"]"; 
		return result; 
	}
}
