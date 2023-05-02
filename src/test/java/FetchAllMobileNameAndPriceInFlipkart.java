import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchAllMobileNameAndPriceInFlipkart {
	@Test
	public void fetchmobilename()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the product to search ");
		String product="lipstic";//sc.nextLine();
		
		driver.get("https://www.flipkart.com/");	
		//click the input area
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		
		//enter the product in search bar
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//fetch all the mobilename  
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		
		
		//fetch 
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_4rR01T']/../following-sibling::div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']"));
          for(int i=0;i<mobiles.size();i++) {
        	  System.out.print(mobiles.get(i).getText()+"==>Rs"+prices.get(i).getText().substring(1));
          System.out.println();
          }
          
		
		
		
	}

}
