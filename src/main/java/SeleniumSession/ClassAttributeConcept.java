package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAttributeConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy");
		Thread.sleep(3000);
		
		//invalid
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		//InvalidSelectorException: Compound class names not permitted >>compound means multiple class
		
		
		//single class: valid
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		
		
		//valid: compound classes with xpath will work
         //driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");
		
         //invalid: single class with xpath will not work as there is multiple class available so  this is invalid xpath. if you want to use single class then use contain
		//driver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("test@gmail.com");
         
       //valid:
 		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("test@gmail.com");
		
		///valid: compound classes with cssselector will work
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		
		//valid
		//driver.findElement(By.cssSelector("input.login-email")).sendKeys("test@gmail.com");
		
		//InvalidSelectorException: invalid selector-- here xpath expression is incorrect
		//driver.findElement(By.xpath("//input@[@id==='username' @]")).sendKeys("test@gmail.com");
		
		//NSE, here xpath is correct but this element is not present on page
		driver.findElement(By.xpath("//input[@id='naveen']")).sendKeys("test@gmail.com");
		

				
	}

}
