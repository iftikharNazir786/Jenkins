package Master;
 
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;

 
public class SaveTestResultToExcelFile{
 
 public static void main(String[] args) { 
 
 
 try {
    
  FileInputStream file = new FileInputStream(new File("C:/Users/Muhammad.Iftikhar/Desktop/testdata.xlsx")); 
  HSSFWorkbook workbook = new HSSFWorkbook(file);
 
  HSSFSheet sheet = workbook.getSheetAt(0);
 
for (int i=0; i <= sheet.getLastRowNum(); i++){
 
        Cell resultCell= sheet.getRow(i).getCell(3);
        System.out.println(sheet.getRow(i).getCell(3));
      //  String keyword = sheet.getRow(i).getCell(2).getStringCellValue();
 
     
 
        if(true){
                System.out.println("Search is successful.");
                resultCell.setCellValue("Hello World");
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