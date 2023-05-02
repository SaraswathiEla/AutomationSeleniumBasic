package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		List<WebElement> iphone = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]"));
		int count=iphone.size();
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
		for(int i=0; i<count; i++) {
			String ph = iphone.get(i).getText();
			String pr = price.get(i).getText();
			System.out.println(ph+ " ===> " +pr);
		}
	}

}
