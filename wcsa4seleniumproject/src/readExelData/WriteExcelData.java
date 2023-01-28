package readExelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream fis = new FileInputStream("./data/Actitimetestdata.xlsx");

			Workbook wb = WorkbookFactory.create(fis);
			Sheet Sheet = wb.getSheet("validreads");
			Row Row = Sheet.getRow(0);
			Cell Cell =Row.createCell(2);
			Cell.setCellValue("Link");
			FileOutputStream fos = new FileOutputStream("./data/Actitimetestdata.xlsx");
			wb.write(fos);
	}		
}
