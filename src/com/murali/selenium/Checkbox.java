package com.murali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {
	
	public void chkbox() throws Exception
	{
	WebDriver driv = new FirefoxDriver();
	String url ="http://demo.guru99.com/selenium/webform/radio.html";
	driv.get(url);
	
	PageFactory.initElements(driv, this);
	
  Thread.sleep(3000);
String loadTitle = driv.getTitle();
WebElement optb1 = driv.findElement(By.id("vfb-6-0"));
WebElement optb2 = driv.findElement(By.id("vfb-6-1"));

optb1.click();
if(optb1.isSelected())
{
	System.out.println("The radio button 1 is selected");
}
else
{
	System.out.println("Radiobutton 1 is not selected");
}

optb2.click();
if(optb2.isSelected())
{
	System.out.println("The radio button 2 is selected");
}
else
{
	System.out.println("Radiobutton 2 is not selected");
}

driv.close();
}

public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
	Checkbox chk = new Checkbox();
	chk.chkbox();
}
}
