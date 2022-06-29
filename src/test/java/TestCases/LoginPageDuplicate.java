package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageDuplicate extends TestBase{
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		intialization();
		login = new LoginPage();	
	}
	
	@Test
	public void verifyTitleTest()
	{
		String title = login.veriftTitle();
		Assert.assertEquals("1Kite - Zerodha's fast and elegant flagship trading platform", title);
	}
	
	@Test 
	public void verifykiteLogoTest()
	{
		boolean value = login.verifykitelogo();
		Assert.assertEquals(value, true);
	}

	@Test 
	public void verifyzerodhaLogoTest()
	{
		boolean value= login.verifyzerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test
	public void loginToAppTest() throws InterruptedException, IOException
	{
		String text = login.loginToApp();
		Assert.assertEquals(text, "Dipak");
	}
	
	@AfterMethod
	
	public void exit() 
	{
		driver.close();
	}

}

