package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlData {
	public static Sheet sheet;
	public static String readData(int row, int col) throws IOException {
		rowCount();
		Cell cell = sheet.getRow(row).getCell(col);
		return cell == null ? "" : cell.toString();
	}
	
	public static int rowCount() throws IOException {
		FileInputStream input = new FileInputStream("C:/Users/Dilip/eclipse-workspace/third-batch-java/src/test/resources/amazonkeyword.xlsx");
		Workbook book = new XSSFWorkbook(input);
		sheet = book.getSheetAt(0);
		return sheet.getPhysicalNumberOfRows();
	}
}
