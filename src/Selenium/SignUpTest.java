package Selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignUpTest extends TestMethodsTestng {
	
public static WebDriver driver;
	
	@Test
	public void signUpMethod()
	{		
	driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
	SignUpPage s = new SignUpPage(driver);
	s.enterFirstName("Prabu");
	s.enterLastName("Gunsekaran");
	s.enterAddress("123, thiyagi natesan street");
	s.enterZipCode("636003");
	s.clickSubmit();
	}
}