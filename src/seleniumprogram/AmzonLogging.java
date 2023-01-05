package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonLogging 
{
	public static void main (String[]args) throws InterruptedException
 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe" );
		//to launch browser
		WebDriver driver = new ChromeDriver();
		// to open URL
		driver.get("https://www.amazon.in/");
		// to maximize browser
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement signIn= driver.findElement(By.id("nav_link-accountList-nav-line-1"));
		signIn.click();
		Thread.sleep(3000);
		
		WebElement  emailId = driver.findElement(By.id("ap_email"));
		emailId.sendKeys("kadampratiksha29@gmail.com");
		Thread.sleep(3000);
		
		WebElement conti= driver.findElement(By.id("continue"));
		conti.click();
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("pratu@2329");
		
		
		
		
}
}