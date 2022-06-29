package TestCases;
	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import java.io.IOException;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import Base.TestBase;
	import Pages.LoginPage;

	public class GroupTest extends TestBase{
		
		LoginPage login;
		@BeforeMethod (groups ={"sanity"})
		public void setup() throws IOException
		{
			intialization();
			login = new LoginPage();	
		}
		
		@Test (groups ={"sanity"})
		public void verifyTitleTest()
		{
			String title = login.veriftTitle();
			AssertJUnit.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
		}
		
		@Test(groups ={"sanity"})
		public void verifykiteLogoTest()
		{
			boolean value = login.verifykitelogo();
			AssertJUnit.assertEquals(value, true);
		}

		@Test (groups ={"Regression"})
		public void verifyzerodhaLogoTest()
		{
			boolean value= login.verifyzerodhaLogo();
			AssertJUnit.assertEquals(value, true);
		}
		
		@Test (groups ={"Regression"})
		public void loginToAppTest() throws InterruptedException, IOException
		{
			String text = login.loginToApp();
			AssertJUnit.assertEquals(text, "Dipak");
		}
		
		@AfterMethod (groups ={"sanity"})
		public void exit()
		{
		  driver.close();
		}
	
		}



