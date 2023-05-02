package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartIphone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> iphone = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count=iphone.size();
		for(int i=0; i<count; i++) {
			String product = iphone.get(i).getText();
			String ps = price.get(i).getText();
			System.out.println(product +"  ===>  "+ ps );
			}
		driver.close();
		}
	}

