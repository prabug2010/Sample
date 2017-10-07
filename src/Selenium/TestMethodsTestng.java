package Selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class TestMethodsTestng {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup()
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeDriver()
	{
		driver.close();
	}
}
