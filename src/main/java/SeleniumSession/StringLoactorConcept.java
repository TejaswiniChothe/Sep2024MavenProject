package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringLoactorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String emial_ID = "input-email";
		String password_id = "input-password";
		String login_btn_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";

//		doSendKeys(getLocator("ID",emial_ID),"naveen@gmail.com");
//		doSendKeys(getLocator("ID",password_id),"naveen@gmail.com");
//		doClick(getLocator("XPATH",login_btn_xpath));

		doSendKeys("ID", emial_ID, "naveen@gmail.com");
		doSendKeys("ID", password_id, "Test@1234");
		doClick("XPATH", login_btn_xpath);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getLocator(locatorType, locatorValue)).sendKeys(value);
	}

	public static void doClick(String locatorType, String locatorValue) {
		getElement(getLocator(locatorType, locatorValue)).click();
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static By getLocator(String locatorType, String loactorValue) {
		By locator = null;

		switch (locatorType.toUpperCase().trim()) {
		case "ID":
			locator = By.id(loactorValue);
			break;
		case "NAME":
			locator = By.name(loactorValue);
			break;
		case "CLASSNAME":
			locator = By.className(loactorValue);
			break;
		case "XPATH":
			locator = By.xpath(loactorValue);
			break;
		case "CSSSELECTOR":
			locator = By.cssSelector(loactorValue);
			break;
		case "LINKTEXT":
			locator = By.linkText(loactorValue);
			break;
		case "PARTIALLINKTEXT":
			locator = By.partialLinkText(loactorValue);
			break;
		case "TAGNAME":
			locator = By.tagName(loactorValue);
			break;

		default:
			System.out.println("invalid locator, please use the right locator...");
			break;

		}
		return locator;

	}

}
