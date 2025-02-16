package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFields {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> allTextFields=driver.findElements(By.className("form-control"));
		System.out.println(allTextFields.size());
		//search field also has class name as form control ,to avoid this we will use xpath to get only reg form Text field
		
		List<WebElement> RegTextFields=driver.findElements(By.xpath("//form//input[@class='form-control']"));
		System.out.println(RegTextFields.size());


	}

}
