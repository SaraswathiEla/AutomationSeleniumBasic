package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//WebDriverWait wait=new WebDriverWait(driver, 15);
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
		boolean text = driver.findElement(By.id("demo")).isDisplayed();
		if(text==true) {
			System.out.println(" 'You Pressed Cancel' text is displayed");
		}
		else {
			System.out.println(" 'You Pressed Cancel' text is not displayed");
		}
		driver.close();
}
}
