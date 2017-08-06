package com.murali.selenium;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop {
	
	@FindBy(xpath = ".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span")
	public static WebElement src1;
	
	@FindBy(xpath = ".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span")
	public static WebElement destn;
	
	
	public void Demodnd() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		String url = "https://dhtmlx.com/docs/products/dhtmlxTree/";
		driver.get(url);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		Thread.sleep(5000);
		
		String tit = driver.getTitle();
		System.out.println(tit);
	/*	
		Actions a1 = new Actions(driver);
		Action a2 = a1.clickAndHold(src1).moveToElement(destn).release(destn).build();
		a2.perform();
		*/
		System.out.println("Element dropped successfully");
		
		
		try {
			if (src1.isDisplayed() && destn.isDisplayed()) {
				Actions action = new Actions(driver);
				action.dragAndDrop(src1, destn).build().perform();
			} else {
				System.out.println("Element was not displayed to drag");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + src1 + "or" + destn + "is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + src1 + "or" + destn + " was not found in DOM "+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Error occurred while performing drag and drop operation "+ e.getStackTrace());
		}
	}
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		DragAndDrop d2 = new DragAndDrop();
		d2.Demodnd();
		
	}

}
