package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsMTR {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		/*
		WebDriver driver= new ChromeDriver();
		driver.get("file:///E:/Selenium/MultiSelectListBox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement i:allOptions) {
			System.out.println(i.getText());
		}
		driver.close();
		*/
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium/MultiSelectListBox.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement> allOptions = s.getOptions();
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
		driver.close();


		
	}
}
