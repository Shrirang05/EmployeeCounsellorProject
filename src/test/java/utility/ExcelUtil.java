package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	 public static FileInputStream fi;
	    public static XSSFWorkbook wb;
	    public static XSSFSheet ws;
	    public static XSSFRow row;
	    public static XSSFCell cell;
	   
	    public static String getcelldata (String xlsheet,int rownum,int colnum)
	    {
	    	String data="";
	    	try {
	    	fi = new FileInputStream("D:\\shrirang.ladda\\git\\EmployeeCounsellorProject\\TestData\\Book1.xlsx");
	    	wb=new XSSFWorkbook(fi);
	    	ws = wb.getSheet(xlsheet);
	    	cell = ws.getRow(rownum).getCell(colnum);
	    	
//	    	data = cell.toString();
	    	DataFormatter formatter = new DataFormatter();
	    	data = formatter.formatCellValue(cell);   
	    		
	    		wb.close();
	        	fi.close();
	        	
	    	}
	    	catch(Exception e) {
	    		data=e.getMessage();
	    	}
	    	
	    	return data;	
	    }
}
