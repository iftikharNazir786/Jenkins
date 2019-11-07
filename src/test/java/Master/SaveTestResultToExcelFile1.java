package Master;
 
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

 
public class SaveTestResultToExcelFile1{
 
 public static void main(String[] args) { 
 
 
 try {
    
  FileInputStream file = new FileInputStream(new File("C:/Users/Muhammad.Iftikhar/Desktop/abc.xls")); 
  HSSFWorkbook workbook = new HSSFWorkbook(file);
 
  HSSFSheet sheet = workbook.getSheetAt(0);
  

//for (int i=0; i <= sheet.getLastRowNum(); i++){
	for (int i=0; i <= 3; i++){

 
        Cell resultCell= sheet.getRow(0).getCell(i);
       
        resultCell.setCellValue("Hello World");
        sheet.getRow(0).getCell(4);
        System.out.println(resultCell);
        System.out.println(sheet.getRow(0).getCell(3));
      //  String keyword = sheet.getRow(i).getCell(2).getStringCellValue();
 
     
 sheet.getRow(0).getCell(0).setCellValue("Hi");
 Row row = sheet.createRow(3); 
 
 // Specific cell number 
 for(int a=0; a<10; a++) {
	 Cell cell = row.createCell(a); 
	 cell.setCellValue("Geeks"); 

 }

 // putting value at specific position 


        if(true){
                System.out.println("Search is successful.");
                resultCell.setCellValue("Hello World");
                resultCell.setCellValue("Hello World1");
                resultCell.setCellValue("Hello World2");
        } else {
                System.out.println("Search is not successful.");
                resultCell.setCellValue("FAIL");
        }
 
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