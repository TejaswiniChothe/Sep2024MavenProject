package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// create a webelement + perform an action(click, sendkeys,
		// gettext,isDisplayed...)
		// FE + click, sendKeys, getText....

//		//1
//		driver.findElement(By.id("input-email")).sendKeys("tej@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Tej@1234");
//		
//		//2
//		WebElement emailID=driver.findElement(By.id("input-email"));
//		WebElement Password=driver.findElement(By.id("input-password"));
//		emailID.sendKeys("tej@gmail.com");
//		Password.sendKeys("Test@1234");

		// 3. By locator: object repository

//		By email=By.id("input-email");
//		By Password=By.id("input-password");
//		
//		WebElement email_el=driver.findElement(email);
//		WebElement password_pwd=driver.findElement(Password);
//		
//		email_el.sendKeys("tej@gmail.com");
//		password_pwd.sendKeys("Test@1234");

		// 4. By locator + generic function for webelement:
//
//		By email = By.id("input-email");
//		By Password = By.id("input-password");
//		getElement(email).sendKeys("tej@gmail.com");
//		getElement(Password).sendKeys("Test@1234");

		// 5. By locator + generic function for webelement + generic function for
		// action(sendkeys)
//		By email = By.id("input-email");
//		By Password = By.id("input-password");
//		doSendkeys(email, "tej@gmail.com");
//		doSendkeys(Password, "Test@1234");

		// 6. By locator + generic function for webelement + generic function for
		// action(sendkeys) - in ElementUtil
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By TelePhone = By.id("input-telephone");
		By email = By.id("input-email");
		By password = By.id("input-password");
		By PasswordReconfirm = By.id("input-confirm");

		ElementUtil eutl = new ElementUtil(driver);
		eutl.doSendkeys(FirstName, "Tejaswini");
		eutl.doSendkeys(LastName, "Chothe");
		eutl.doSendkeys(TelePhone, "9089787878");
		eutl.doSendkeys(email, "tej11@gmail.com");
		eutl.doSendkeys(password, "Test@12345");
		eutl.doSendkeys(PasswordReconfirm, "Test@12345");

	}

	

//	public static WebElement getElement(By loactor) {
//		return driver.findElement(loactor);
//	}
//
//	public static void doSendkeys(By loactor, String value) {
//		getElement(loactor).sendKeys(value);
//	}
}
