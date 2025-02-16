package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClickOnDisableElement {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement pwdEle = driver.findElement(By.id("pass"));//disabled element
		//pwdEle.sendKeys("Test");//element not interactable
		pwdEle.click();
		
		String isElementDisabled = pwdEle.getDomAttribute("disabled");
		System.out.println(isElementDisabled);//true				`
	}

}
