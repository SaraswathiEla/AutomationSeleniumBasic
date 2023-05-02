package qsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String pw = driver.getWindowHandle();

		driver.findElement(By.xpath("actiTIME Inc.")).click();
		Set<String> allWh = driver.getWindowHandles();
		Iterator<String> i=allWh.iterator();
		while(i.hasNext()) {
			String cw = i.next();
			driver.switchTo().window(cw);
			if(!pw.equalsIgnoreCase(cw)) {
				driver.close();
			}
		}
	}
}
