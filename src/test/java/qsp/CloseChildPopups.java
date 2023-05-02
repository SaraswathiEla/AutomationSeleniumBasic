package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildPopups {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pwh = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();
		/*for(String wh:allWh) {
			driver.switchTo().window(wh);
			if(pwh.equals(allWh)) {
			}
			else {
				driver.close();
			}
		}*/
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			if(!(pwh.equals(allWh))) {
				driver.close();
			}
		}
	}
}
