package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///E:/Selenium/MultiSelectListBox.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		s.selectByIndex(0);
		s.selectByValue("d");
		s.selectByVisibleText("poori");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		s.deselectByValue("d");
		s.deselectByVisibleText("poori");
		boolean status = s.isMultiple();
		System.out.println(status);
	}

}
