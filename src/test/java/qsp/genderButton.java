package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class genderButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(3000);
		int g1 = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		int g2 = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int g3 = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		if(g1==g2 && g2==g3 )
		{
			System.out.println("Gender radio button is properly alinged and pass");
		}
		else {
			System.out.println("Gender radio button is not properly aligned and fail");
		}
		driver.close();
	}
	
}
