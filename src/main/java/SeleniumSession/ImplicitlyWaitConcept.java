package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sel 3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//When we applied the implicitwait or Explicit wait we have to use duration class
		
		//1.It is global wait
		//2.this is only for Web Element
		//3.once it is applied, then it will be applied for all upcoming element
		//4.It can not applied for a specific element, as it is global wait and applied for all webelement
		//5.it can not be applied for non Webelement: title,Url,alerts
		
		
		//for below web element implicit wait will be applied
		//if element is available within 2 sec, then 8 sec will ignored
		//if element is not available within 10 sec, then it will give no such element exception
		driver.findElement(By.id("input-firstname")).sendKeys("testing");
		
		//on registration page for each web element 10 sec will get applied
		
		//on home page i want only 5 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//now again when I move to reg page, but the current wait is 5 , but reg page is slow we need to wait update wait to 10sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//This is the problem with implicitwait as we need to keep updating wait
		//Implicit wait will be never used in framework
		//the wait will be applied to all element on page unnecessary

		//for alert: it won't work
		//it will not wait for alert 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().alert();
		
	}

}
