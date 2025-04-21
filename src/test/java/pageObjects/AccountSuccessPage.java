package pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSuccessPage extends BasePage{

	public AccountSuccessPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='content']//h1")
	WebElement successHeading;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement continueBtn;
	
	public String accountSuccessHeading() {
		return successHeading.getText();
	}
	
	public void clickContinue() {
		continueBtn.click();
	}

}
