package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLinkTextAndPartialLT {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:\\demo.html");
		driver.findElement(By.linkText("Google")).click();
		driver.findElement(By.partialLinkText("Inbox")).click();
	}

}
