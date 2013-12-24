package com.ahme.regex;

public class Util {

	
	//Must contains English Letters and whitespaces. 
    static public boolean isName(String name){
        return name.matches("[a-zA-Z\\s]+"); 
    }
    public static boolean isPinNumber(String pin)
    {
        return pin.matches("[0-9]{4}");
    }
   
    /**
     *  
     * @param email
     * @return true if email of form ( *@***.*** or *@***.***.***)
     * 
     */
    public static boolean isEmail(String email)
    {
        return email.matches("\\b[a-zA-Z\\.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2,3})?\\b"); 
    }
}
