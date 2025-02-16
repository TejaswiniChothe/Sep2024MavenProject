package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		selectUser("Joe.Root");
		selectUser("Jasmine.Morgan");

		List<String> joeDetails = getUserDetailsList("Joe.Root");
		System.out.println(joeDetails);
		
		List<String> johnDetails = getUserDetailsList("John.Smith");
		System.out.println(johnDetails);
		
		if(johnDetails.contains("Admin")) {
			System.out.println("john is admin -- pass");
		}
		
	}

	public static void selectUser(String userName) {
		// a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static List<String> getUserDetailsList(String userName) {
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		List<WebElement> colList = driver
				.findElements(By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td"));

		List<String> colValueList = new ArrayList<String>();// []

		for (WebElement e : colList) {
			String text = e.getText();
			colValueList.add(text);
		}

		return colValueList;
	}

}
