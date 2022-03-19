package userReg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
	

	public static void main(String[] args) {
		/**
		 * User Registration Program to get the First Name, Last Name, Mail, Phone Number, 
		 * Password using Scanner 
		 */
	Scanner sc=new Scanner(System.in);
	System.out.println ("Please enter First name:");
	String fName=sc.nextLine();
	isValidFirstName(fName);
	
	System.out.println ("Please enter Last name:");
	String lName=sc.next();
	isValidLastName(lName);
	
	System.out.println ("Please enter Email:");
	String email=sc.next();
	isValidEmail(email);
	
	System.out.println ("Please enter Phone Number:");
    String phnNo=sc.next();
	isValidPhoneNo(phnNo);

	System.out.println ("Please enter Password:");
	String passWord=sc.next();
	isValidPassword(passWord);

	sc.close();
	}
	
	 public static boolean isValidFirstName(String fName)
	    {
	  
	        /**
	         *  Regex to check valid Firstname.
	         **/
	        String regex = "^[A-Z][a-z]{2,}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(fName);
	        
	        	        
	        if(matcher.find()) {
	            System.out.println("FirstName is valid");
	         } else {
	            System.out.println("FirstName is not valid");
	         }
			return true;
			
	    }
	 /**
	  * Have to check my entered First Name is valid or not
	  * If it is not valid mean, it throws a Message 
	  * @param firstName
	  * @return
	  * @throws invalidInputException
	  */
	 
	 	public boolean testValidFirstName(String fName) throws invalidInputException {
	        try {
	            if (!isValidFirstName(fName)) {
	                throw new invalidInputException("Entered FirstName is Invalid\n" +
	                        "First name starts with Capital Letter and has\n" +
	                        "minimum 3 characters");
	            } else {
	                System.out.println("Entered FirstName is Valid");
	            }
	        } catch (invalidInputException e) {
	            System.out.println("Exception is Occurred " + e);
	            e.printStackTrace();
	        }
	        return isValidFirstName(fName);
	    }
	 
	 public static boolean isValidLastName(String lName)
	    {
	  
	        /**
	         *  Regex to check valid Lastname.
	        **/
	        String regex = "^[A-Z][a-z]{2,}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(lName);
	        
	     	        
	        if(matcher.find()) {
	            System.out.println("Lastname is valid");
	         } else {
	            System.out.println("Lastname is not valid");
	         }
			return true;
	        
	    }
	 
	 	public boolean testValidLastName(String lName) throws invalidInputException {
	        try {
	            if (!isValidLastName(lName)) {
	                throw new invalidInputException("Entered LastName is Invalid\n" +
	                        "First name starts with Capital Letter with minimum 3 characters");
	            } else {
	                System.out.println("Entered LastName is Valid");
	            }
	        } catch (invalidInputException e) {
	            System.out.println("Exception is Occurred " + e);
	            e.printStackTrace();
	        }
	        return isValidLastName(lName);
	    }
	 
	 
	 public static boolean isValidEmail(String email)
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
	 
		public boolean testValidEmail(String email) throws invalidInputException {
	        try {
	            if (!isValidEmail(email)) {
	                throw new invalidInputException("Entered Email is Invalid");
	            } else {
	                System.out.println("Entered Email is Valid");
	            }
	        } catch (invalidInputException e) {
	            System.out.println("Exception is Occurred " + e);
	            e.printStackTrace();
	        }
	        return isValidLastName(email);
	    }
	 
	 
	 public static boolean isValidPhoneNo(CharSequence phnNo)
    {
  
        /**
         *  Regex to check valid Phone Number.
        **/
	    String regex =  "^(?:(?:\\+|0{0,2})[0-9](\\s*[\\ -]\\s*)?|[0]?)?[6-9]\\d{9}|(\\d[ -]?){10}\\d$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phnNo);
        
     	        
        if(matcher.find()) {
            System.out.println("Phone Number is valid");
         } else {
            System.out.println("Phone Number is not valid");
         }
        return true;
        
    }
	 
	 public boolean testValidPhoneNumber(String phnNo) throws invalidInputException {
	        try {
	            if (!isValidPhoneNo(phnNo)) {
	                throw new invalidInputException("Entered Phone Number is Invalid");
	            } else {
	                System.out.println("Entered Phone Number is Valid");
	            }
	        } catch (invalidInputException e) {
	            System.out.println("Exception is Occurred " + e);
	            e.printStackTrace();
	        }
	        return isValidPhoneNo(phnNo);
	    }
	 
	 
	 public static boolean isValidPassword(String passWord)
	    {
	  
	        /**
	         *  Regex to check valid Password.
	        **/
		    String regex =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(passWord);
	        
	     	        
	        if(matcher.find()) {
	            System.out.println("Password is valid");
	         } else {
	            System.out.println("Password is not valid");
	         }
	        return true;
	        
	    }
	 
	 public boolean testValidPassword(String password) throws invalidInputException {
	        try {
	            if (!isValidPassword(password)) {
	                throw new invalidInputException("Entered password is Invalid, Password should contain atleast Special Char, Numeric, Capital Letter");
	            } else {
	                System.out.println("Entered Password is Valid");
	            }
	        } catch (invalidInputException e) {
	            System.out.println("Exception is Occurred " + e);
	            e.printStackTrace();
	        }
	        return isValidPassword(password);
	    }
	 
	 
}