package PracticeAmazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileAddToCart {
	
	@Test()
	public void addTocart() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazon.com/");	
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobile");		
		List<WebElement> autosag = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	int count=	autosag.size();
	System.out.println(count);
	String value = autosag.get(count-3).getText();
	System.out.println(value);
			
			
		 
		
	}
}

