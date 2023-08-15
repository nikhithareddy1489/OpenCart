package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//created constructor in Basepage and extended it in this page
	//create constructor of this class as well and invoke parent class constructor
	public HomePage(WebDriver driver) {
		
		//super is used as it takes driver from parent class
		super(driver);
		
	}
	
	//Elements
	
	@FindBy(xpath="//span[text()='My Account']") WebElement lnk_MyAccount;
	@FindBy(linkText = "Register") WebElement lnk_Register;
	@FindBy(linkText = "Login") WebElement lnk_Login;
	
	//Action methods 
	
	public void ClickMyAccount ()
	{
		
		lnk_MyAccount.click();
	}
	
	public void Register ()
	{
		
		lnk_Register.click();
	}
	
	public void Clicklogin ()
	{
		
		lnk_Login.click();
	}
}
