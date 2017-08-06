package com.murali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumSample {

	@FindBy(xpath = ".//*[@id='email']")
	public WebElement userName;

	@FindBy(xpath = ".//*[@id='pass']")
	public WebElement password;

	@FindBy(xpath = ".//*[@id='u_0_r']")
	public WebElement loginButton;
	
	@FindBy(xpath = ".//*[@id='userNavigationLabel']")
	public WebElement navMenu;
	
	public static void main(String[] args) throws Exception {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		/*
		 * FirefoxOptions options = new FirefoxOptions(); DesiredCapabilities dc
		 * = new DesiredCapabilities(); options.addPreference(
		 * "capability.policy.default.HTMLIFrameElement.name.get", "allAccess");
		 * options.addPreference(
		 * "capability.policy.default.HTMLDocument.compatMode", "allAccess");
		 * options.addPreference("capability.policy.default.Window.pageXOffset",
		 * "allAccess");
		 * options.addPreference("capability.policy.default.Window.pageYOffset",
		 * "allAccess"); options.addPreference(
		 * "capability.policy.default.Window.mozInnerScreenY", "allAccess");
		 * options.addPreference(
		 * "capability.policy.default.Window.mozInnerScreenX", "allAccess");
		 * options.addPreference(
		 * "capability.policy.default.Window.frameElement", "allAccess");
		 * options.addPreference("dom.max_script_run_time", 0);
		 * options.addPreference("dom.max_chrome_script_run_time", 0);
		 * options.addPreference(
		 * "capability.policy.default.HTMLIFrameElement.name.get", "allAccess");
		 * options.addPreference(
		 * "capability.policy.default.HTMLDocument.compatMode", "allAccess");
		 * options.addPreference("capability.policy.default.Window.pageXOffset",
		 * "allAccess");
		 * options.addPreference("capability.policy.default.Window.pageYOffset",
		 * "allAccess"); options.addPreference(
		 * "capability.policy.default.Window.mozInnerScreenY", "allAccess");
		 * options.addPreference(
		 * "capability.policy.default.Window.mozInnerScreenX", "allAccess");
		 * options.addPreference(
		 * "capability.policy.default.Window.frameElement", "allAccess");
		 * options.addPreference("dom.max_script_run_time", 0);
		 * options.addPreference("dom.max_chrome_script_run_time", 0);
		 * options.addTo(dc);
		 * 
		 * LoggingPreferences preferences = new LoggingPreferences();
		 * preferences.enable("WARNING", java.util.logging.Level.OFF);
		 * preferences.enable("DEBUG", java.util.logging.Level.OFF);
		 * preferences.enable("ERROR", java.util.logging.Level.OFF);
		 * preferences.enable("INFO", java.util.logging.Level.OFF);
		 * dc.setCapability(CapabilityType.LOGGING_PREFS, preferences);
		 */

		SeleniumSample obj = new SeleniumSample();
		obj.seleniumOperations();
	}

	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds) {
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}

	public void seleniumOperations() throws Exception {
		WebDriver driver = new FirefoxDriver();

		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		String baseUrl = "http://www.fb.com";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		PageFactory.initElements(driver, this);

		waitFor(driver, ExpectedConditions.elementToBeClickable(userName), 20);
		userName.click();
		userName.clear();
		userName.sendKeys("prabug2010@ymail.com");

		password.click();
		password.clear();
		password.sendKeys("myfbaccount");

		loginButton.click();
		
		Thread.sleep(3000);
		
		String loadTitle = driver.getTitle();
		System.out.println(loadTitle);
		
		
		waitFor(driver, ExpectedConditions.elementToBeClickable(navMenu), 60);
		WebElement navMenu = driver.findElement(By.xpath(".//*[@id='userNavigationLabel']"));
		navMenu.click();
		
		String loadTitle1 = driver.getTitle();
		System.out.println(loadTitle1);
		
		Thread.sleep(5000);
				
		WebElement lglnk = driver.findElement(By.className("_w0d"));
		
		
		Actions logout = new Actions(driver);
		Action l1 = logout.moveToElement(lglnk).click().build();
		l1.perform();
				
		String loadTitle2 = driver.getTitle();
		System.out.println(loadTitle2);
		driver.close();
	}

}