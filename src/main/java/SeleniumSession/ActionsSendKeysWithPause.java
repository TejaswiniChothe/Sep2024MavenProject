package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		Actions act = new Actions(driver);
//		WebElement firstname = driver.findElement(By.id("input-firstname"));
//		String product = "mackbook";
//
//		char prod[] = product.toCharArray();
//		for (char e : prod) {
//			act.sendKeys(firstname, String.valueOf(e)).pause(500).build().perform();

		By firstName = By.id("input-firstname");
		String name = "naveen automation labs";
		doSendKeysWithPause(firstName, name, 500);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeysWithPause(By locator, String value, long pauseTime) {
		Actions act = new Actions(driver);
		char val[] = value.toCharArray();
		for (char ch : val) {
			act.sendKeys(getElement(locator), String.valueOf(ch)).pause(pauseTime).perform();
		}
	}
}
