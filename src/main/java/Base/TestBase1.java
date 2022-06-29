package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase1 {
	
	public static WebDriver driver;
	
//	public String readPropertyFile(String value);
//	{
//		Properties prop = new Properties();
//		FileInputStream file = new FileInputStream("C:\\Users\\Sanchit\\eclipse-workspace\\26FebFramework\\src\\main\\java\\Config\\Config.properties1");
//		prop.load(file);
//		return prop.getProperty(value);
//	}
	

	
	public void initialization()
	{
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.upstox.com/?");
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		driver.get(readPropertyFile("url"));
		
		
	}

}
