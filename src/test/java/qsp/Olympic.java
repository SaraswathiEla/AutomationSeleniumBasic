package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olympic {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://olympics.com");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		String name = "Mikaela SHIFFRIN";
		String gold = driver.findElement(By.xpath("//span[text()='"+name+"']/ancestor::li//span[@class='result-medal result-medal--gold']")).getText();
		System.out.println("Gold -> "+gold);
		String silver = driver.findElement(By.xpath("//span[text()='"+name+"']/ancestor::li//span[@class='result-medal result-medal--silver']")).getText();
		System.out.println("Silver -> "+silver);
		driver.close();
	}
}
