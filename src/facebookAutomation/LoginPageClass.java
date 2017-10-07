package facebookAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageClass extends PageBaseClass {

	public LoginPageClass(WebDriver driver) {
		super(driver);
		waitFor(driver, ExpectedConditions.elementToBeClickable(userId), 10);
	}

	@FindBy(id = "email")
	public WebElement userId;

	@FindBy(id = "pass")
	public WebElement password;

	@FindBy(id = "u_0_2")
	public WebElement loginbutton;

	public void enterUser(String userName) {
		sendText(userId, userName);
	}

	public void enterPassword(String pass) {
		sendText(password, pass);
	}

	public HomePageClass submit() {
		loginbutton.click();
		return new HomePageClass(driver);
	}

}
