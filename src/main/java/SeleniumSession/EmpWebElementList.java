package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpWebElementList {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.className("naveen")).click();//NSE

		List<WebElement> myList = driver.findElements(By.className("naveen"));	
		
		System.out.println(myList);//[]
		
		System.out.println(myList.size());//0
	}

}
