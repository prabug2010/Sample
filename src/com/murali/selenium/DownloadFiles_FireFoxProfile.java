package com.murali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
 
public class DownloadFiles_FireFoxProfile {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
	    //Create FireFox Profile object
		FirefoxProfile profile = new FirefoxProfile();
 
		//Set Location to store files after downloading.
		profile.setPreference("browser.download.dir", "C:\\Users\\Murali\\Downloads");
		profile.setPreference("browser.download.folderList", 2);
 
		//Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"); 
 
		profile.setPreference( "browser.download.manager.showWhenStarting", false );
		profile.setPreference( "pdfjs.disabled", true );
 
		//Pass FProfile parameter In webdriver to use preferences to download file.
		FirefoxDriver driver = new FirefoxDriver(profile);  
 
		// Open APP to download application
		driver.get("http://toolsqa.com/automation-practice-form/");
 
		// Click to download 
		driver.findElement(By.linkText("Test File to Download")).click();
 
		//Halting the execution for 5 secs to donwload the file completely
		Thread.sleep(5000);
 
		driver.close();
 
	}
 

}
