package seleniumprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	
	public static void main (String []args) throws InterruptedException
			{
		
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chrome\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(" URL is opend ");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	    Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
	    Thread.sleep(3000);
	    
	    WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    login.click();
	    
	    
		
		
		
		
		
		
		
}
}