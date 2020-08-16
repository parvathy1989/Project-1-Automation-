package UtilityCommon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReadExcel {
	FileInputStream obj;
	XSSFWorkbook book;
	XSSFSheet objsheet;
	XSSFRow row;
	XSSFCell cell;
	public static WebDriver driver;
	JavascriptExecutor js;
	
	public String ReadExcel1(int r, int c) throws IOException {
		String Value = "";
		obj = new FileInputStream("C:\\Users\\sasis\\Desktop\\Selenium\\Book1Project.xlsx");
		book = new XSSFWorkbook(obj);
		objsheet = book.getSheet("Sheet1");
		row = objsheet.getRow(r);
	cell = row.getCell(c);
		CellType type = cell.getCellType();
		if (type == CellType.NUMERIC) {
			double Value1 = cell.getNumericCellValue();
			String str = String.valueOf(Value1);
			return str;
		} else if (type == CellType.STRING) {
			Value = cell.getStringCellValue();
		}
		return Value;
	}

}
