package com.murali.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drpdwn {
	
	@FindBy(name = "firstname")
	public WebElement firstname;
	
	@FindBy(name = "lastname")
	public WebElement surname;
	
	@FindBy(name = "reg_email__")
	public WebElement numberoremail;
	
	@FindBy(name = "reg_email_confirmation__")
	public WebElement emailconf;
	
	@FindBy(name = "reg_passwd__")
	public WebElement pswd;
	
	@FindBy(xpath = ".//*[@id='u_0_h']")
	public WebElement genderbtn;
	
	@FindBy(css = "input[id = #u_0_m]")
	public WebElement submitbtn;
	
	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds) {
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}
	

	public void drop() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		PageFactory.initElements(driver, this);
		
		waitFor(driver, ExpectedConditions.elementToBeClickable(firstname), 30);
		boolean b = firstname.isEnabled();
		if(b)
		{
			firstname.click();
			firstname.sendKeys("lakshmi");
		}
		
		
		surname.click();
		surname.sendKeys("gunasekaran");
		
		numberoremail.click();
		numberoremail.sendKeys("gprabu2010@gmail.com");
		
		emailconf.click();
		emailconf.sendKeys("gprabu2010@gmail.com");
		
		pswd.click();
		pswd.sendKeys("myfbact");
		
		Select bdayday = new Select(driver.findElement(By.name("birthday_day")));
		bdayday.selectByVisibleText("13");
		
		Select bdaymonth = new Select(driver.findElement(By.name("birthday_month")));
		bdaymonth.selectByVisibleText("Aug");
		
		Select bdayyear = new Select(driver.findElement(By.name("birthday_year")));
		bdayyear.selectByVisibleText("1970");
		
		genderbtn.click();
		
	/*	submitbtn.click();
		
		Thread.sleep(10000);
		
		String loadedTitle = driver.getTitle();
		System.out.println(loadedTitle);
		
		driver.close();
		*/
	}
	
	public static void main(String arg[]) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		Drpdwn dropdown = new Drpdwn();
		dropdown.drop();
	}

}
