package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	//Object Repository
	@FindBy(xpath="//img[@alt='Kite']")private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	@FindBy(xpath="//input[@id='userid']")private WebElement userIdTextbox;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginBtn;
	@FindBy(xpath="//input[@id='pin']")private WebElement pinTextbox;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueBtn;
	@FindBy(xpath="//span[@class='nickname']")private WebElement nicknamelabel;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public String veriftTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifykitelogo()
	{
		return kiteLogo.isDisplayed();
	}
	
	public boolean verifyzerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	
	public String loginToApp() throws InterruptedException, IOException
	{
		userIdTextbox.sendKeys(readPropertyFile("username"));
		passwordTextbox.sendKeys(readPropertyFile("password"));
		loginBtn.click();
		Thread.sleep(5000);
		pinTextbox.sendKeys(readPropertyFile("pin"));
		Thread.sleep(2000);
		continueBtn.click();
		Thread.sleep(10000);
		return nicknamelabel.getText();
		
	}

}
