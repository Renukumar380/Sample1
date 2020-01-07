package Regression;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;








import POM_Pages.Homepage_1;
import POM_Pages.Loginpage_1;
import Generic.Screenshot;


public class Test1 
{
	public static ExtentTest test;
	public static ExtentReports Reporters;
	public static ExtentHtmlReporter Rp;		
	@Test
	public void signup() throws IOException
	{
		 Rp = new ExtentHtmlReporter(new File("./Reports/"+System.currentTimeMillis()+".html"));
		 Reporters = new ExtentReports();
		Reporters.attachReporter(Rp);
		
		
		 test = Reporters.createTest("Lanuching browser");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		test.info("Test start");
		Loginpage_1 lp = new Loginpage_1(driver);
		
		lp.setusername("renukumar380@gmail.com");
		test.pass("Enter the name");
		lp.setpassword("9738050380");
		test.pass("Enter the Pwd");
		lp.clklogin();
		test.pass("Add photo",MediaEntityBuilder.createScreenCaptureFromPath(Screenshot.photos(driver)).build());
		test.info("test end");
		
		Homepage_1 hp=new Homepage_1(driver);
		//hp.myaccount();
		//hp.logout();
		hp.search("moblie");
		hp.searchbtn();
		
		Reporters.flush();
		
	}
			
	}



