package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	@Test(groups= {"Sanity","master"})
	public void test_account_Registration() throws InterruptedException

	{

		logger.debug("application logs......");
		logger.info("***  Starting TC_001_AccountRegistrationTest ***");

		try {

			// we need to use homepage and account regsitration class from pageobject
			// package and for that we need to import that package ans use it
			// also pass the driver into the homepage object-- as we extended Baseclass we
			// are able to directly use the driver
			
			
			HomePage hp = new HomePage(driver);

			hp.ClickMyAccount();

			logger.info("Clicked on My account link");

			hp.Register();

			logger.info("Clicked on register link");
			// similarly we can use Account Registration class methods
			AccountRegistration ar = new AccountRegistration(driver);

			logger.info("Providing customer data");

			ar.firstName(randomString().toUpperCase());
			ar.lastName(randomString().toUpperCase());
			ar.email(randomString() + "@gmail.com");
			ar.telephoneNum(randomNumber());

			String password = randomAlphaNumeric();

			ar.password(password);
			ar.cnfrmPassword(password);
			ar.termsAndConditions();
			ar.continueButton();
			logger.info("Clicked on continue");

			String confmsg = ar.getConfirmationMsg();

			logger.info("Validating expected message");
			Assert.assertEquals(confmsg, "Your Account Has Been Created!", "test failed");
		} catch (Exception e) {
			logger.error("test failed");
			Assert.fail();
		}

		logger.info("***  Finished TC_001_AccountRegistrationTest ***");
	}

}
