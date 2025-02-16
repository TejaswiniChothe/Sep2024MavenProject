package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();// browser - chrome

		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");// page
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div#imageTemplateContainer > img")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		By proposeTitle = By.id("RESULT_TextField-1");
		By location = By.id("RESULT_TextField-3");
		By proposeDate = By.id("RESULT_TextField-4");
		By description = By.id("RESULT_TextArea-5");
		By firstName = By.id("RESULT_TextField-8");
		By LastName = By.id("RESULT_TextField-9");
		By streetAddress1 = By.id("RESULT_TextField-10");
		By streetAddress2 = By.id("RESULT_TextField-11");
		By city = By.id("RESULT_TextField-12");
		By zipCode = By.id("RESULT_TextField-14");
		By phoneNumber = By.id("RESULT_TextField-15");
		By EmailAddress = By.id("RESULT_TextField-16");
		By submitButton = By.id("FSsubmit");
		By State = By.id("RESULT_RadioButton-13");

		doSendkeys(proposeTitle, "test");
		doSendkeys(location, "mumbai");
		doSendkeys(proposeDate, "09012025");
		doSendkeys(description, "test");
		driver.findElement(By.id("RESULT_FileUpload-6")).sendKeys("C:\\Users\\Tejaswini\\Downloads\\Tej.txt");
		doSendkeys(firstName, "tej");
		doSendkeys(LastName, "test");
		doSendkeys(streetAddress1, "test1");
		doSendkeys(streetAddress2, "test2");
		doSendkeys(city, "Mumbai");
		doSendkeys(zipCode, "400078");
		doSendkeys(phoneNumber, "5555551234");
		doSendkeys(EmailAddress, "tej11@gmail.com");
		doSelectByVisibleText(State, "Alabama");
		doClick(submitButton);
		driver.switchTo().defaultContent();

		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendkeys(By loactor, CharSequence... value) {
		getElement(loactor).sendKeys(value);
	}

	public static void doSelectByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}

}
