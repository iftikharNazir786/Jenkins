package Master;
 
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

 
public class SaveTestResultToExcelFile2{
 
 public static void main(String[] args) { 
 
 
 try {
    
  FileInputStream file = new FileInputStream(new File("C:/Users/Muhammad.Iftikhar/Desktop/Cities.xls")); 
  HSSFWorkbook workbook = new HSSFWorkbook(file);
 
  HSSFSheet sheet = workbook.getSheetAt(0);
  

//for (int i=0; i <= sheet.getLastRowNum(); i++){
	for (int i=0; i <= 1; i++){
			for(int j=0; j<1; j++) {
				Cell resultCell= sheet.getRow(i).getCell(j);
				Cell resultCell1= sheet.getRow(i).getCell(j+1);

				
			}
 
        
 
 // Specific cell number 
        /*
 for(int a=0; a<10; a++) {
	 Cell cell = row.createCell(a); 
	 cell.setCellValue("Geeks"); 

 }
*/
 // putting value at specific position 

}
 
  
  FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\Muhammad.Iftikhar\\Desktop\\testdata-result.xls"));
  workbook.write(outFile);
  outFile.close();
 
 } catch (FileNotFoundException fnfe) {
  fnfe.printStackTrace();
 } catch (IOException ioe) {
  ioe.printStackTrace();
 }
 }
}