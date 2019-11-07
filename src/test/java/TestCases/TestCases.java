
package TestCases;


import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import LocatorsAndData.Locators;
import LocatorsAndData.TestData;
import LocatorsAndData.HelpingFunction;


public class TestCases extends HelpingFunction  {
	public static Locators GetData=PageFactory.initElements(driver, Locators.class);
	 public static String Projectpath;
	 public static String rating;
	public static String Date1;
	public static String Name1;
	public static String Location1;
	public static String Content1;
	public static String CompanyName;
	public static String PhoneNo;
	public static String Street;
				public static  void login() throws InterruptedException, AWTException, IOException{
						
						
				//		 test =extent.createTest(new Exception().getStackTrace()[1].getMethodName());
						 SoftAssert assertion =new SoftAssert();
						 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
						 
						 driver.get("https://www.yelp.com/");

						  FileInputStream file = new FileInputStream(new File("C:/Users/Muhammad.Iftikhar/Desktop/abc.xls")); 
						  HSSFWorkbook workbook = new HSSFWorkbook(file);
						  DataFormatter objDefaultFormat = new DataFormatter();
						  FormulaEvaluator objFormulaEvaluator = new HSSFFormulaEvaluator((HSSFWorkbook) workbook);
						  HSSFSheet sheet = workbook.getSheetAt(0);
						  

						//for (int i=0; i <= sheet.getLastRowNum(); i++){
							for (int i=0; i < 1; i++){

						 
						        Cell resultCell= sheet.getRow(0).getCell(0);
						        objFormulaEvaluator.evaluate(resultCell); // This will evaluate the cell, And any type of cell will return string value
						        String cellValueStr = objDefaultFormat.formatCellValue(resultCell,objFormulaEvaluator);
						        
						        Cell resultCell1= sheet.getRow(0).getCell(i+1);
						        objFormulaEvaluator.evaluate(resultCell1); // This will evaluate the cell, And any type of cell will return string value
						        String cellValueStr1 = objDefaultFormat.formatCellValue(resultCell1,objFormulaEvaluator);
						        
								Input("Please Enter ASI no", GetData.SearchTerm, cellValueStr);
								Input("Please Enter ASI no", GetData.SearchTerm1, cellValueStr1);

								  workbook.close();
								  file.close();
								  
								Thread.sleep(3000);
								driver.findElement(By.xpath("//span[contains(@class, 'main-search_action-icon-wrap js-search-icon-wrap')]")).click();
								Thread.sleep(15000);
								
								List<WebElement> records = GetData.GetNoOfRecords;

								
									Thread.sleep(15000);

								for(int a=0; a<1; a++) {
									GetData.GetNoOfRecords.get(a).click();
								}
								
								
							List<WebElement> date = GetData.Date;
							Thread.sleep(5000);

						for(int a=0; a<2; a++) {
							String date1=GetData.Date.get(a).getText();
							Row row = sheet.createRow(a);
							Cell cell = row.createCell(a); 
				        	cell.setCellValue(date1); 
				        	System.out.println(date1);
							  FileOutputStream outFile =new FileOutputStream(new File("C:/Users/Muhammad.Iftikhar/Desktop/abc.xls"));
				        	
							  workbook.write(outFile);
							  outFile.close();

							  
						}

						}
						 
						
						 			
					
				
					}

