package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoading {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How come to know page is loaded successfully
		// Go to console>type document.readyState>>it should be complete
		// When page is completely loaded then only i want to interact with the element
		//page states are=
		//loading-page is still loading
		//interactive-page is loaded but still some elements are pending to load such as css,images,frames
		//completed-everything is loaded
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		String isPageLoaded = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"))
//				.toString();
//		// to string method will return true or false
//
//		System.out.println(isPageLoaded);
		
		if(isPageLoaded(10))
		{
			System.out.println("page is fully loaded");
		}

	}

	public static boolean isPageLoaded(long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		String isPageLoaded=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
		//Converting "true" to boolean true
		return Boolean.parseBoolean(isPageLoaded);
	}

}
