package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Eclipse/TraversingXpath.html");
		List<WebElement> content = driver.findElements(By.xpath("//td"));
		int count=content.size();
		for(int i=0; i<count; i++) {
			String text = content.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
