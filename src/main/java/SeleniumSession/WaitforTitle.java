
package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// String title = driver.getTitle();
		// System.out.println(title);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		//now wait.until is returning boolean value
//		//if title is not expected then it is giving timeout exception, we need handle it
//		if(wait.until(ExpectedConditions.titleContains("test")))
//		{
//			System.out.println(driver.getTitle());
//		}

		String title=waitforTitleContains("Register", 5);
		//String title=waitforTitleIs("Register Account",5);
		System.out.println(title);

	}

	public static String waitforTitleContains(String fractionTitle, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleContains(fractionTitle))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title is not fount after: " + timeout);

		}
		return null;

		// if you write the else part then still it will throw exception so we need to
		// handle it if title is not as expeced
	}
	public static String waitforTitleIs(String title, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title is not fount after: " + timeout);

		}
		return null;
	}
	
	//Notes:
	//There are no auto waits in Selenium/ it is available in form of implicit wait
	//Selenium has provided explicit wait
	
	//in PlayWright and Cypress:
	//auto wait is provided
	//it will slow down the process as it waits for all element by default

}
