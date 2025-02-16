package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowerTest {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass right browser:" + browser);
			throw new RuntimeException("Invalid Browser");

		}

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("Title of the page is:" + title);

		if (title.equals("Account Login")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		System.out.println("------------------");

		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL is:" + pageURL);

		if (pageURL.contains("route=account/login")) {
			System.out.println("page url is correct");
		} else {
			System.out.println("page url is wrong");
		}

		driver.quit();

	}

}
