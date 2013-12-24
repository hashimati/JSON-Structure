package com.ahme.regex;

public class JSONChecker {
    
    private final String stringRegex = "\"(\\w|\\W)*\"" ; 
    private final String doubleRegex = "\\d*(\\.\\d+)?"; 
   
//==============================================================
    private final String jsonAttrRegex = "[\"a-zA-Z]+:(\\w|\\W)+"; 
    private final String jsonNumberAttrRegex = "[\"a-zA-Z]+:("+doubleRegex+")"; 
    private final String jsonListAttrRegex = "[\"a-zA-Z]+:\\[((\\w|\\W)+)?\\]"; 
    private final String jsonNestedRegex = "[\"a-zA-Z]+:\\{(\\w|\\W)?\\}"; 
    private final String jsonBooleanAttrRegex = "[\"a-zA-Z]+:([tT][rR][uU][eE]|[fF][aA][lL][sS][eE])";     
    private final String jsonStructureRegex ="\\{(([\"a-zA-Z]+:(\\w|\\W)+,[\"a-zA-Z]+:(\\w|\\W)+)+|[\"a-zA-Z]+:(\\w|\\W)+)?\\}"; 
    private final String jsonStringAttrRegex = "[\"a-zA-Z]+:\"(\\w|\\W)*\""; 
    private final String jsonNullAttrRegex = "[\"a-zA-Z]+:[nN][uU][lL][lL]"; 
    //======================================================================

    
    
    
    public boolean isJSONAttr(String attr)
    {
        return attr.matches(jsonAttrRegex); 
    }
    public boolean isJSONNumberAttr(String attr)
    {
        return attr.matches(jsonNumberAttrRegex); 
    }
    public boolean isJSONStructure(String structure)
    {
        return structure.matches(jsonStructureRegex); 
    }
    
    public boolean isJSONBooleanAttr(String attr)
    {
        return attr.matches(jsonBooleanAttrRegex); 
    }
    
    public boolean isJSONListAttr(String attr)
    {
        return attr.matches(jsonListAttrRegex); 
    }
    
    public boolean isJSONStringAttr(String attr)
    {
        return attr.matches(jsonStringAttrRegex); 
    }
    public boolean isJSONNullAttr(String attr)
    {
     return   attr.matches(jsonNullAttrRegex); 
    }
}
