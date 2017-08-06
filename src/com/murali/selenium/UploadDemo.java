package com.murali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadDemo {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://demo.guru99.com/selenium/guru99home/megaupload/upload.html";
		driver.get(url);
		
		driver.findElement(By.id("terms")).click();		
		WebElement uploadfile = driver.findElement(By.xpath(".//*[@id='uploadfile_0']"));
		uploadfile.click();
		
		uploadfile.sendKeys("‪C:\\Users\\Murali\\Desktop\\download.jpg");
		driver.findElement(By.name("send")).click();

	}
	

}
