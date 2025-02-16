package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class InconginotoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--incognito");
//		WebDriver driver = new ChromeDriver(co);
//
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
