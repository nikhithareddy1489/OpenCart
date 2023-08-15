package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{

	@Test(groups= {"regression","master"})
public void Test_login ()
{
	try
	{
	logger.info("***  Starting TC_002_LoginTest ***");
	
	HomePage hp = new HomePage(driver);
	hp.ClickMyAccount();
	
	logger.info("****Clicked on My account link****");
	hp.Clicklogin();
	
	logger.info("****Clicked on Login Link*****");
	
	LoginPage lp = new LoginPage(driver);
	lp.setEmail(rb.getString("email"));
	lp.setPassword(rb.getString("password"));
	lp.clickLogin();
	
	MyAccountPage macc = new MyAccountPage (driver);
	boolean targetPage = macc.isMyAccountPageExists();
	Assert.assertEquals(targetPage, true);
	
	macc.clickLogout();
	
}
	catch(Exception e) {
		
		
		Assert.fail();
	}
	logger.info("*********Finished TC_002**********");
}
	
	
}
