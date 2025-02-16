package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://practice.expandtesting.com/upload");
		
		//for choose file Webelement "type=file" attribute should be there
		//If this attribute is not there then Senkeys will not work
		
		//In sendkeyy pass file path and name
		
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\Tejaswini\\Downloads\\Tej.txt");
		
		//Robot class: only work for windows,it is not recommende
		//sikuli lib: it is external library. We need to take screenshot of element and then need to interact with element
		//problem with sikuli is we need to mantain n number of screenshot.Also for window & Mac screenshot will be different, in headless mode will also not work
		//AutoIT: only for windows, it is windo shell scripting library
	}
	
	
	
	

}
