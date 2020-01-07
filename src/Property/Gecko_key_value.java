package Property;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class Gecko_key_value  
{
	@BeforeMethod	
	public static void  login() throws IOException 
	{
	//Property_file.getapplication();
	System.setProperty("gecko_key","gecko_value");
	WebDriver driver = new FirefoxDriver();
	driver.get("url");
//	gecko_key = webdriver.gecko.driver
//	gecko_value = ./Drivers/geckodriver.exe
	
	}
}
