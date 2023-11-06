package handson;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportExcel {

	private static XSSFWorkbook wbook;

	public static void main(String[] args) throws IOException {
		String filelocation = "./excel/login-test.xlsx";
		wbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
	
		for (int i = 0; i < 3; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j= 0; j < 2; j++) {

				XSSFCell cell2 = row2.getCell(j);
				String valuev1 = cell2.getStringCellValue();
				System.out.println(valuev1);

			} 
		}
		
		
	}

}
