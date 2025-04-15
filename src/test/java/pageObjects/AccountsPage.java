package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage {
	public AccountsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Edit your account information")
	WebElement editAccountLink;
	
	
}
