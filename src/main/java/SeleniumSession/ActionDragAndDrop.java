package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetele = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		//first way
		//act.clickAndHold(sourceEle).moveToElement(targetele).release().build().perform();
		
		//second way
		act.dragAndDrop(sourceEle, targetele).build().perform();

	}

}
