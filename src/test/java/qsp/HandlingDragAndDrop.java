package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public void dragAndDrop(WebDriver driver, WebElement scr, WebElement dest  ) {
		Actions a=new 	Actions(driver);
		a.dragAndDrop(scr, dest).perform();
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		 WebElement scr = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		HandlingDragAndDrop h= new HandlingDragAndDrop();
		h.dragAndDrop(driver, scr, dest);
	}
}
