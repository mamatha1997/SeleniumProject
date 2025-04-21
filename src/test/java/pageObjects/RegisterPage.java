package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstnameTxt;
	
	@FindBy(xpath ="//input[@id='input-lastname']")
	WebElement lastnameTxt;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailTxt;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement telephoneTxt;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passwordTxt;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confirmTxt;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyCheckbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//label[text()='Yes']")
	WebElement yesRadioBtn;
	
	@FindBy(xpath = "//label[text()='No']")
	WebElement noRadioBtn;
	
	
	
	public void typeFirstname(String fn) {
		firstnameTxt.sendKeys(fn);
	}
	
	public void typeLastname(String ln) {
		lastnameTxt.sendKeys(ln);
	}
	
	public void typeEmail(String email) {
		emailTxt.sendKeys(email);
	}
	
	public void typeTelephone(String number) {
		telephoneTxt.sendKeys(number);
	}
	
	public void typePassword(String pass) {
		passwordTxt.sendKeys(pass);
	}
	
	public void typePasswordConfirm(String pass) {
		confirmTxt.sendKeys(pass);
	}
	
	public void checkPrivacyBox() {
		if (!privacyCheckbox.isSelected()) {
			privacyCheckbox.click();
        }
	}
	
	public void clickContinue() {
		submitBtn.click();
	}
	
	public void clickYesRadioBtn() {
		yesRadioBtn.click();
	}
	
	public void clickNoRadioBtn() {
		noRadioBtn.click();
	}
}
