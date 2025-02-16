package SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wait is interface- it is implemented by fluent wait class- Webdriver wait is
		// child of fluentwait
		// wait is having until method with no method body
		// until method is implemented by fluent wait, fluent wait have some other
		// method
		// as webdriverwait is child of fluent wait, it can inherited all the fluentwait
		// method, there are no individual method of webdriverwait

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By fn = By.id("input-firstname1");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("====element not found==");

		//WebDriverWait with fluentWait feature
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
//				.withMessage("====element not found==");
//		
     wait.until(ExpectedConditions.visibilityOfElementLocated(fn)).sendKeys("testing");
		
		//Fluentwait and webdriverwait is same, but the why webdriverwait is created
		//Suppose if any other tool you want, they can simply create a tool specific child class and attached to fluentwait
		//webdrivereait is not having any individual method so,it is better to extend fluentwait

	}
	
	public static WebElement waitforElementVisibleusingFluentFeatures(By locator,long timeout,int pollingTime)
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("====element not found==");
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
