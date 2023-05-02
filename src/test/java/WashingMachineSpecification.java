import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WashingMachineSpecification {
	@Test
	public void GetSpecification() throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("washing machines");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='SAMSUNG 7 kg Diamond Drum feature Fully Automatic Top Load Washing Machine Silver']")).click();
	
		Set<String> tab = driver.getWindowHandles();
		
		for(String t:tab)
		{
			driver.switchTo().window(t);
			if(driver.getTitle().contains("SAMSUNG 7 kg Diamond Drum feature Fully Automatic Top Load"))
break;
			
			
		}
		String Brand=driver.findElement(By.xpath("//td[text()='Brand']//following::td")).getText();
		System.out.println(Brand);
		String Model_Name=driver.findElement(By.xpath("//td[text()='Model Name']//following::td")).getText();
		System.out.println(Model_Name);
		String Function_Type=driver.findElement(By.xpath("//td[text()='Function Type']//following::td")).getText();
		System.out.println(Function_Type);
		
		
		String Energy_Rating=driver.findElement(By.xpath("//td[text()='Energy Rating']//following::td")).getText();
		System.out.println(Function_Type);
		
		String Washing_Capacity=driver.findElement(By.xpath("//td[text()='Washing Capacity']//following::td")).getText();
		System.out.println(Washing_Capacity);
		
		 

FileInputStream fis=new FileInputStream("./src\\test\\resources\\wash.xlsx");
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet("wash").getRow(1).getCell(0).setCellValue(Brand);
wb.getSheet("wash").getRow(1).getCell(1).setCellValue(Model_Name);
wb.getSheet("wash").getRow(1).getCell(2).setCellValue(Function_Type);
wb.getSheet("wash").getRow(1).getCell(3).setCellValue(Energy_Rating);
wb.getSheet("wash").getRow(1).getCell(4).setCellValue(Washing_Capacity);


FileOutputStream fos=new FileOutputStream("./src\\test\\resources\\wash.xlsx");
wb.write(fos);
wb.close();



		 	}

}
