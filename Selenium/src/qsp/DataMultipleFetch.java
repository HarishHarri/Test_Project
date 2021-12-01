package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataMultipleFetch 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./excel/ING.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("sheet1");
		String[] arr=new String[4];
		String value=null;
		for(int i=0;i<=s.getLastRowNum();i++)
		{
			Row r = s.getRow(i);
			Cell c = r.getCell(0);
			value = c.getStringCellValue();   
			arr[i]=value;
			String a=arr[i];
			if(a.substring(a.length()-3).contains("ing"))
			{
				System.out.println(a);
			}
			
		}
			/*for (int j = 0; j <arr.length; j++) {
				System.out.println(arr[j]);
			}*/
		
		
	}
}
