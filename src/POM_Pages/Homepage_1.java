
package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Generic.Base_page_1;

public class Homepage_1 extends Base_page_1
{
	
		public Homepage_1(WebDriver driver)
		{
			super(driver);
		}
//	@FindBy(xpath = "//div[.='My Account']")
//	private WebElement clkaccount;

//	@FindBy(xpath="//div[.='Logout']")
//	private WebElement logoutbtn;

	@FindBy(xpath="//input[@class='LM6RPg']")
	private WebElement searchbox;

	@FindBy(xpath = "//button[@class='vh79eN']")
	private WebElement clksearch;



//	public void myaccount()
//	{
//		clkaccount.click();
//	}

//	public void logout()
//	{
//		logoutbtn.click();
//	}

	public void search(String mobliename )
	{
		searchbox.sendKeys(mobliename);
	}
	public void searchbtn()
	{
		visibleloctor("//button[@class='vh79eN']",5);	
		clksearch.click();
	}

}
