package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase1;

public class LoginPage1 extends TestBase1{
	@FindBy(xpath = "//div[@class='a g']")private WebElement upstoxLogo;
	@FindBy(xpath = "//h2[@class='bq ak br bs bt']")private WebElement LetGetSatrtedText;
	
	//Methods
//	public String verifyTitle()
//	{
//	return driver.getTitle();
//	}
	public LoginPage1() 
	{
		PageFactory.initElements(driver, this);	
	}
	public void verifyupstoxLogo()
	{
		upstoxLogo.isDisplayed();
	}
	
	public void verifyLetGetSatrtedText()
	{
		LetGetSatrtedText.isDisplayed();
	}

}
