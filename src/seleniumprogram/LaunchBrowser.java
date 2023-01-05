package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		
	// To launch browser
		WebDriver driver =  new ChromeDriver();
   
	// To open URL
		
		driver.get("https://www.google.com");

    // To capure title of current webpage 
		
	System.out.println("Title of the page:"+  driver.getTitle());
	
	// To capture current URL of page	
	
	System.out.println ("Current URL of the page:"  +driver.getCurrentUrl());
	// To capture source of the page 
	
	System.out.println(driver.getPageSource());
		
		
	}

}
