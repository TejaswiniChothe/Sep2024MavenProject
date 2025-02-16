package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//total links: <a>
				//print the text of each link if text is available(avoid the blank text)
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of Links:" + allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {
			String linkText = allLinks.get(i).getText();
			if (linkText.length() != 0) {
				System.out.println(linkText);
			}
		}
		System.out.println("---------------------");

		for (WebElement e : allLinks) {

			String linkText1 = e.getText();
			if (linkText1.length() != 0) {
				System.out.println(linkText1);
			}
		}

	}
}
