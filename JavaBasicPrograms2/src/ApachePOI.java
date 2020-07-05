import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.management.InstanceAlreadyExistsException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// import statements
public class ApachePOI {
	public void ReadExcel(String filepath)
	{
		 try {
	            FileInputStream file = new FileInputStream(new File(filepath));
	 
	            // Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            // Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            // Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            while (rowIterator.hasNext()) {
	                Row row = rowIterator.next();
	                // For each row, iterate through all the columns
	                Iterator<Cell> cellIterator = row.cellIterator();
	 
	                while (cellIterator.hasNext()) {
	                    Cell cell = cellIterator.next();
	                    // Check the cell type and format accordingly
	                    switch (cell.getCellType()) {
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue());
	                        break;
	                    case Cell.CELL_TYPE_STRING:
	                        System.out.print(cell.getStringCellValue());
	                        break;
	                    }
	                }
	                System.out.println("");
	            }
	            file.close();
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	}
	public void WriteExcel(String filepath){
		try {
            FileOutputStream out = new FileOutputStream(new File(filepath));
 
            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = (XSSFWorkbook) WorkbookFactory.create(new File(filepath));
 
            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.createSheet("Test Sheet3");
            Map<String, Object[]> data= new TreeMap<String, Object[]>();
            data.put("1", new Object[]{"ID","Last Name","First Name"});
            data.put("2", new Object[]{"1","Raja","Ram"});
            data.put("3", new Object[]{"2","Virat","Kohli"});
            data.put("4", new Object[]{"3","Sania","Mirza"});
            
            Set<String> keyset= data.keySet();
            
            int rownum=0;
            for (String key: keyset){
            	Row row=sheet.createRow(rownum++);
            	Object[] objArr= data.get(key);
            	int cellNum=0;
            	for(Object obj:objArr ){
            		Cell cell= row.createCell(cellNum++);
            		if (obj instanceof String){
            			cell.setCellValue((String)obj);
            		}
            		else if (obj instanceof Integer){
            			cell.setCellValue((Integer)obj);
            		}            		
            	}
            }
            workbook.write(out);
            
            out.close();
            System.out.println("data written into excel");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

	}
@SuppressWarnings("deprecation")
public static void main(String[] args)
    {
	ApachePOI ap=new ApachePOI();
	ap.WriteExcel("E:\\sampleXlsx.xlsx");
	
          }
}