package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintInAlphabetic {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium/MultiSelectListBox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		for(WebElement e:s.getOptions()) {
			al.add(e.getText());
		}
		Collections.sort(al);
		for(int i=0; i<al.size(); i++) {
			String option = al.get(i);
			System.out.println(option);
		}
		driver.close();
	}
	
}
