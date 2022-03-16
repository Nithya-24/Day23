package userReg;

import static org.junit.Assert.*;

import org.junit.Test;


public class UserRegTest {
	/**
	 * Test case for the user Registration UC to check FirstName 
	 * First Name Is Proper mean it should Return True
	 */

	@Test
	public void UserRegtest_ForFirstName_WhenProper_returnTrue() {
	//	UserRegistration userReg = new UserRegistration();
		boolean result = UserRegistration.isValidFirstName("Nithya");
		boolean expected = true;
		assertEquals(expected, result);
	}
	/**
	 * Test case for the user Registration UC to check LastName 
	 * Last Name Is Proper mean it should Return True
	 */
	
	@Test
	public void UserRegtest_ForLastName_WhenProper_returnTrue() {
	//	UserRegistration userReg = new UserRegistration();
		boolean result = UserRegistration.isValidLastName("Ram");
		boolean expected = true;
		assertEquals(expected, result);
	}
	
	/**
	 * Test case for the user Registration UC to check Email
	 * Email Is Proper mean it should Return True
	 */
	
	@Test
	public void UserRegtest_ForEmail_WhenProper_returnTrue() {
	//	UserRegistration userReg = new UserRegistration();
		boolean result = UserRegistration.isValidEmail("nithyaram@gmail.com");
		boolean expected = true;
		assertEquals(expected, result);
	}
	
	/**
	 * Test case for the user Registration UC to check Phone Number
	 * Phone Number Is Proper mean it should Return True
	 */
	
	@Test
	public void UserRegtest_ForPhnNo_WhenProper_returnTrue() {
	//	UserRegistration userReg = new UserRegistration();
		boolean result = UserRegistration.isValidPhoneNo("+91-7894561230");
		boolean expected = true;
		assertEquals(expected, result);
	}
	
	/**
	 * Test case for the user Registration UC to check Password
	 * Password Is Proper mean it should Return True
	 */
	
	@Test
	public void UserRegtest_ForPassword_WhenProper_returnTrue() {
	//	UserRegistration userReg = new UserRegistration();
		boolean result = UserRegistration.isValidPassword("Nithya123@");
		boolean expected = true;
		assertEquals(expected, result);
	}
	

}
