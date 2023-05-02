package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingParticularScrollbar {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.bbc.com/");
			 int y = driver.findElement(By.partialLinkText("Elon Musk")).getLocation().getY();
			 JavascriptExecutor j=(JavascriptExecutor) driver;
			 j.executeScript("window.scroll(0, "+y+")");
			 Thread.sleep(3000);
			 j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			 Thread.sleep(3000);
			 j.executeScript("window.scrollTo(0,0)");
}
}
