package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase{

	@FindBy(xpath="//div[@class='avatar']")private WebElement avtarIcon;
	@FindBy(xpath="//h4[@class='username']")private WebElement username;
	@FindBy(xpath="//div[@class='email']")private WebElement email;
	
	@FindBy(xpath="//button[text()='Start investing ']")private WebElement startInvestBtn;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement searchBar;
	@FindBy(xpath="//span[@class='tradingsymbol']")private WebElement selectShare;
	@FindBy(xpath="//button[text()='Create GTT ']")private WebElement creteGttBtn;
	@FindBy(xpath="//input[@label='Trigger price']")private WebElement trrigerPriceTextbox;
	@FindBy(xpath="//input[@label='Qty.']")private WebElement qtyTestbox;
	@FindBy(xpath="//input[@label='Price']")private WebElement priceTestbox;
	@FindBy(xpath="//button[normalize-space(text())= 'Cancel']")private WebElement cancelBtn;
	 	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyusername() throws InterruptedException
	{
		avtarIcon.click();
		Thread.sleep(2000);
		return username.getText();
	}
	
	public String verifyEmailId() throws InterruptedException
	{
		avtarIcon.click();
		Thread.sleep(2000);
		return email.getText();
	}
	public void placegttorder() throws InterruptedException
	{
		startInvestBtn.click();
		Thread.sleep(2000);
		searchBar.sendKeys("INFY");
		Thread.sleep(2000);
		selectShare.click();
		Thread.sleep(2000);
		creteGttBtn.click();
		Thread.sleep(2000);
		trrigerPriceTextbox.clear();
		Thread.sleep(2000);
		trrigerPriceTextbox.sendKeys("1400");
		Thread.sleep(2000);
		qtyTestbox.clear();
		Thread.sleep(2000);
		qtyTestbox.sendKeys("10");
		Thread.sleep(2000);
		priceTestbox.clear();
		Thread.sleep(2000);
		priceTestbox.sendKeys("1450");
		cancelBtn.click();
		Thread.sleep(2000);

	}

}
