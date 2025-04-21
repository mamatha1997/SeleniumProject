package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import pageObjects.AccountSuccessPage;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_RF_003 extends BaseClass {

	@Test
	public void register() {
		HomePage hp = new HomePage(driver);
		RegisterPage rg = new RegisterPage(driver);
		AccountSuccessPage ap= new AccountSuccessPage(driver);
		hp.clickAccountButton();
		hp.clickRegisterButton();
		rg.typeFirstname("Megan");
		rg.typeLastname("Rose");
		rg.typeEmail(generateNewEmail());
		rg.typeTelephone("1234567890");
		rg.typePassword("test");
		rg.typePasswordConfirm("test");
		rg.clickYesRadioBtn();
		rg.checkPrivacyBox();
		rg.clickContinue();
		
		String expected = "Your Account Has Been Created!";
		Assert.assertEquals(ap.accountSuccessHeading(), expected);
		Reporter.log("Success");
		ap.clickContinue();
		 
		
		WebElement logout = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
		
		Assert.assertTrue(logout.isDisplayed());
		Reporter.log("Logout found");
		
	}
}
