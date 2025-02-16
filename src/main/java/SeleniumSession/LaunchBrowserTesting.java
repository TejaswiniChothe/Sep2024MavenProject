package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//new ChromeDriver();
		//new ChromeDriver();
		
		//driver.quit();//latest launched chrome browser will be closed
		
		driver=new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//URL will be entered in firefox browser as it is latest
		driver.quit();//firefox will get closed
	}

}
