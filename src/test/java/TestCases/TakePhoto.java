package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.Utility1;

public class TakePhoto extends TestBase{
	
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
	
	@AfterMethod
	
	public void exit(ITestResult it) throws IOException 
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
			Utility1.screenshot(it.getName()); 
		}
		driver.close();
	}

}
