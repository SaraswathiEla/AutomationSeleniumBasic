package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSuggestions1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("iphone");
	List<WebElement> sugg = driver.findElements(By.xpath("//span[text()='iphone']/.."));
	int count=sugg.size();
	System.out.println(count);
	for(WebElement i: sugg) {
		String text = i.getText();
		System.out.println(text);
	}
	sugg.get(count-1).click();
	driver.close();
}


}
