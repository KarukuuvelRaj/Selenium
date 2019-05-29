package baseUtil;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] main(String filename) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./ExcelData/"+filename+".xlsx");
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		//System.out.println(lastRowNum);
		int lastCellNum = sheetAt.getRow(0).getLastCellNum();
		String[][] data = new String [lastRowNum][lastCellNum];
		//System.out.println(lastCellNum);
		for (int i = 1; i<= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j <= lastCellNum; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
		}
		wbook.close();
		return data;
	}

}
