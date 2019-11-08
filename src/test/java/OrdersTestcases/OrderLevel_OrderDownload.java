package OrdersTestcases;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.PageFactory;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;


public class OrderLevel_OrderDownload extends OrdersExecution1 {

	static OrdersLocators OrderLevelDownload = PageFactory.initElements(driver, OrdersLocators.class);
	public static void PurchaseOrder_OrderLevel_POPDF_DocDownload() throws IOException, InterruptedException{
        try{
		
	 Thread.sleep(2000);
	 
	 OrderLevelDownload.OrderLevel_Order_Download.click();
	
	Thread.sleep(15000);
	
	 //Validate as if the PurchaseOrder PDf Downloading working or not
	 //Press the Purchase Order document
	OrderLevelDownload.PreviewPopUp_PurchaseOrder.click();
	 
	 Thread.sleep(3000);
	 
	//Select the Purchase Order Option
	 OrderLevelDownload.PreviewPopup_PurchaseOrderSelection.click();
	 
	 Thread.sleep(3000);
	 
	 //Press the downloadButton naow
	 OrderLevelDownload.Orderlevel_DownloadPopup_DownloadButton.click();
	 
	 Thread.sleep(15000);
	   
	   File PODownloadPDF = getLatestFilefromDir(downloadPath);
		String DownloadPOPDF = PODownloadPDF.getName();
		 
		 if(DownloadPOPDF.contains("Purchase Order #")){
			 System.out.println("Purchase Order Orderlevel popup download POPDF file downloaded Successfully");
			 resultPass("PurchaseOrder_OrderLevel_POPDF_DocDownload", "Purchase Order Orderlevel popup download POPDF file downloaded Successfully");
			 
		 }
		 else{
			 System.out.println("Purchase Order Orderlevel popup download POPDF file downloaded unsucessfully");
			 resultFail("PurchaseOrder_OrderLevel_POPDF_DocDownload", "Purchase Order Orderlevel popup download POPDF file downloaded unsucessfully"); 
			
		 } 
		 
        }catch(NoSuchElementException e)
        {
        	e.getMessage();
        }
	}
	   public static void SalesOrder_PreviewDownloadPopup_PDF_DocDownload() throws InterruptedException, IOException{
		   try{
		 
		 OrderLevelDownload.OrderLevel_Order_Download.click();
			
		 Thread.sleep(15000);
		 
		 //Press the Sales Order
		 
		 OrderLevelDownload.PreviewPopUp_SalesOrder.click();
		 
		 Thread.sleep(2000);
		 
		 //Press the downloadButton naow
		 OrderLevelDownload.Orderlevel_DownloadPopup_DownloadButton.click();
		 
		 Thread.sleep(15000);
		 
		 File SalesOrderDownloadPDF = getLatestFilefromDir(downloadPath);
		 String SalesOrderDownload= SalesOrderDownloadPDF.getName();
			 
			 if(SalesOrderDownload.contains("Order #")){
				 System.out.println("Sales Order Preview PDF file downloaded Successfully");
				 resultPass("SalesOrder_PreviewDownloadPopup_PDF_DocDownload", "Sales Order Preview PDF file downloaded Successfully");
				 
			 }
			 else{
				 System.out.println("Sales Order Preview PDF file downloaded unsucessfully");
				 resultFail("SalesOrder_PreviewDownloadPopup_PDF_DocDownload", "Sales Order Preview PDF file downloaded unsucessfully"); 
				
			 } 
		   }catch(NoSuchElementException e){
		     e.getMessage();
		   }
	   } 
	   
	   public static void AckowledgementDownloadPopup_PDF_DocDownload() throws InterruptedException, IOException{
		   try{
			 OrderLevelDownload.OrderLevel_Order_Download.click();
				
			 Thread.sleep(15000);
        //Now Download the Acknowledgement doc
			//Press the Acknowlodgement Order document
			 OrderLevelDownload.PreviewPopUp_Acknowledgement.click();
			 
			 Thread.sleep(2000);
			 
			 //Press the downloadButton naow
			 OrderLevelDownload.Orderlevel_DownloadPopup_DownloadButton.click();
			 
			 Thread.sleep(20000);
			 
			//Now Validating as if the Personalization file is downloaded successfully or not
			  	File AckFile = getLatestFilefromDir(downloadPath);
				String AckDownload = AckFile.getName();
				 
				 if(AckDownload.contains("Acknowledgement")){
					 System.out.println("Ackowledgement Preview PDF document downloaded Successfully");
					 resultPass("AckowledgementDownloadPopup_PDF_DocDownload", "Ackowledgement Preview PDF document downloaded Successfully");
					 
				 }
				 else{
					 System.out.println("Ackowledgement Preview PDF document downloaded unsucessfully");
					 resultFail("AckowledgementDownloadPopup_PDF_DocDownload", "Ackowledgement Preview PDF document downloaded unsucessfully"); 
					
				 }
		   }
		   catch(NoSuchElementException e)
		   {
			   e.getMessage();
		   }
	   } 
			
	
		

	public static File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }

	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}


}
