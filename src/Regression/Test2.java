package Regression;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM_Pages.Homepage_1;
import POM_Pages.Loginpage_1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Test2 
{
	public static  ExtentHtmlReporter htmlreport;
	public static  ExtentReports rp;
	public static ExtentTest test;
@Test
public void testclass() 
{
	
	        
	 htmlreport = new ExtentHtmlReporter (new File("./Reports/"+System.currentTimeMillis()+".html"));
	 rp=new ExtentReports();
	 rp.attachReporter(htmlreport);
	 ExtentTest test = rp.createTest("Lanch the browser");
	 
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	
	test.info("test started");
	Loginpage_1 lp = new Loginpage_1(driver);
	test.info("test started");
	lp.setusername("renukumar380@gmail.com");
	test.pass("Pass UserName");
	lp.setpassword("9738050380");
	test.pass("Pass PassWord");
	lp.clklogin();
	test.info("Test End");
	rp.flush();
	Homepage_1 hp=new Homepage_1(driver);
	//hp.myaccount();
	//hp.logout();
	hp.search("moblie");
	hp.searchbtn();
}
}
