package readExelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/test data.xlsx");
//provide the exel sheet file
		Workbook wb = WorkbookFactory.create(fis);//make the file for read.
		Sheet Sheet = wb.getSheet("IPL");//take sheet name.
		Row Row = Sheet.getRow(3);//get value of the row.
		Cell Cell =Row.getCell(1);//get value of cell.
		String data = Cell.getStringCellValue();//it will give the value present in cell
		System.out.println(data);
		
		
		
	}

}
