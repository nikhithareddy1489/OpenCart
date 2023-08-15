package pageObjects;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistration  extends BasePage{

	//created constructor in Basepage and extended it in this page
	//also create constructor to invoke parent class driver.
	public AccountRegistration(WebDriver driver) {
		super(driver);
		
		
	}

	//Elements of this page
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_firstname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_lastname;
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_password_confirm;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_telephonenum;
	@FindBy(xpath="//input[@id='input-newsletter-no']") WebElement btn_radio;
	@FindBy(xpath="//input[@name='agree']") WebElement chkdPolicy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btn_continue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;
	
	
	//Action Methods
	
	public void firstName(String fname) {
		
		txt_firstname.sendKeys(fname);
	}
	
	public void lastName(String lname) {
		
		txt_lastname.sendKeys(lname);
	}
	public void email(String email) {
		
		txt_email.sendKeys(email);
	}
	public void password(String password) {
		
		txt_password.sendKeys(password);
	}
	
	public void cnfrmPassword(String confirmpassword) {
		
	txt_password_confirm.sendKeys(confirmpassword);
	}

	public void telephoneNum(String telephoneNum) {
	
	txt_telephonenum.sendKeys(telephoneNum);
	}
	public void radiobtn() {
		
		btn_radio.click();
	}
	public void termsAndConditions() {
	
		chkdPolicy.click();
	}
	public void continueButton() {
		

		
		//btn_continue.sendKeys(Keys.RETURN);
		//btn_continue.click();
		

		
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(btn_continue)).click();
	}
	
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}


	
	
}
