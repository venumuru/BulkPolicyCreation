package dataReader;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class SupportMethods {

    ArrayList<String> cellValues;
    HashMap<String, ArrayList> requestData;
    ArrayList<String> value;
    String location = "C:\\GitHub\\BulkPolicyCreation\\src\\main\\java\\dataReader\\";
    String fileName = "data.xlsx";
    FileInputStream inputStream = null;
    XSSFWorkbook workBook = null;
    XSSFRow row;
    XSSFSheet sheet;
    int rowCount;
    int colCount;

    public HashMap<String, ArrayList> getRequestData() {
        updateSheetMetrics();
        requestData = new HashMap<>();
        readExcelData();
        return requestData;
    }

    public String setKey() {
        String key = new String();
        ArrayList<String> value = new ArrayList<>();
        for (int i = 0; i < cellValues.size() - 1; i++) {
            key = key + cellValues.get(i) + ".";
        }
        return key.substring(0, key.length() - 1);
    }

    public void dataMapper(String key) {
        value = new ArrayList<>();
        if (requestData.containsKey(key)) {
            value = requestData.get(key);
            value.add(cellValues.get(cellValues.size() - 1));
            requestData.replace(key, value);
        } else {
            value.add(cellValues.get(cellValues.size() - 1));
            requestData.put(key, value);
        }
    }

    public void readExcelData() {
        for (int colIndex = 0; colIndex < colCount; colIndex++) {
            cellValues = new ArrayList<>();
            for (int rowIndex = 0; rowIndex <= rowCount; rowIndex++) {
                row = sheet.getRow(rowIndex);
                XSSFCell cell = row.getCell(colIndex);
                if(!(cell == null )){
                    if(!(cell.getCellTypeEnum() == CellType.BLANK))
                        cellValues.add(cell.toString());
                }
            }
            dataMapper(setKey());
        }
    }

    public void updateSheetMetrics(){
        try {
            inputStream = new FileInputStream(location + fileName);
            workBook = new XSSFWorkbook(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet = workBook.getSheetAt(0);
        rowCount = sheet.getLastRowNum();
        colCount = sheet.getRow(1).getLastCellNum();
    }
}
