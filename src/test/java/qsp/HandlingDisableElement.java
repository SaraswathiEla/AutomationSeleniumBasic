package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisableElement {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/Selenium/Login.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		//RemoteWebDriver r=(RemoteWebDriver) driver;
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById(\"d2\").value=(\"manager\")\r\n"
				+ "\r\n"
				+ "", 0);
		Thread.sleep(3000);
		j.executeScript("document.getElementById(\"d3\").click()\r\n"
				+ "\r\n"
				+ "", args);
		Thread.sleep(3000);
		j.executeScript("document.getElementById(\"d2\").value=(\"\")\r\n"
				+ "", args);
	}

}
