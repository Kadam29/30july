package practiceprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPageLoging {

	public static void main (String[] args) throws InterruptedException
	{
System.setProperty( "webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chrome\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://practice.automationtesting.in");
		System.out.println("Website is open");
		Thread.sleep(3000);
		
        WebElement myac1= driver.findElement(By.xpath("//a[text()='My Account']"));
		myac1.click();
		System.out.println("Click done on my account");
		Thread.sleep(3000);

		WebElement regusername =driver.findElement(By.id("username"));
		regusername.sendKeys("artoftesting2022@gmail.com");
		System.out.println("Username entered");
		Thread.sleep(3000);

		
		WebElement  regpassword =driver.findElement(By.id("password"));
		regpassword.sendKeys("");
		System.out.println("Password entered");
		Thread.sleep(3000);
		
		WebElement  regclk =driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		regclk.click();
		System.out.println("Click on login btn");
		Thread.sleep(5000);
		
		WebElement logout= driver.findElement(By.linkText("Logout"));
		logout.click();
		System.out.println("Logout done");
		Thread.sleep(3000);
		
		driver.close();
		
			
}
		
}