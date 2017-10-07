package facebookAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBaseClass {

	public WebDriver driver;

	public PageBaseClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public void click(WebElement element) {
		element.click();
	}

	public void sendText(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	public <V> V waitFor(WebDriver driver, ExpectedCondition<V> expectedCondition, int timeOutInSeconds) {
		return new WebDriverWait(driver, timeOutInSeconds, 500).until(expectedCondition);
	}
}