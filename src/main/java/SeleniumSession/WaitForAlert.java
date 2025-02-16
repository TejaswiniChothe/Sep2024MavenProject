package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement alertEle = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		alertEle.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		Alert alert=wait.until(ExpectedConditions.alertIsPresent());

		// Alertpresent method will check if alert is present or not and click on it. we
		// don't need to driver.switchto.alert method
		// Wait.until method is returning alert reference
//
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
		waitForalert(5);
		String text=getAlertText(5);
		System.out.println(text);
		//acceptAlert(5);
		dismissAlert(5);		

	}

	public static Alert waitForalert(long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static String getAlertText(long timeout) {
		return waitForalert(timeout).getText();
	}

	public static void acceptAlert(long timeout) {
		waitForalert(timeout).accept();
	}

	public static void dismissAlert(long timeout) {
		waitForalert(timeout).dismiss();
	}

	public static void alertSendKeys(String text, long timeout) {
		waitForalert(timeout).sendKeys(text);
	}

}
