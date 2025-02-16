package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//To handle auto pop up, in URL itself you can provide user name password like //admin:admin@
		//Make sure your password and username doesn't have @ sign , as one URL can't have two @ character, it will start giving error
		//This will work on only for basic Auth application, It is depend upon technology being used for this application
		
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//You can do it below way as well without hardcoding username & password
		
		String username="admin";
		String password="admin";
		
		//driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		((HasAuthentication) driver).register(() -> new UsernameAndPassword(username, password));

		driver.get("https://the-internet.herokuapp.com/basic_auth");
		String mesg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		System.out.println(mesg);

	}

}
