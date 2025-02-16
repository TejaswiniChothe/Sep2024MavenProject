package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println("Hello");

		// SendkeyUsing Action class
		// WebElement firstNameEle = driver.findElement(By.id("input-firstname"));
		// WebElement agreeCheckBox = driver.findElement(By.name("agree"));

		// Actions act = new Actions(driver);

//		Equivalent to calling: Actions.click(element).sendKeys(keysToSend). 
//		This method is different from WebElement.sendKeys(CharSequence) - 
//		see sendKeys(CharSequence) for details how.
		// act.sendKeys(firstNameEle, "tejaswini").build().perform();

		// Click using Action class
		// Clicks in the middle of the given element.
		// Equivalent to: Actions.moveToElement(onElement).click()
		// act.click(agreeCheckBox).build().perform();

		By firstNameEle = By.id("input-firstname");
		By agreeCheckBox = By.name("agree");
		doActionsSendKeys(firstNameEle,"Tejaswini");
		doActionsClick(agreeCheckBox);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, CharSequence... value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
