package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initdriver("firefox");
		br.launcUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = br.getPageTitle();
		System.out.println(title);
		if (title.equals("Register Account")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		String pageURL = br.getPageURL();
		System.out.println("pageurl is:" + pageURL);
		if (pageURL.contains("route=account/register")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct");
		}

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
		//br.quitBrowser();
	}

}
