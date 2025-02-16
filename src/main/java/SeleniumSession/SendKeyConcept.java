package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement firstNameEle = driver.findElement(By.id("input-firstname"));
		WebElement lastNameEle = driver.findElement(By.id("input-lastname"));
		
		String name = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Labs");
		String space = " ";
		
		firstNameEle.sendKeys(name, space, sb, space, sf, space, "selenium");
	}
	//lastNameEle.sendKeys(null);


}
