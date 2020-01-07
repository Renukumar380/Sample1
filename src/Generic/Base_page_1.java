package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base_page_1 
{	
	public WebDriver driver;
	public Base_page_1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void elementclickloc(String xpath,int Seconds)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Seconds);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			Reporter.log("Element is click", true);
			} 
		    catch (Exception e) 
			{
			Reporter.log("Element is unable to click", true);
			}
		}

	public void elementclick(WebElement element,int Seconds)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Seconds);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Reporter.log("Element is click", true);
			} 
		    catch (Exception e) 
			{
			Reporter.log("Element is unable to click", true);
			}
		}
	public void visfy_title_cont(String title,int Seconds)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Seconds);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is displayed", true);
			} 
		    catch (Exception e)  
			{
			Reporter.log("title is not displayed", true);
			}
		}
	public void  verify_title(String title,int Seconds)
		{
			try {
				WebDriverWait wait = new WebDriverWait(driver, Seconds);
				wait.until(ExpectedConditions.titleIs(title));
				Reporter.log("Element is visible", true);
				} 
			    catch (Exception e) 
				{
				Reporter.log("Element is not visible", true);
				}
			}

	public void  visibality_of(WebElement element,int Seconds)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is visible", true);
			} 
		    catch (Exception e) 
			{
			Reporter.log("Element is not visible", true);
			}
		}

	public void uRL_contain(String url,int Seconds)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Seconds);
			wait.until(ExpectedConditions.urlContains(url));
			Reporter.log("URl is correct", true);
			} 
		    catch (Exception e) 
			{
			Reporter.log("URl is not correct", true);
			}
		}
	public void uRL_To_Be(String url,int Seconds)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Seconds);
			wait.until(ExpectedConditions.urlToBe(url));
			Reporter.log("URl is correct", true);
			} 
		    catch (Exception e) 
			{
			Reporter.log("URl is not correct", true);
			}
		}
	public void visibleloctor(String xpath,int Seconds)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Seconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Reporter.log("Element is visible", true);
			} 
		    catch (Exception e) 
			{
			Reporter.log("Element is not visible", true);
			}
		}

}
