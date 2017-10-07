package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SubmitPage extends PageObjectBase {
	
	public SubmitPage(WebDriver driver) {
		super(driver);
		waitFor(driver, ExpectedConditions.visibilityOf(header), 10);
	}

	@FindBy(tagName = "h1") private WebElement header;
	
	public String confirmationHeader()
	{
		return header.getText();
	}
}