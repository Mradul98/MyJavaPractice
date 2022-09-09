package Automation_Testing.Mavan_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//fileinput stream argument 
		
		FileInputStream file=new FileInputStream("C:\\Users\\0036FP744\\Desktop\\Selenium.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		int sheets=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{

				XSSFSheet sheet=workbook.getSheetAt(i);
				
				Iterator<Row> rows=sheet.iterator();
				Row firstrow=rows.next();
			}
		}
		

	}

}
