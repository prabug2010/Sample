package com.murali.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindAllLinks {
	
//	@FindBy(linkText = "Forgotten account?")
//	public WebElement fgacc;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		FindAllLinks ob1 = new FindAllLinks();
		ob1.findAllLinks();
		
	}
	
	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds) {
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}
	public void findAllLinks()
	{
		WebDriver driver = new FirefoxDriver();
		

		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int n = links.size();
		System.out.println(n);
		for(int i =0; i<n; i++)
		{
			System.out.println(links.get(i).getText());
		}
	//	System.out.println(links.size());
	

	/*	for (int i = 0; i <= links.size(); i++)

		{

			System.out.println(links.get(i).getText());

		}
	*/	
	//	WebElement fgacc = (WebElement) driver.findElements(By.tagName("a"));		
		waitFor(driver, ExpectedConditions.elementToBeClickable(By.linkText("Forgotten account?")), 10).click();
	//	if(fgacc.isEnabled())
	//	{
	//		System.out.println("The link is enabled");
	//		fgacc.click();
	//	}
		System.out.println("code success");
	}
	

}