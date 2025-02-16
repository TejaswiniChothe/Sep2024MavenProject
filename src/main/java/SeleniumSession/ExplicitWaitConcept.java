package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		
		waitForWebElementPresence(email,5).sendKeys("test@gmail.com");

		// if we want to wait only for first name web element
		// Using Webdriverwait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// until method is returning web element
		// within 10 seconds if element is present then return it
		WebElement firstname_ele = wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
		firstname_ele.sendKeys("naveen");

		// if element is not available within 10 sec then it will give below error
		// org.openqa.selenium.TimeoutException: Expected condition failed: waiting for
		// presence of element located by: By.id: input-firstname1 (tried for 10
		// second(s) with 500 milliseconds interval)

		// for last name we are not applying any wait, as firstname is already present
		// which means page is loaded successfully and there is no point of applying for
		// the wait
		driver.findElement(lastname).sendKeys("automation");

		// so with explicit wait it is possible to apply wait for only specific element
        
	}

	public static WebElement waitForWebElementPresence(By locator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//Presenceofelement check the presence  of element inside the dom so incase if element is not present on UI wnd iftry to eneter keys then it will give error
//So instead of this we can use ElementVisiblemethod, which will check element is present on html dom and displaye on UI and it also has height & weight greate than 0
	}
	public static WebElement waitForWebElementVisible(By locator, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
}
