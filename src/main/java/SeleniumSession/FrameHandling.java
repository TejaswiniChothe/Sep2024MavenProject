package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     //Frame/iframe: It have it's own html dom, which has n number of webelement
		//If we want to interact with the frame element then we have to move driver to frame
		//once work is done then driver need to come out of it to main page so that it can interact with main page element
		//nested frame can be also possible==frame inside frame
		
		
		WebDriver driver = new ChromeDriver();//browser

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		Thread.sleep(3000);
		
		//you can switch to frame by using index but it is not recommend as index can change anytime
		//driver.switchTo().frame(2);
		
		//We can use id& name attribute of frame
		//driver.switchTo().frame("main");
		
		//If name & id attribute are not available, then we can supply frame Web element. Frame is also Web element
		
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		//Frame : according to W3c std , it is deprecated
		//multiple frames can be put inside frameset tag, it is not available in iframe
		
		//iframe: w3c std
		

	}

}
