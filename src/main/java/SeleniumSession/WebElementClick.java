package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By FullName = By.id("Form_getForm_Name");
		By BusinessEmail = By.id("Form_getForm_Email");
		By PhoneNo = By.id("Form_getForm_Contact");
		By getYourFreeTrial = By.id("Form_getForm_action_submitForm");
		By header = By.className("form-title");
 
		
		doSendkeys(FullName,"Tejaswiniwww");
		doSendkeys(BusinessEmail,"Tejaswini.Chothe22@gmail.com");
		doSendkeys(PhoneNo,"123456789");
		doClick(getYourFreeTrial);
		String headerText=getElementText(header);
		System.out.println(headerText);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}
	public static String  getElementText(By locator) {
		return getElement(locator).getText();

	}

}
