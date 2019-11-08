package OrdersTestcases;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Master.OrdersExecution1;
import PageFactoryandTestdata.OrdersLocators;

public class AddShipmentAddress_With_DifferentCompany extends OrdersExecution1 {

	static List<WebElement> AddressesBefore;
	 static List<WebElement> AddressesAfter;
	 static int AddressAfter;
	 static int AddressBefore;
	
	static OrdersLocators EditOrderDifferentShipmentAddress = PageFactory.initElements(driver, OrdersLocators.class);
	
	public static void TwoPOs_Creation() throws IOException, InterruptedException, ParseException{
        try{
	
	 Click("Click At PO tab", EditOrderDifferentShipmentAddress.Orderdetails_PurchaseOrderTab);
	 Thread.sleep(2000);
	 List<WebElement> rowbreforeCreate = EditOrderDifferentShipmentAddress.GetPOSFromPOTab;
	 int rowbefore=rowbreforeCreate.size();
	 System.out.println(rowbefore);
	 Thread.sleep(2000);
	 
	 Click("Click At Shipping tab", EditOrderDifferentShipmentAddress.Orderdetails_ShippingTab);
	 Thread.sleep(2000);
	 AddressesBefore = EditOrderDifferentShipmentAddress.GetAddressFromShippingTab;
	 AddressBefore=AddressesBefore.size();
	 System.out.println(AddressBefore);

//	 Click("Click At PO tab", EditOrderDifferentShipmentAddress.Orderdetails_PurchaseOrderTab);
	
	 	Click("A", EditOrderDifferentShipmentAddress.OrdersDetails_EditButton);
	 	 waitForPageLoading();
	 	
	    Thread.sleep(2500);
	    
	  //Goto Decoration tab and Change Company
	    EditOrderDifferentShipmentAddress.EditOrder_DecorationTab.click();
	   
	    Thread.sleep(2000);
	    
	 //Select a new Company
	    EditOrderDifferentShipmentAddress.DecoratorCompanySelection.click();
	    waitForPageLoading();
	    Thread.sleep(2000);
	    EditOrderDifferentShipmentAddress.TypeDecorator.sendKeys("Auto");
	    Thread.sleep(3000);
	    EditOrderDifferentShipmentAddress.DecoratorCompanySearch.click();
	    waitForPageLoading();
	    Thread.sleep(3000);
	    
	//Go to shipping tab again and Add a new destination address with selected decorator company
	    
	    EditOrderDifferentShipmentAddress.EditOrder_ShippingTab.click();
	    waitForPageLoading();
	    Thread.sleep(2000);
	    
	 //Click add new Destination button
	    EditOrderDifferentShipmentAddress.EditOrder_ShippingTab_AddShippingDestinationButton.click();
	    waitForPageLoading();
	    Thread.sleep(2000);
	    List<WebElement> li1=EditOrderDifferentShipmentAddress.ShippingTab_NewDestinationAddressCompany_Field;
	    li1.get(1).click();
	 //Now Change the company from current to selected in decorator the new one
	//    EditOrderDifferentShipmentAddress.ShippingTab_NewDestinationAddressCompany_Field.click();
	    waitForPageLoading();
	    Thread.sleep(3000);
	   
	    EditOrderDifferentShipmentAddress.ShippingTab_NewDestinationAddress_Selection.click();
	    waitForPageLoading();
	    Thread.sleep(2500);
	    
	    
	  //Press the save button
	    EditOrderDifferentShipmentAddress.ProductConfiguration_AddCharge_SaveButton.click();
	    waitForPageLoading();
	    
	  
	    List<WebElement> li= driver.findElements(By.xpath("//button[contains(@ng-click,'vm.cancel()')]"));
	    int popuppreviewcount=li.size();
	    if(popuppreviewcount>0) {
    	    EditOrderDifferentShipmentAddress.ClosePreviewPopup.click();

	    }
	  /*  
	  //Now Validating as if the new Destination address with selected company added or not
	    if(EditOrderDifferentShipmentAddress.ShippingDestination_WithNewDecoratorCompany_ShippingAddress_Verification.isDisplayed())
	    {
	    	System.out.println("New Destination Address with different Company Added Successfully");
	    	resultPass("New DestinationAddress_With_DifferentCompany", "New Destination Address with different Company Added Successfully");
	    }
	    else{
	    	
	    	System.out.println("New Destination Address with different Company Added UnSuccessfully");
	    	resultFail("New DestinationAddress_With_DifferentCompany", "New Destination Address with different Company Added UnSuccessfully");
	    }
        */
	    
	    Click("Click At PO tab", EditOrderDifferentShipmentAddress.Orderdetails_PurchaseOrderTab);
	    waitForPageLoading();
		 Thread.sleep(5000);
		 List<WebElement> rowAfterCreate = EditOrderDifferentShipmentAddress.GetPOSFromPOTab;
		 int rowAfter=rowAfterCreate.size();
		 System.out.println(rowAfter);
		 Thread.sleep(2000);
		 
		 Click("Click At Shipping tab", EditOrderDifferentShipmentAddress.Orderdetails_ShippingTab);
		 Thread.sleep(2000);
		 AddressesAfter = EditOrderDifferentShipmentAddress.GetAddressFromShippingTab;
		 AddressAfter=AddressesAfter.size();
		 System.out.println(AddressAfter);
		 
		 if(rowbefore!=rowAfter) {
		    System.out.println("Two POs Are Created Successfully");	
			 
			 resultPass("Two POs Creation", "Two POs Are Created");
		 }
		 else {
			 System.out.println("Two POs Are Created Unsuccessfull");	
			 
			 resultFail("Two POs Creation", "Two POs Are not Created");

		 }
		 
        }catch(Exception e){

            e.getMessage();
        }
	}
	public static void New_DestinationAddress_With_DifferentCompany() throws IOException, InterruptedException{
		try{
		 if(AddressBefore!=AddressAfter) {
			 System.out.println("New Destination Address with different Company Added Successfully");		
			 
			 resultPass("New DestinationAddress_With_DifferentCompany", "New Destination Address with different Company Added Successfully");
		 }
		 else {
			 System.out.println("New Destination Address with different Company Added UnSuccessfully");	
			 
			 resultFail("New DestinationAddress_With_DifferentCompany", "New Destination Address with different Company Added UnSuccessfully");

		 }
		 
        }
     catch (NoSuchElementException e) {
		// TODO: handle exception
    	 System.err.println("NoSuchElementException: " + e.getMessage());
     }
	

	}



}
