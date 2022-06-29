package TestCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase{
	
	DashboardPage dash;
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		intialization();
		 login = new LoginPage();
	    dash = new DashboardPage();
	    login.loginToApp();
	}
	
	@Test 
	public void verifyusernameTest() throws InterruptedException
	{
		String value=dash.verifyusername();
		Assert.assertEquals(value, "Dipak Narendra Patil");
	}
	
	@Test 
	public void verifyEmailIdTest() throws InterruptedException
	{
		String value=dash.verifyEmailId();
		Assert.assertEquals(value, "deepatil001@gmail.com");
	}
	@Test 
	public void placegttorderTest() throws InterruptedException
	{
		dash.placegttorder();
	}
	
	@AfterMethod 
	public void exit()
	{
	  driver.close();
	}

}