				public static  void Yelplogin() throws InterruptedException, AWTException, IOException{
					
					
					//		 test =extent.createTest(new Exception().getStackTrace()[1].getMethodName());
							 SoftAssert assertion =new SoftAssert();
							 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
							 
							 driver.get("https://www.yelp.com/");

							 // FileInputStream file = new FileInputStream(new File("C:/Users/Muhammad.Iftikhar/Desktop/mmm.xls")); 
							 System.out.println(System.getProperty("user.dir"));
							  FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir")+"/Data.xls")); 

							  HSSFWorkbook workbook = new HSSFWorkbook(file);
							  DataFormatter objDefaultFormat = new DataFormatter();
							  FormulaEvaluator objFormulaEvaluator = new HSSFFormulaEvaluator((HSSFWorkbook) workbook);
							  HSSFSheet sheet = workbook.getSheetAt(0);
							  

							//for (int i=0; i <= sheet.getLastRowNum(); i++){
								for (int i=0; i < 1; i++){

							 
							        Cell resultCell= sheet.getRow(0).getCell(0);
							        objFormulaEvaluator.evaluate(resultCell); // This will evaluate the cell, And any type of cell will return string value
							        String cellValueStr = objDefaultFormat.formatCellValue(resultCell,objFormulaEvaluator);
							        
							        Cell resultCell1= sheet.getRow(0).getCell(i+1);
							        objFormulaEvaluator.evaluate(resultCell1); // This will evaluate the cell, And any type of cell will return string value
							        String cellValueStr1 = objDefaultFormat.formatCellValue(resultCell1,objFormulaEvaluator);
							        
									Input("Please Enter ASI no", GetData.SearchTerm, cellValueStr);
									Thread.sleep(5000);
									Input("Please Enter ASI no", GetData.SearchTerm1, cellValueStr1);

									  workbook.close();
									  file.close();
									  
									Thread.sleep(3000);
									driver.findElement(By.xpath("//span[contains(@class, 'main-search_action-icon-wrap js-search-icon-wrap')]")).click();
									Thread.sleep(15000);
									

									List<WebElement> records = GetData.GetNoOfRecords;

									
									Thread.sleep(15000);

								for(int a=0; a<1; a++) {
									GetData.GetNoOfRecords.get(a).click();
								}

							}

							}
							 
							
							 			
						
					

				public static  void Writing() throws InterruptedException, AWTException, IOException{
					
					
					//		 test =extent.createTest(new Exception().getStackTrace()[1].getMethodName());
							 SoftAssert assertion =new SoftAssert();
							 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
							 
	  
							 CompanyName=GetData.CompanyName.getText();
							 PhoneNo=GetData.PhoneNo.getText();
							 Street=GetData.Street.getText();

									List<WebElement> Rating = GetData.Rating;
									for(int a=0; a<1; a++) {
											rating=GetData.Rating.get(a).getAttribute("aria-label");
										}
								
									

									List<WebElement> Date = GetData.Date;
									for(int a=0; a<1; a++) {
											Date1=GetData.Date.get(a).getText();
										}

								
									List<WebElement> NAME = GetData.Name;
									for(int a=0; a<1; a++) {
											Name1=GetData.Name.get(a).getText();
										}

									List<WebElement> Location = GetData.Location;
									for(int a=0; a<1; a++) {
											Location1=GetData.Location.get(a).getText();
										}

								
									List<WebElement> Content = GetData.Content;
									for(int a=0; a<1; a++) {
											Content1=GetData.Content.get(a).getText();
										}
									
									  String excelFilePath = "C:\\Users\\Muhammad.Iftikhar\\Desktop\\Farhat.xlsx";
			                            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			                            Workbook workbook = WorkbookFactory.create(inputStream);

			                            Sheet sheet = workbook.getSheetAt(0);
									/*
							      XSSFWorkbook workbook = new XSSFWorkbook(); 
							      
							        // Create a blank sheet 
							        XSSFSheet sheet = workbook.createSheet("student"); 
							  */
							        // This data needs to be written (Object[]) 
							        Map<String, Object[]> data = new TreeMap<String, Object[]>();
							        data.put("1", new Object[]{ "Company Name", "Phone", "Address", "Rating", "Date", "Name" , "Location", "Content"}); 

					
							        for(int a=2; a<4; a++) {
							            data.put(Integer.toString(a), new Object[]{CompanyName, PhoneNo, Street, rating, Date1, Name1, Location1, Content1 }); 

							        }
							  
							        
							        // Iterate over data and write to sheet 
							        Set<String> keyset = data.keySet(); 
							  //      int rownum = 0;
						        	int rowCount = sheet.getLastRowNum();

							        for (String key : keyset) { 
							            // this creates a new row in the sheet 
							            Row row = sheet.createRow(rowCount++); 
							            Object[] objArr = data.get(key);
							            int cellnum = 0; 
							            for (Object obj : objArr) { 
							                // this line creates a cell in the next column of that row 
							                Cell cell = row.createCell(cellnum++); 
							                if (obj instanceof String) 
							                    cell.setCellValue((String)obj); 
							                else if (obj instanceof Integer) 
							                    cell.setCellValue((Integer)obj); 
							            } 
							        } 
							        try { 
							            // this Writes the workbook gfgcontribute 
							            FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Muhammad.Iftikhar\\Desktop\\Farhat.xlsx")); 
							            
							            workbook.write(out); 
							            out.close(); 
							            System.out.println("gfgcontribute.xlsx written successfully on disk."); 
							        } 
							        catch (Exception e) { 
							            e.printStackTrace(); 
							        } 
							  
								
								
								
						
							}
							
