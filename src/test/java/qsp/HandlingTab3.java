package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'About your actiTIME')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Read Service Agreement')]")).click();
		Set<String> allwh = driver.getWindowHandles(); 
		for(String  h:allwh) {
			List<WebElement> al = driver.findElements(By.xpath("//li[contains(@class,'header__li header')]/..//span[1]"));
			for(WebElement i:al) {
				String text = i.getText();
				System.out.println(text);
		}
	}
}
}