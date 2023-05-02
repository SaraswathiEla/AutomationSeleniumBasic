package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public void waitForPageLod(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForElement(WebDriver driver, WebElement element) {
	//	WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void rightClick(WebDriver driver, WebElement element) {
		Actions a= new Actions(driver);
		a.contextClick();
	}
	
	public void frameHandle(WebDriver driver, int frameNo) {
		driver.switchTo().frame(frameNo);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		HandlingFrames h= new HandlingFrames();
		driver.manage().window().maximize();
		h.waitForPageLod(driver);
		driver.get("file:///E:/Selenium/page1.html");
		h.frameHandle(driver, 0);
		driver.findElement(By.id("t2")).sendKeys("JSP");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("QSP");
	}
}
