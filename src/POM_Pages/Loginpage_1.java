package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_page_1;

public class Loginpage_1  extends Base_page_1
{
	public Loginpage_1(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
private WebElement username;

@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
private WebElement password;

@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
private WebElement loginbtn;

public void setusername(String uname)
{
	username.sendKeys(uname);
}
public void setpassword(String Passwrd)
{
	password.sendKeys(Passwrd);
}
public void clklogin()
{
	loginbtn.click();
}

}
