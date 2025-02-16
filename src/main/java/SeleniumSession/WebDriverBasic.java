package SeleniumSession;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//manual test cases---> Automation test steps
				//1. open browser(chrome, ff, safri, edge)
				ChromeDriver driver = new ChromeDriver();		
				//2. enter url
				driver.get("https://www.google.com");
				//3. get the page title
				String title = driver.getTitle();
				System.out.println("page title:"+ title);
				
				//4. verify the actual title is as per expected title:
				//validation point/checkpoint: Automation steps + validation(checkpoint/assertions) = automation Testing
				if(title.equals("Google")) {
					System.out.println("PASS");
				}
				else {
					System.err.println("FAIL");
				}
				//5. close the browser
				driver.quit();
				
	}

}
