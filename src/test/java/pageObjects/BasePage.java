package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;
	//create constructor "BasePage" and extend into other pages
	public BasePage(WebDriver driver)
	{
		this.driver= driver; 
		
		PageFactory.initElements(driver,this);
	}
}
