package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage extends PageObjectBase {
	
	public SignUpPage(WebDriver driver)
	{
		super(driver);
		waitFor(driver, ExpectedConditions.elementToBeClickable(first_name), 10);
	}
	@FindBy(id = "firstname") private WebElement first_name ;
	@FindBy(id = "lastname") private WebElement last_name;
	@FindBy(id = "address") private WebElement address;
	@FindBy(id = "zipcode") private WebElement zipcode;
	@FindBy(id = "signup") private WebElement signup;
	
	public void enterFirstName(String first_name)
	{
		this.first_name.clear();
		this.first_name.sendKeys(first_name);
	}
	
	public void enterLastName(String last_name)
	{
		this.last_name.clear();
		this.last_name.sendKeys(last_name);
	}
	
	public void enterAddress(String address)
	{
		this.address.clear();
		this.address.sendKeys(address);
	}
	
	public void enterZipCode(String zipcode)
	{
		this.zipcode.clear();
		this.zipcode.sendKeys(zipcode);
	}
	
	public SubmitPage clickSubmit()
	{
		signup.click();
		return new SubmitPage(driver);
	}
}