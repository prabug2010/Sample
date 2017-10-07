package com.murali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeInSelenium {
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
			    WebDriver driver = new FirefoxDriver();
			    driver.get("http://demo.guru99.com/selenium/guru99home/");  
			    //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			    int size = driver.findElements(By.tagName("iframe")).size();
			    System.out.println(size);
			    for(int i=0; i<size; i++){
				driver.switchTo().frame(i);
				int total=driver.findElements(By.xpath("html/body/a/img")).size();
				System.out.println(total);
				System.out.println(driver.getTitle());
			    driver.switchTo().defaultContent();
			    
			    }}

}