				public static  void loginMedicalApp() throws InterruptedException, AWTException, IOException{
					
					
							 SoftAssert assertion =new SoftAssert();
							 test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
							 driver.get("https://clinicaltrials.gov/");

							 
							 	Thread.sleep(2000);

						
					
						}

				

				public static void UploadImage() throws InterruptedException, AWTException, IOException{

					
					     test =extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					     
					     /*
						 Click("Please click at company name to see detail  of company",GetData.ClickCompanyName);
						 Click("Please click at company name to see detail  of company",GetData.Designs);
						 WebElement element=  GetData.Upload;
						 // Configure the Action
							Actions action = new Actions(driver);
						//Focus to element
							action.moveToElement(element).perform();
							Thread.sleep(3000);
						// To click on the element
							action.moveToElement(element).click().perform();
							Thread.sleep(3000);
							Projectpath=System.getProperty("user.dir");
							System.out.println(Projectpath);
							Thread.sleep(5000);
						//	String filepath = "C:\\Users\\Muhammad.Iftikhar\\Desktop\\ab.JPEG";
						//	Runtime.getRuntime().exec(Projectpath+"/Img/upload.exe", "filepath");
							String filepath = "C:\\Users\\Muhammad.Iftikhar\\Desktop\\ab.JPEG";
							ProcessBuilder pb = new ProcessBuilder(Projectpath+"/Img/upload.exe", filepath);
							Thread.sleep(5000);
							pb.start();
							Thread.sleep(15000);
							
							 WebElement element1=  GetData.Upload;
							 // Configure the Action
								Actions action1 = new Actions(driver);
							//Focus to element
								action1.moveToElement(element1).perform();
								Thread.sleep(3000);
							// To click on the element
								action1.moveToElement(element1).click().perform();
								Thread.sleep(3000);
							
							String filepath1 = Projectpath+"\\Img\\if.JPEG";
							ProcessBuilder pb1 = new ProcessBuilder(Projectpath+"/Img/upload.exe", filepath1);
							Thread.sleep(5000);
							pb1.start();
							Thread.sleep(5000);
						
						*/

					     
					     
					     

					     
				}


				public static void Search() throws InterruptedException, AWTException, IOException{

					
				     test =extent.createTest(new Exception().getStackTrace()[1].getMethodName());
							
				     
				     
				     
					  FileInputStream file = new FileInputStream(new File("C:/Users/Muhammad.Iftikhar/Desktop/abc.xls")); 
					  HSSFWorkbook workbook = new HSSFWorkbook(file);
					  DataFormatter objDefaultFormat = new DataFormatter();

					  FormulaEvaluator objFormulaEvaluator = new HSSFFormulaEvaluator((HSSFWorkbook) workbook);

					  HSSFSheet sheet = workbook.getSheetAt(0);
					  

					//for (int i=0; i <= sheet.getLastRowNum(); i++){
						for (int i=0; i <= 3; i++){

					 
					        Cell resultCell= sheet.getRow(0).getCell(i);
					        objFormulaEvaluator.evaluate(resultCell); // This will evaluate the cell, And any type of cell will return string value
					        String cellValueStr = objDefaultFormat.formatCellValue(resultCell,objFormulaEvaluator);
					        
							Input("Please Enter ASI no", GetData.SearchTerm, cellValueStr);

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

				     
			}


				
				public static void Hover() throws InterruptedException, AWTException, IOException{

					
					  test =extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					  WebElement HoverLinkedTransaction=GetData.EditComp;
					  Hover(HoverLinkedTransaction);
							 
							
							
			}

					
				public static void DragnDrop() throws InterruptedException, AWTException, IOException{
				    {		
				       
						//Element which needs to drag.    		
				    	WebElement From=driver.findElement(By.id("//*[@id='credit2']/a"));	
				         
				         //Element on which need to drop.		
				         WebElement To=driver.findElement(By.cssSelector("//*[@id='bank']/li"));					
				         		
				         //Using Action class for drag and drop.		
				         Actions act=new Actions(driver);					

				         //Dragged and dropped.		
				         act.dragAndDrop(From, To).build().perform();		
					}		
				}}


