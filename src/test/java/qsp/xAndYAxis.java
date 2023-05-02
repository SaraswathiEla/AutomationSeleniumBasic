package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xAndYAxis {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x = driver.findElement(By.id("email")).getLocation().getX();
		int y = driver.findElement(By.id("email")).getLocation().getY();
		System.out.println("x axis :" +x);
		System.out.println("y axis :"+y);
		driver.close();
	}
}
