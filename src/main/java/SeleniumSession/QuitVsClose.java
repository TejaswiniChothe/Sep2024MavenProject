package SeleniumSession;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();	
		//2. enter url
		driver.get("https://www.google.com");
		//ChromeDriver: chrome on windows (bb59ca39d9001e4937da6f2f3ddb0ffc)	
		//3. get the page title
		String title = driver.getTitle();
		//ChromeDriver: chrome on windows (bb59ca39d9001e4937da6f2f3ddb0ffc)	
		System.out.println("page title:"+ title);
		
		String Url=driver.getCurrentUrl();
		//ChromeDriver: chrome on windows (bb59ca39d9001e4937da6f2f3ddb0ffc)	

		System.out.println("URL of the page:"+Url);
		
		driver.quit();
		//ChromeDriver: chrome on windows (bb59ca39d9001e4937da6f2f3ddb0ffc)	

		//System.out.println(driver.getTitle());
		//ChromeDriver: chrome on windows (null)
		
		driver = new ChromeDriver();
		//ChromeDriver: chrome on windows (null)

		driver.get("https://www.google.com");
		//ChromeDriver: chrome on windows (13ded3a87813d9e03ace6babd5847510)
		String title1 = driver.getTitle();
		//ChromeDriver: chrome on windows (13ded3a87813d9e03ace6babd5847510)

		System.out.println("page title:"+ title);
		driver.quit();
		
		//Case 2: Close
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		//ChromeDriver: chrome on windows (367290944ed22b6b7be864366582d71c)
		//3. get the page title
		String title2 = driver.getTitle();
		//ChromeDriver: chrome on windows (367290944ed22b6b7be864366582d71c)
		System.out.println("page title:"+ title);
		
		String Url1=driver.getCurrentUrl();
		//ChromeDriver: chrome on windows (367290944ed22b6b7be864366582d71c)

		System.out.println("URL of the page:"+Url);
		
		driver.close();
		//ChromeDriver: chrome on windows (367290944ed22b6b7be864366582d71c)

		System.out.println(driver.getTitle());
		//ChromeDriver: chrome on windows (367290944ed22b6b7be864366582d71c)



	}

}
