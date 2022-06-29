package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver;
	
	public String readPropertyFile(String value) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sanchit\\eclipse-workspace\\26FebFramework\\src\\main\\java\\Config\\Config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}
	
	public void intialization() throws IOException
	{
		String browserName = readPropertyFile("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions o = new ChromeOptions();
			o.addArguments("--disable-notifications");
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver =new ChromeDriver(o);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.geko.driver", "gekodriver");
			driver =new FirefoxDriver();
		}
		
	
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.get(readPropertyFile("url"));
	}
		
		public String readExcelFile(int rowNum, int colNum) throws EncryptedDocumentException, IOException
		{
			FileInputStream file = new FileInputStream("C:\\Users\\Sanchit\\eclipse-workspace\\26FebFramework\\TestData\\TestDataFile1.xlsx");
			Sheet excelsheet = WorkbookFactory.create(file).getSheet("Sheet1");
		    String value = excelsheet.getRow(0).getCell(0).getStringCellValue();
		    return value;
			
		}
			
}
