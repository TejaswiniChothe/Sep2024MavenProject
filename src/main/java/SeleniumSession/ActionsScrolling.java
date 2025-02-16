package SeleniumSession;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Actions act = new Actions(driver);

//		//partial Scrolling
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_UP).perform();

		// scroll to the footer of the page
		// windows:
		// Keys.CONTROL

		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();// This will scroll bottom of the page
		Thread.sleep(5000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();// This will scroll top of the page

		// Scroll to particular element
//		act.scrollToElement(driver.findElement(By.linkText("OpenCart"))).pause(200)
//				.click(driver.findElement(By.linkText("OpenCart"))).build().perform();

	}

}
