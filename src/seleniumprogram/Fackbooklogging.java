package seleniumprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fackbooklogging {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Browser is maximize");
		
		driver.get("https://www.facebook.com/");
		System.out.println("URL is open ");
		
		WebElement username= driver.findElement(By.id("email"));
		
		username.sendKeys(" 7875579968 ");
		System.out.println(" username is enterd");
		
		
		WebElement Password= driver.findElement(By.id("password"));
		username.sendKeys(" akshay ");
		System.out.println(" Password is enterd");
		
		WebElement clickBtn= driver.findElement(By.id("u_0_5_Iy"));
		clickBtn.click();
		System.out.println(" click on loging");
		
		
		
	}
}
