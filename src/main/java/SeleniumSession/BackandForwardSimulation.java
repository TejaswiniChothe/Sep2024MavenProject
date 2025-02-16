package SeleniumSession;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackandForwardSimulation {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());

		//driver.navigate().to("https://www.amazon.in/");
		driver.get("https://www.amazon.in");
		//driver.navigate().to(new URL("https://www.amazon.in/"));
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

	}

}
