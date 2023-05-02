package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpath {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///E:\\htmlTree.html");
			driver.findElement(By.xpath("/html/body/div[1]/a[1]")).click(); //link1
			//driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click(); //link2
			//driver.findElement(By.xpath("/html/body/div[2]/a[1]")).click(); //link3
			//driver.findElement(By.xpath("/html/body/div[2]/a[2]")).click(); //link4
			//driver.findElement(By.xpath("/html/body/div/a")).click(); //link1,2,3,4
			//driver.findElement(By.xpath("/html/body/div[1]/a")).click(); //link1,2
			//driver.findElement(By.xpath("/html/body/div[2]/a")).click(); //link3,4
			//driver.findElement(By.xpath("/html/body/div/a[1]")).click(); //link1,3
			//driver.findElement(By.xpath("/html/body/div/a[2]")).click(); //link2,4
			//driver.findElement(By.xpath("/htlm/body/div[2]/img")).click();
		}
}
