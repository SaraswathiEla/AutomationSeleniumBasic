package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutuplicates {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			HashSet <String> hs=new HashSet<String>();
			WebDriver driver= new ChromeDriver();
			driver.get("file:///E:/Selenium/MultiSelectListBox.html");
			WebElement mtrListBox = driver.findElement(By.id("mtr"));
			Select s=new Select(mtrListBox);
			List<WebElement> allOptions = s.getOptions();
			for(int i=0; i<allOptions.size(); i++) {
				String text = allOptions.get(i).getText();
				hs.add(text);
			}
			for(String options:hs) {
				System.out.println(options);
			}
			
		}
}
