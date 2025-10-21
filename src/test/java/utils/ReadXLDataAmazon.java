package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadXLDataAmazon {
	@Test
	public static Object[][] dataReader() throws IOException {
		
		FileInputStream file = new FileInputStream("C:/Users/Dilip/eclipse-workspace/third-batch-java/src/test/resources/testdata.xlsx");
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheetAt(0);		
		Object[] [] data = new Object[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				data[i - 1][j] = row.getCell(j).toString();
			}
		}
		return data;
	}
}
