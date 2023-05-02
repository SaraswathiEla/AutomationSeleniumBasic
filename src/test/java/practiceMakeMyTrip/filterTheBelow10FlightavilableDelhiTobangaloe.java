package practiceMakeMyTrip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class filterTheBelow10FlightavilableDelhiTobangaloe {
	
@Test
public void main() throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");	
	Thread.sleep(2000);
//	Actions act=new Actions(driver);
//	WebElement desti = driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]"));
//
//act.moveToElement(desti).click().perform();
		driver.findElement(By.xpath("//a[text()='Search']")).click(); 
		driver.navigate().refresh();
		driver.navigate().refresh();

		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
	driver.findElement(By.xpath("//span[@class='linkText pointer'][1]")).click();
	List<WebElement> list = driver.findElements(By.xpath("(//div[@class='filtersOuter'])[1]//div[@class='makeFlex spaceBetween appendBottom12']//label/div"));
	for(WebElement l:list )
	{
		String value = l.getText();
		int exp = Integer.parseInt(value.replaceAll("[^0-9]", ""));
		if(exp<10)
		{
			l.click();
		//	System.out.println(tag);

			//driver.findElement(By.className(tag)).click();
			Thread.sleep(2000);
			
		}

		//System.out.println(exp);
	}
	
String airline=driver.findElement(By.xpath("//div[@class='listingCard']//child::div[@class='makeFlex simpleow']//descendant::p[@class=\"boldFont blackText airlineName\"]")).getText();
String departure =driver.findElement(By.xpath("(//div[@class='listingCard']//child::div[@class='timingOptionOuter']//descendant::p[@class=\"appendBottom2 flightTimeInfo\"])[1]")).getText();
String arrival = driver.findElement(By.xpath("(//div[@class='listingCard']//child::div[@class='timingOptionOuter']//descendant::p[@class=\"appendBottom2 flightTimeInfo\"])[2]")).getText();
String duration=driver.findElement(By.xpath("//div[@class='listingCard']//child::div[@class='timingOptionOuter']//descendant::div[@class=\"stop-info flexOne\"]/p")).getText();
String price=driver.findElement(By.xpath("//div[@class='listingCard']//child::div[@class='priceSection']//descendant::p[@class=\"blackText fontSize18 blackFont white-space-no-wrap\"]")).getText();	

System.out.println(airline);
System.out.println(departure);
System.out.println(arrival);
System.out.println(duration);
System.out.println(price);

FileInputStream fis=new FileInputStream("C:\\Users\\Saraswathi B\\Desktop\\eclipse_workspace\\selenium_workspace\\ofosgitworspace\\practiceAutomation\\src\\test\\resources\\sdet46excel.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet("make").getRow(1).getCell(0).setCellValue(airline);
wb.getSheet("make").getRow(1).getCell(1).setCellValue(departure);
wb.getSheet("make").getRow(1).getCell(2).setCellValue(arrival);
wb.getSheet("make").getRow(1).getCell(3).setCellValue(duration);
wb.getSheet("make").getRow(1).getCell(4).setCellValue(price);
//ui

FileOutputStream fos=new FileOutputStream("C:\\Users\\Saraswathi B\\Desktop\\eclipse_workspace\\selenium_workspace\\ofosgitworspace\\practiceAutomation\\src\\test\\resources\\sdet46excel.xlsx");
wb.write(fos);
wb.close();




	}
}
