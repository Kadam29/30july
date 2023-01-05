package seleniumprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartnew {

	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chrome\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("Browser is maximize");
	
	driver.get("https://www.flipkart.com");
	System.out.println("url is opend");
	
	//to find username + action perform
	
	WebElement username =driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	username.sendKeys(" kadampratiksha29@gmail.com");
	System.out.println("username entered");
	Thread.sleep(3000);

	// to find password + action perform
	WebElement password =driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	password.sendKeys("Pratu@1994");
	System.out.println("password enterd");
	Thread.sleep(3000);

	//to find loginBtn + action perform
	WebElement  loginBtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	loginBtn.click();
    System.out.println("click on login button");
    //homepage
	System.out.println("Went on HomePage");
    // validation
	
	System.out.println("Apply the Validation");
	
	//WebElement searchbar =driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
	//searchbar.sendKeys("Apple mobile");
	// System.out.println("search apple mobile");
	// Thread.sleep(3000);
	 
	//WebElement searchbtn = driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]"));
	//searchbtn.click();
	 //System.out.println("click on search button");
	 //Thread.sleep(3000);
	
	
	 //WebElement mobileimage = driver.findElement(By.xpath("(//img[@loading=\"lazy\"])[10]"));
		//mobileimage.click();
	
	 //img[@loading="lazy"])[10]
	//String givenTitle = "Flipkart";   		
	//String actualTitle = driver.getTitle();
			
	//if(givenTitle.equals(actualTitle))
	//{
		//System.out.println("Login Test is passed");
	//}
	//else
	//{
	//	System.out.println("Login Test is failed");
	//}
			
			
	//driver.close();
	//System.out.println("browser is closed");
			
	//System.out.println("End of Program");
		WebElement  mfashion=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]"));
		Actions  act = new Actions(driver);
		act.moveToElement(mfashion).perform();
		System.out.println("click on mfashion");
		Thread.sleep(1000);

		WebElement  msfash=driver.findElement(By.xpath("//input[@class='eFQ30H']"));
		act.click(msfash).perform();
		System.out.println("click done");

 }
	

}
