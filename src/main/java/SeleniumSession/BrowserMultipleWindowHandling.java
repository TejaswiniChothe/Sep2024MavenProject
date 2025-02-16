package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");// parent window
		Thread.sleep(3000);

		//to avoid parent widow, store it here
		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='facebook logo']")).click();
		driver.findElement(By.xpath("//img[@alt='linkedin logo']")).click();
		driver.findElement(By.xpath("//img[@alt='youtube logo']")).click();

		Set<String> handles = driver.getWindowHandles();		

		Iterator<String> it = handles.iterator();
		
		//hasnext>> it ask iterator if it has next element, if it return true
		//then move to next element it.next()
		//Store it in WindowID
		//now switch to that window id
		//print the url ofthe window
		//close the window
		//it will keep going until last element
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println("window url: " + driver.getCurrentUrl());

			Thread.sleep(1500);

			//so only other windows will get closed
			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title: "+ driver.getTitle());
}

}

