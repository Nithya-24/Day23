package userReg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId {
	
	 public boolean isValidEmail(String email)
	    {
	  
	        /**
	         *  Regex to check valid email.
	        **/
	        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);
	        
	     
	        
	        if(matcher.find()) {
	            System.out.println("email is valid");
	         } else {
	            System.out.println("email is not valid");
	         }
	        return true;
	        
	    }

}
