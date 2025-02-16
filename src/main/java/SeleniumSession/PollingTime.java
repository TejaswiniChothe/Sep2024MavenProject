package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTime {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Suppose element is present or not request being sent from script>server>browser
//Wait for element is defined as 10 second
// polling time is defined as 2 seconds
//first request is being send at 0th second
//if element is not available then next request is sent at 2second
//again if element is not available then next request is sent at 4th second
//so the for the 10 seconds will be divided into 6 request
//default polling time is 500ms
//but it is recommended to define polling time as it reduces the load on browser and server
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yyyyy")));

	}

}
