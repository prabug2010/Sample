package com.murali.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.murali.selenium.LoginPage;
 
public class VerifyWordpressLogin 
{ 
@Test
public void verifyValidLogin()
{
 System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
 WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();
 
driver.get("http://demosite.center/wordpress/wp-login.php");
 
LoginPage login=new LoginPage(driver); 
login.loginToWordpress("admin", "demo123");
//login.clickOnLoginButton();
driver.quit();
}
}