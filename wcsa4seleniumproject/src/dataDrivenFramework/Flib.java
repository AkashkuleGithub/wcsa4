package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelpath,String sheetname,int rowCount,int cellCount) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowCount);
	Cell cell = row.getCell(cellCount);
	
	String data = cell.getStringCellValue();
	                              return data;
	
	}

public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data/Actitimetestdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
int rc = sheet.getLastRowNum();
return rc;
}

public void writeExelData(String excelPath,String sheetName,int rowcount,int Cellcount,String data ) throws EncryptedDocumentException, IOException {
        FileInputStream fis = new FileInputStream(excelPath);
                     Workbook wb = WorkbookFactory.create(fis);
                    Sheet sheet = wb.getSheet(sheetName);
                   Row row = sheet.getRow(rowcount);
                   Cell cell = row.createCell(2);
                    
                  cell.setCellValue(data);

                   
                  FileOutputStream fos = new FileOutputStream(excelPath);
                  wb.write(fos);
	}
}




	


