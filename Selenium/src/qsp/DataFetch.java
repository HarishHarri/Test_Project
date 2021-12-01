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

public class DataFetch 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//step1: specify the path of excel folder
		FileInputStream fis=new FileInputStream("./excel/trial.xlsx");
		//step2:open the excel
		Workbook wb = WorkbookFactory.create(fis);
		//step3:specify the sheet name
		Sheet s = wb.getSheet("sheet1");
		//step4:specify the row num
		Row r = s.getRow(1);
		//step5:specify the column
		Cell c = r.getCell(1);
		//step6:fetch the data
		String value = c.toString();
		System.out.println(value);
	}
}
