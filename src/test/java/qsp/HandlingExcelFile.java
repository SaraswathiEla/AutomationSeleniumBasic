package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\Eclipse\\eclipse-workspace\\Automation\\src\\data\\testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("create customer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	}

}
