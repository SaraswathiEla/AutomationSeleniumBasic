package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("E:\\\\Eclipse\\\\eclipse-workspace\\\\Automation\\\\src\\\\data\\\\testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("create customer").getRow(1).getCell(5).setCellValue("fail");
		FileOutputStream fos= new FileOutputStream("E:\\Eclipse\\eclipse-workspace\\Automation\\src\\data\\testscript.xlsx");
		wb.write(fos);
		wb.close();
	}

}
