package TestCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase1;
import Pages.LoginPage1;

public class LoginPageTest1 extends TestBase1{
	
	LoginPage1 login;
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		login = new LoginPage1();
	
	}
	
//	@Test
//	public void verifyTitleTest()
//	{
//		String title = login.verifyTitle();
//		Assert.assertEquals("We’ll send you a one-time password (OTP) to verify your mobile number", title);
//	}
	
	@Test
	public void verifyupstoxLogoTest()
	{
	login.verifyupstoxLogo();
	}
	
	@Test
	public void verifyLetGetSatrtedTextTest()
	{
	login.verifyLetGetSatrtedText();
	}
	
	@AfterMethod
	public void exit() 
	{
		driver.close();
	}
	

}
