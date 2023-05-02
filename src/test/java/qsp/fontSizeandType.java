package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fontSizeandType {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 String size = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
		 System.out.println("Font size: "+size);
		 String type = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-family");
		 System.out.println("Font type: "+type);
		 driver.close();
}
}