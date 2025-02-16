package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLink {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> FooterAllLinks=driver.findElements(By.xpath("//footer//a"));
		System.out.println(FooterAllLinks.size());
		
		for(WebElement e:FooterAllLinks)
		{
			System.out.println(e.getText());
		}
		
		System.out.println("----------------------");
		List<WebElement> RightSideLinks=driver.findElements(By.xpath("//aside//a"));
		System.out.println(RightSideLinks.size());
		
		for(WebElement p:RightSideLinks)
		{
			System.out.println(p.getText());
		}
	}

}
