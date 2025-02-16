package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("Title of the page is:" + title);
		System.out.println("--------------");
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL is:" + pageURL);
		System.out.println("--------------");
		String pageSource = driver.getPageSource();// html dom for that page
		System.out.println("Page source is:" + pageSource);

		System.out.println("--------------");

		if (pageSource.contains("naveenautomationlabs.com")) {
			System.out.println("page source is correct");
		} else {
			System.out.println("page source is incorrect");
		}
		driver.quit();
	}

}
