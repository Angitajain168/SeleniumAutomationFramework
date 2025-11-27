package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	public void testValidLogin() {
		Log.info("Starting Login Test");
		LoginPage loginpage= new LoginPage(driver);
		Log.info("Searching Mobiles");
		loginpage.searchbox("mobile");
		
		loginpage.searchicon();
		
		
		System.out.println("Title is: " +driver.getTitle());
		Log.info("Verifying Page Title");
		Assert.assertEquals(driver.getTitle(), "Amazon.in : mobile");
		
		
	}

}
