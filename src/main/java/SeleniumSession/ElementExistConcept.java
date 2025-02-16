package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExistConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//
//		By email = By.id("input-email");
//		System.out.println(isElementDisplayed(email));
//
//		By ForgottPassword = By.linkText("Forgotten Password");
//		System.out.println(isElementDisplayed(ForgottPassword, 2));

		By naveen = By.id("naveen");
		System.out.println(doIsElementDisplayed(naveen));

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// if you want to check if single element is found on the page
	public static boolean isElementDisplayed(By locator) {
		if (getElements(locator).size() == 1) {
			System.out.println("element is found on page");
			return true;
		} else {
			System.out.println("element is not found on page");
			return false;
		}

	}
	// if you want to check if multiple element is found on the page

	public static boolean isElementDisplayed(By locator, int elementCount) {
		if (getElements(locator).size() == elementCount) {
			System.out.println("element is found on page " + elementCount + "times");
			return true;
		} else {
			System.out.println("element is not found on page");
			return false;
		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean doIsElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
			
		} catch (NoSuchElementException e) {
			System.out.println("element is not displayed");
			return false;
		}
	}
	


}

