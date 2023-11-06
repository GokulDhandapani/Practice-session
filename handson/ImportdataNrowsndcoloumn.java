package handson;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportdataNrowsndcoloumn {

	private static XSSFWorkbook workbook;
	public static void main(String[] args) throws IOException {
		 
String filelocation1 = "./excel/N-Number of rowsColoumn.xlsx";
workbook = new XSSFWorkbook(filelocation1);
XSSFSheet newsheet = workbook.getSheetAt(1);

//multiplerow

int lastRowNum = newsheet.getLastRowNum();
System.out.println("no :"+ lastRowNum);



short lastCellNum = newsheet.getRow(0).getLastCellNum();

for(int i=1;i<=lastRowNum;i++){
//sheet of row
XSSFRow row = newsheet.getRow(i);

for(int j=0;j<lastCellNum;j++)
{
//getcell
XSSFCell cell = row.getCell(j);
//if we any data we send the value in send keys as a string.
DataFormatter dft = new DataFormatter();
String value5 = dft.formatCellValue(cell);

//String value5 = cell.getStringCellValue();

System.out.println(value5);

}

	}
	}
}
	

