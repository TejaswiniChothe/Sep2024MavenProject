package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		driver = br.initdriver("chrome");

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstname = By.id("input-firstname");
		By lastname = By.name("lastname");
		By search = By.className("form-control");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By telephone = By.cssSelector("#input-telephone");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By passwordConfirm = By.cssSelector("#input-confirm");
		By policyCheck = By.name("agree");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By successMessg = By.tagName("h1");
		By myAccountLink = By.linkText("My Account");

		ElementUtil eutl = new ElementUtil(driver);

		eutl.doSendkeys(firstname, "Tej707");
		eutl.doSendkeys(lastname, "automation");
		eutl.doSendkeys(search, "macbook");
		eutl.doSendkeys(email, "Tojtbatch@gmail.com");
		eutl.doSendkeys(telephone, "0909090909");
		eutl.doSendkeys(password, "test@123");
		eutl.doSendkeys(passwordConfirm, "test@123");
		eutl.doClick(policyCheck);

		Thread.sleep(5000);

		eutl.doClick(continueBtn);

		String successMessage = eutl.getElementText(successMessg);
		System.out.println(successMessage);
		if (successMessage.contains("Your Account Has Been Created!")) {
			System.out.println("user is created -- pass");
		} else {
			System.out.println("user reg is failed");
		}

		eutl.doClick(myAccountLink);

	}

}
