package SeleniumSession;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindows {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By orangeHrmLink = By.linkText("OrangeHRM");
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.clickElementWhenReady(orangeHrmLink, 10);

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		// here we are expecting wait for5 seconds for two windows
//		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		if(waitforWindows(2,5))
		{

		// 1. fetch the window ids
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);

		// 2. switching work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window title: " + driver.getTitle());

		// close the child window:
		driver.close();

		// driver is lost:
		// switch back to the parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title: " + driver.getTitle());

		driver.quit();
		}
	}

	public static boolean waitforWindows(int numberofWindow, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			return wait.until(ExpectedConditions.numberOfWindowsToBe(numberofWindow));
		} catch (TimeoutException e) {
			System.out.println("number of windownot matched");
			return false;
		}

	}

}
