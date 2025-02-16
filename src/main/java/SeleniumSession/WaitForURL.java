package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURL {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		//driver.findElement(By.linkText("Privacy Policy.")).click();
		
		driver.findElement(By.linkText("Book a Free Demo")).click();

//		String url=waitforURLcontains("OrangeHRM-Privacy-Policy.pdf",5);
//		System.out.println(url);
		
		String url=waitforURLtoBe("https://www.orangehrm.com/en/book-a-free-demo",5);
     	System.out.println(url);
		
	}

	public static String waitforURLcontains(String frationURL, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlContains(frationURL))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("URL is not fount after: " + timeout + " Seconds ");

		}
		return null;
	}
	
	public static String waitforURLtoBe(String frationURL, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlToBe(frationURL))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println("URL is not fount after: " + timeout + " Seconds ");

		}
		return null;
	}
}
