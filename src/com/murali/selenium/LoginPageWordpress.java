package com.murali.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPageWordpress {
	
	@Test
	public void validLogin()
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		HomePageWordpress.login(driver).sendKeys("admin");
		HomePageWordpress.pass(driver).sendKeys("demo123");
		HomePageWordpress.submit(driver).click();
	}
}


