package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		  boolean btn = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		  if(btn==true)
		  {
			  System.out.println("button is enabled");
		  }
		  else {
			  System.out.println("button is not enabled");
		  }
	}	

}
