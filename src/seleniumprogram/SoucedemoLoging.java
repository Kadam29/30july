package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoucedemoLoging 
{
	
	public static void main (String []args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chrome\\chromedriver.exe");
		//to launch browser
		WebDriver driver = new ChromeDriver();
		// to open URL
		driver.get("https://www.saucedemo.com/");
		// to maximize browser
		driver.manage().window().maximize();
		//Thread.sleep(3000);
	
		
		//To find username by using Xpath + action perform .
				WebElement usename=driver.findElement(By.xpath("//input[@type='text']"));
				usename.sendKeys("standard_user");
				 Thread.sleep(3000);
				
				//To find username by using Xpath + action perform .
				WebElement Password =driver.findElement(By.xpath("//input[@name='password']"));
				 Password.sendKeys("secret_sauce");
				 Thread.sleep(3000);

				 //to find clickbtn by using xpath + action perform 
				WebElement clickBtn = driver.findElement(By.xpath("//input[@name='login-button']"));
				    clickBtn.click();
				
				    Thread.sleep(3000);
	}
}