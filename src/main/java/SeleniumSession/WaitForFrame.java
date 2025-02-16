package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		By formImage = By.cssSelector("div#imageTemplateContainer > img");
		By frame = By.xpath("//iframe[contains(@id, 'frame-one')]");
		By firstname = By.id("RESULT_TextField-8");
		By lastname = By.id("RESULT_TextField-9");

		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.waitForWebElementPresence(formImage, 10).click();

		// This will wait for frame and switch to it, no need to use driver switch to
		// frame
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));

		eleutil.WaitForFrameByLoactorandswitchToit(frame,10);
		eleutil.waitForWebElementPresence(firstname, 10).sendKeys("tejaswini");
		eleutil.doSendkeys(lastname, "chothe");

		driver.switchTo().defaultContent();
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);

	}

	public static void WaitForFrameByLoactorandswitchToit(By frameLoactor, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLoactor));
	}
	public static void WaitForFrameByIndexandswitchToit(int frameIndex, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	public static void WaitForFrameByIDorNameandswitchToit(String frameIdOrName, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
	}
	
	public static void WaitForFrameByFrameElementandswitchToit(WebElement frameElement, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}


}
