package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		//String text = driver.findElement(By.xpath("//span[text()='Forgot your password?']")).getTagName();
		//		System.out.println("TagName : "+text);
				
		WebElement textbox = driver.findElement(By.xpath("//input[@name='username']"));
		int h1=textbox.getLocation().getX();
		int w1=textbox.getLocation().getX();
		WebElement textbox2 = driver.findElement(By.xpath("//input[@name='password']"));
		int h2=textbox2.getLocation().getX();
		int w2=textbox2.getLocation().getX();
		if(h1==h2 && w1==w2)
		{
			System.out.println("Height and Width of Username and password is equal");
		}
		else
		{
			System.out.println("Height and Width of Username and password is  not equal");
		}
		driver.close();
	}
	

}
