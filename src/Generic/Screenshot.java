package Generic;

import java.io.File;






import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
 public static	String path ="./Photos/"+System.currentTimeMillis()+".npg";
public static String photos(WebDriver driver) throws IOException
{
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(path);
	FileHandler.copy(src, dst);
	return path;
	}

}
