package com.ahme.regex;
/*

	Number (double-precision floating-point format in JavaScript, generally depends on implementation)
	String (double-quoted Unicode, with backslash escaping)
	Boolean (true or false)
	Array (an ordered, comma-separated sequence of values enclosed in square brackets; the values do not need to be of the same type)
	Object (an unordered, comma-separated collection of key:value pairs enclosed in curly braces, with the ':' character separating the key and the value; the keys must be strings and should be distinct from each other)
	null (empty)

*/
public class JSONChecker {
    
    private final String stringRegex = "\"(\\w|\\W)*\"" ; 
    private final String doubleRegex = "\\d*(\\.\\d+)?"; 
   
//==============================================================
    private final String jsonAttrRegex = "[\"a-zA-Z]+\\s*:\\s*(\\w|\\W)+"; 
    private final String jsonNumberAttrRegex = "[\"a-zA-Z]+\\s*:\\s*("+doubleRegex+")"; 
    private final String jsonListAttrRegex = "[\"a-zA-Z]+\\s*:\\s*\\[((\\w|\\W)+)?\\]"; 
    private final String jsonNestedRegex = "[\"a-zA-Z]+\\s*:\\s*\\{(\\w|\\W)?\\}"; 
    private final String jsonBooleanAttrRegex = "[\"a-zA-Z]+\\s*:\\s*([tT][rR][uU][eE]|[fF][aA][lL][sS][eE])";     
    private final String jsonStructureRegex ="\\{(([\"a-zA-Z]+\\s*:\\s*(\\w|\\W)+\\s*,\\s*[\"a-zA-Z]+\\s*:\\s*(\\w|\\W)+)+|[\"a-zA-Z]+\\s*:\\s*(\\w|\\W)+)?\\}"; 
    private final String jsonStringAttrRegex = "[\"a-zA-Z]+\\s*:\\s*\"(\\w|\\W)*\""; 
    private final String jsonNullAttrRegex = "[\"a-zA-Z]+\\s*:\\s*[nN][uU][lL][lL]"; 
    //======================================================================

    
    
    
    public boolean isJSONAttr(String attr)
    {
        return attr.trim().matches(jsonAttrRegex); 
    }
    public boolean isJSONNumberAttr(String attr)
    {
        return attr.trim().matches(jsonNumberAttrRegex); 
    }
    public boolean isJSONStructure(String structure)
    {
        return structure.trim().matches(jsonStructureRegex); 
    }
    
    public boolean isJSONBooleanAttr(String attr)
    {
        return attr.trim().matches(jsonBooleanAttrRegex); 
    }
    
    public boolean isJSONListAttr(String attr)
    {
        return attr.trim().matches(jsonListAttrRegex); 
    }
    
    public boolean isJSONStringAttr(String attr)
    {
        return attr.trim().matches(jsonStringAttrRegex); 
    }
    public boolean isJSONNullAttr(String attr)
    {
     return   attr.trim().matches(jsonNullAttrRegex); 
    }
    
   
}
