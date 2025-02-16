package SeleniumSession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TopCastingOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//top casting options:
		
				//0th: valid but only for a specific browser - local
				ChromeDriver driver = new ChromeDriver();//only for chrome
				FirefoxDriver driver1 = new FirefoxDriver();//only for ff
				
				//1. valid and recommended -- local - cross browser
//				WebDriver driver = new ChromeDriver();
//				driver = new EdgeDriver();
//				driver = new FirefoxDriver();
//				driver = new SafariDriver();
//				driver.get("https://www.google.com");
				
				//2. SD = new CD()
				//valid but not recommended
				//SearchContext driver = new ChromeDriver();
				
				//3. RWD = new CD() -- -- local - cross browser
				//valid and recommended
				//RemoteWebDriver driver = new ChromeDriver();
				
				//4. WD = new RWD() -- remote
				//valid and recommended -- only for remote machine
				//only to run test cases on remote machine - grid, server, docker, cloud, machine, LT, SauaceLabs
				//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
				
				//5. SC = new RWD
				//valid but not recommended
				//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
				
				//6. 
				//valid but not recommended -- only for chrome/edge
//				ChromiumDriver driver = new ChromeDriver();
//				driver = new EdgeDr

		
		
		
	}

}
