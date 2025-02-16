package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver initdriver(String browserName) {
		System.out.println("Browser name is:" + browserName);
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("please pass correct browser:" + browserName);
			throw new RuntimeException("==Invalid browser==");
		}
		return driver;
	}

	public void launcUrl(String Url) {
		if (Url == null) {
			throw new RuntimeException("==URL can't be null==");
		}
		if (Url.length() == 0) {
			throw new RuntimeException("==URL can't be blank or empty==");
		}

		if (Url.indexOf("http") == 0) {
			driver.get(Url);
		} else {
			throw new RuntimeException("==Invalid URL==");
		

		}
	}
		public String getPageTitle()
		{
			String title=driver.getTitle();
			System.out.println("Title of the page is:"+title);
			return title;
		}
		
		public String getPageURL()
		{
			String PageURL=driver.getCurrentUrl();
			System.out.println("PageURL of the page is:"+PageURL);
			return PageURL;
		}
		
		public void closeBrowser()
		{
			System.out.println("browser closed successfully");
			driver.close();
		}
		
		public void quitBrowser()
		{
			System.out.println("browser quit successfully");
			driver.quit();
		}
	}
	
	


