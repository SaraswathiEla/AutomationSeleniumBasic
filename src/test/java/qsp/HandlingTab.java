package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String> allWh = driver.getWindowHandles();
	int count=allWh.size();
	for(String wh:allWh) {
		 driver.switchTo().window(wh);
		 String a = driver.getTitle();
		System.out.println(a);
	}
	driver.quit();
	}

}
