package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement link = driver.findElement(By.partialLinkText("Resources"));
		Actions a= new Actions(driver);
		a.moveToElement(link).perform();
		driver.findElement(By.linkText("Customers")).click();
		WebElement click = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(click).perform();
		WebElement page = driver.findElement(By.xpath("//h1[text()='HackerEarth + Vtiger CRM']"));
		if(page.isDisplayed()) {
			System.out.println("'HackerEarth' page is displayed");
		}else {
			System.out.println("'HackerEarth' page is not displayed");
		}
		driver.quit();
	}
}
