package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement accountBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement registerBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement loginBtn;
	
	public void clickAccountButton() {
		accountBtn.click();
	}
	
	public void clickRegisterButton() {
		registerBtn.click();
	}
	
	public void clickLoginButton() {
		loginBtn.click();
	}
	

}
