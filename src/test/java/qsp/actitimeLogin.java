package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitimeLogin {
	static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver1.exe");
		}
	
	public void waitForPageLod(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	public void customWait(WebElement element) {
		int i=0;
		while(i<=100) {
			try {
				element.isEnabled();
				break;
			}catch(Exception e) {
				i++;
			}
		}
	}
	
	public void selectByIndex(WebElement driver, int i) {
		Select s= new Select(driver);
		s.selectByIndex(i);
	}
	
	public void selectByValue(WebElement driver, String value) {
		Select s= new Select(driver);
		s.selectByValue(value);
	}
	public void selectByText(WebElement driver, String text) {
		Select s= new Select(driver);
		s.selectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions a= new Actions(driver);
		a.moveToElement(element).perform();
		}
	
	public void dragAndDrop(WebDriver driver, WebElement scr, WebElement dest  ) {
		Actions a=new 	Actions(driver);
		a.dragAndDrop(scr, dest).perform();
	}
	
	public void rightClick(WebDriver driver, WebElement element) {
		Actions a= new Actions(driver);
		a.contextClick();
	}
	
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions a= new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	public void frameHandle(WebDriver driver, int frameNo) {
		driver.switchTo().frame(frameNo);
	}
	
	public void parentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	public void defaultContentFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			actitimeLogin a=new actitimeLogin();
			driver.get("https://demo.actitime.com/login.do");
			WebElement e = driver.findElement(By.id("username"));
			a.doubleClick(driver, e);
			
	}

}
