package elevateprogram;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    private static final String STRING = null;
	private static final String NUMERIC = null;
	private static final String BOOLEAN = null;

	public static <Workbook> List<String[]> readExcel(String filePath, String sheetName) {
        List<String[]> data = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.out.println("Sheet not found: " + sheetName);
                return data;
            }

            int rowCount = sheet.getPhysicalNumberOfRows();
            for (int i = 1; i < rowCount; i++) { // Skipping header row (i = 1)
                Row row = sheet.getRow(i);
                if (row != null) {
                    String username = getCellValue(row.getCell(0));
                    String password = getCellValue(row.getCell(1));
                    data.add(new String[]{username, password});
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
		}
        return data;
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return ""; // Return empty string if cell is null
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((int) cell.getNumericCellValue()); // Convert numeric values to String
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }

	public static String getString() {
		return STRING;
	}

	public static String getNumeric() {
		return NUMERIC;
	}

	public static String getBoolean() {
		return BOOLEAN;
	}
}
