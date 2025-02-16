package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");// page
		
		//switch to frame 1
		driver.switchTo().frame("pact1");//f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		//switch to frame 2
		driver.switchTo().frame("pact2");//f2
		driver.findElement(By.id("jex")).sendKeys("automation");

		//switch to frame 3
		driver.switchTo().frame("pact3");//f3
		driver.findElement(By.id("glaf")).sendKeys("Google");
		
		//Switch back form Frame 3 to frame 2
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys(" framework");
		
		//Switch back form Frame 2 to frame 1
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys(" scenarios");
		
		//Switch back from Frame 1 to main method
		//1.using default content method
		//driver.switchTo().defaultContent();
		//2.Using parentframe method
		driver.switchTo().parentFrame();//if parent is a browser page, then it will go to back to the browser page
		//capture header on main page
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
		//from page to frame 2
		//This is invalid, NoSuchFrameException
		//first we have to go to f1 and then to f2
		//driver.switchTo().frame("pact2");//f2
		//driver.findElement(By.id("jex")).sendKeys("automation");
		//Sequence to follow
		//page>frame1>fream2>frame3		
		
		//Aagain move from page>f1>f2>f3
		driver.switchTo().frame("pact1");//f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		driver.switchTo().frame("pact2");//f2
		driver.findElement(By.id("jex")).sendKeys(" labs");

		driver.switchTo().frame("pact3");//f3
		driver.findElement(By.id("glaf")).sendKeys(" MS");
		
		//Now move from f3 to main page
		//If you are using defaultContent method then it is possible to switch from any frame(f2,f3) to main page
		//Whereas with parent frame method we can switch only from frame to frame
		driver.switchTo().defaultContent();
		header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
		//instead of writing individual statement you can write hierarch as below: 
		//this hierarchy is only working to switch between frame, you won't be able to interact with webelement
		String header1 = driver.switchTo().frame("pact1")
				.switchTo().frame("pact2")
					.switchTo().frame("pact3")
							.switchTo().parentFrame()
									.switchTo().parentFrame()
											.switchTo().defaultContent()
												.findElement(By.tagName("h3"))
													.getText();
											
System.out.println(header1);
	}

}
