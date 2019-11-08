package OrdersWESPTestcases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Master.WESPORDER;
import PageFactoryandTestdata.OrdersLocators;
import PageFactoryandTestdata.OrdersTestdata;
public class OrdersFromWESP_ThroughClipboard extends WESPORDER {

	public static void OrderFromWESP_FromClipboard() throws InterruptedException, IOException{
	   	  
	   	  try{
	   		
	   		  OrdersLocators WespOrder = PageFactory.initElements(driver, OrdersLocators.class);
	   		 driver.navigate().refresh();
	   		//Go to ESP Web Tab
 //   		  WespOrder.ESPWeb_Tab.click();
    		  
    		  Thread.sleep(5000);
    		  
    		  //Search for the Product
    		  WespOrder.ProductSearch_TextField.sendKeys(OrdersTestdata.Clipboard_ProductName);
    		  
    		  Thread.sleep(1000);
    		  
    		  //Press the search button
    		  WespOrder.ProductQuickSearchButton.click();
    		  
    		  Thread.sleep(10000);
    		  
    		  //Search asi number within search terms
    		  WespOrder.SearchWithinTerms_SearchField.sendKeys(OrdersTestdata.Clipboard_ProductNumber);
    		  
    		  Thread.sleep(1000);
    		  
    		  //Press the search with terms go button
    		  WespOrder.SearchWithinTerms_GoButton.click();
    		  
    		  Thread.sleep(12000);  
	   		 
    		  WebElement HoverOrder=WespOrder.Order_SavetoclipboardButton;
    		  Hover(HoverOrder);
    			
    		  Thread.sleep(1000); 

    		  WespOrder.Order_SavetoclipboardButton.click();
    		  
    		  Thread.sleep(10000);
	   		  
	   		  //Click the Clip board ICon
	   		  WespOrder.Clipboard_Icon.click();
	   		  
	   		  Thread.sleep(5000);
	   		  
	   		  //Check the first Product in clipboard list
	   		  WespOrder.ClipboardProduct_CheckboxSelection.click();
	   		  
	   		  Thread.sleep(5000);
	   		  
	   		 
	   		//Press the Order button next screen
	   	  //Click the E-Comm order button now
	   		  Click("Click order button",  WespOrder.ShoppingCart_OrderButton);
	   		  
	   		  Thread.sleep(15000);
	   		  
	   		
	   		 
	   		//First store parent window to switch back
	   		 String parentWindow = driver.getWindowHandle();
	   		 
	   		
	   		 
	   		
	   		 
	   		//Switch to new window opened
	   		  	for(String winHandle : driver.getWindowHandles()){
	   		  	    if(!winHandle.equals(parentWindow)) {
	   		  	        driver.switchTo().window(winHandle);
	   		  	    }
	   		  	}
	   		  	
	   		//Validating as if the Order Created Successfully Or Not From WESP
	   		 if(WespOrder.OrderCreation_FromWESP_Verification.isDisplayed())
	   		 {
	   			 System.out.println("Order created from Clipboard in WESP Successfully ");
	   			 resultPass("OrderFromWESP_FromClipboard_OrderCreation", "Order created from Clipboard in WESP Successfully");
	   		 }
	   		 else{
	   			 System.out.println("Order created from from Clipboard in WESP UnSuccessfully");
	   			 resultFail("OrderFromWESP_FromClipboard_OrderCreation", "Order created from Clipboard in WESP UnSuccessfully");
	   		 }
	   		 
	   		 Thread.sleep(2000);
	   		 
	   		 //Select the company first on create order screen
	   		WespOrder.CreateOrderScreen_CompanySearch_Textfield.click();
	  	 
	  	   Thread.sleep(2000);
	  	 
	  	   WespOrder.CreateOrderScreen_CompanyField_SendData.sendKeys("Auto-");
	   		
	  	   Thread.sleep(6000);
	  	   
	  	 WespOrder.CreateOrderScreen_CompanyField_SendData.sendKeys(Keys.ENTER);
	  	 
	  	 Thread.sleep(10000);
	  	 
	  	 
	  	 //Now select the ship via option to UPS ground
	  	 WespOrder.OrderShipVia.click();
	  	 
	  	 Thread.sleep(2000);
	  	 
	  	 WespOrder.ShipviaSelection.click();
	  	 
	  	 Thread.sleep(2000);
	  	 
	  	 WespOrder.ShipViaLabel.click();
	  	 
	  	 wait = new WebDriverWait(driver, 180);
	     wait.until(ExpectedConditions.elementToBeClickable(WespOrder.DateConfirm));
	     
	     Thread.sleep(2000);
	     
         WespOrder.DateConfirm.click();
	  	 
	  	 Thread.sleep(3000);
	     
	
	  	 
	  	 Click("a", WespOrder.CreateOrders_ConfigureButton);
	   		
	   		Thread.sleep(6000);
	   /*		
	   		//Enter The Quantity on Quatity screen
	   	  List<WebElement> records = WespOrder.Price_Grid;
		  int record=records.size();
		  //Enter The Quantity on Quatity screen
		  if(record>=1) {
		  	
		  	Thread.sleep(2000);
		  	  Click("Click at Select button of price grid", WespOrder.ClickAtSelect);
		  	Thread.sleep(4000);
		  	Click("click continue", WespOrder.CreateOrder_Configure_Continue_Button);
		  	Thread.sleep(2000);
		  	WespOrder.CreateOrder_Configure_QTY_TextField.sendKeys("70");
		  }
		  else {
		  
		  	Thread.sleep(4000);
		  	Click("click continue", WespOrder.CreateOrder_Configure_Continue_Button);
		  	Thread.sleep(2000);
		  	WespOrder.CreateOrder_Configure_QTY_TextField.sendKeys("70");
		  }
	   	
	   		*/
	   		
		  	Click("click continue", WespOrder.CreateOrder_Configure_Continue_Button);
		  	Thread.sleep(2000);
		  	WespOrder.CreateOrder_Configure_QTY_TextField.sendKeys("70");
	   		
	   		Thread.sleep(1000);
	   		
	   		//Press the continue Button
	   		WespOrder.CreateOrder_Configure_Continue_Button.click();
	   		
	   		//Decoration Optional Screen Appear Press the save button now to create a Order
	   		WespOrder.CreateOrder_DecoratorScreen_Save_Button.click();
	   		
	   		if(WespOrder.CreateOrder_ProductAddedToOrder_Successfull.getText().contains("Success"))
	   		{
	   		 System.out.println("Order Created from clipboard Successfully");
	   		 
	   		}
	   		else{
	   		
	   			System.out.println("Order Created from clipboard UnSuccessfully");
	   			
	   		}	
	
	   		Thread.sleep(30000);
	   		
	   		WespOrder.SampleRequestSaveButton.click();
	   		waitForPageLoad();
	   		Thread.sleep(10000);
	   		 //Close new Browser Tab
	   		 driver.close();
	   		 
	   		 Thread.sleep(2000);
	   		 
	   		 //Switch back to parent window 
	   	     driver.switchTo().window(parentWindow);
	   	       
	   	     Thread.sleep(1000);
   	  }
	     
	     catch(NoSuchElementException e)
	   	  {
	   	  e.getStackTrace();
	   	  }
	     }




}
