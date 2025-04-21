package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountSuccessPage;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_RF_001 extends BaseClass {
	
	@Test
	public void register() {
		HomePage hp = new HomePage(driver);
		RegisterPage rp = new RegisterPage(driver);
		AccountSuccessPage ap = new AccountSuccessPage(driver);
		hp.clickAccountButton();
		hp.clickRegisterButton();
		rp.typeFirstname("Selenium");
		rp.typeLastname("testing");
		rp.typeEmail(generateNewEmail());
		rp.typeTelephone("1234567890");
		rp.typePassword("abcd");
		rp.typePasswordConfirm("abcd");
		rp.checkPrivacyBox();
		rp.clickContinue();
		
		String expected = "Your Account Has Been Created!";
		Assert.assertEquals(ap.accountSuccessHeading(), expected);
		
		String ProperDetailsOne="Congratulations! Your new account has been successfully created!";
		String ProperDetailsTwo="You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String ProperDetailsThree="If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String ProperDetailsFour="contact us";
		
		String expectedProperDetails = driver.findElement(By.xpath("//div[@id='content']")).getText();
		
		Assert.assertTrue(expectedProperDetails.contains(ProperDetailsOne));
		Assert.assertTrue(expectedProperDetails.contains(ProperDetailsTwo));
		Assert.assertTrue(expectedProperDetails.contains(ProperDetailsThree));
		Assert.assertTrue(expectedProperDetails.contains(ProperDetailsFour));
		
		ap.clickContinue();

		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}
	
	
}
