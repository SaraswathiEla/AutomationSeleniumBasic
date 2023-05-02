package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup2 {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
			driver.findElement(By.id("usernameField")).sendKeys("amruthgowda36@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("Batman@1661");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(4000);
			File f=new File("E:\\Eclipse\\eclipse-workspace\\Automation\\src\\data\\Resume.docx");
			String absolutePath = f.getAbsolutePath();
			driver.findElement(By.id("attachCV")).sendKeys(absolutePath);
			
		}
	}
