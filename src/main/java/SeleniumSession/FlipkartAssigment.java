package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssigment {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement LastFooterLink=driver.findElement(By.xpath("(//div[@class='_1ZMrY_'][last()]//a)[last()-5]"));
		System.out.println(LastFooterLink.getText());
		

	}

}
