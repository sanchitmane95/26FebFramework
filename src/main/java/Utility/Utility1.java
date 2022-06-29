package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class Utility1 extends TestBase {
	
	public static void screenshot(String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sanchit\\eclipse-workspace\\26FebFramework\\Screenshots/"+name+".jpeg");
		FileHandler.copy(source, dest);
		
	}

}
