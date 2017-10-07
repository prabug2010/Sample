package facebookAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageClass extends PageBaseClass {

	public HomePageClass(WebDriver driver) {
		super(driver);
		waitFor(driver, ExpectedConditions.elementToBeClickable(homebutton), 20);
	}

	@FindBy(id = "u_0_c")
	public WebElement homebutton;

	public void homePagebutton() {
		click(homebutton);
	}

}
