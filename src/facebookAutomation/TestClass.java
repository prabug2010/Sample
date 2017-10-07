package facebookAutomation;


import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestClass {

	public static WebDriver driver;

	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars\\gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void closeDriver() {
		driver.close();
	}

	@Test
	public void signUp() {
		driver.get("http://www.facebook.com");
		LoginPageClass login = new LoginPageClass(driver);
		login.enterUser("prabug2010@ymail.com");
		login.enterPassword("myfbaccount");
		login.submit();
		HomePageClass home = new HomePageClass(driver);
		home.homePagebutton();
	}
}
