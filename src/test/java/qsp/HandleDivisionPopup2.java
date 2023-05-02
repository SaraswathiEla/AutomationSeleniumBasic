package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDivisionPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select d=new Select(month);
		d.selectByIndex(4);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y=new Select(year);
		y.selectByValue("1995");
		driver.findElement(By.xpath("//a[text()='7']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(text==true) {
			System.out.println(" 'Please enter valid Policy No.' text is displayed");
		}
		else {
			System.out.println(" 'Please enter valid Policy No.' text is not displayed");
		}
		driver.close();

		
	}
}
