package OrdersTestcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Master.OrdersExecution1;
//import Master.OrdersExecution2;
import PageFactoryandTestdata.OrdersLocators;
import PageFactoryandTestdata.OrdersTestdata;


public class ReQuote_FromOrderDetail extends OrdersExecution1 {

	public static void login() throws IOException, InterruptedException, AWTException{
		try{
	 //Now Insert the login credentials
    	// This is to Instantiate LogIn Page class  
    	 OrdersLocators Login = PageFactory.initElements(driver, OrdersLocators.class);
    	//Enter ASI No
        Login.ASINo.sendKeys(OrdersTestdata.ASINo);
  
    	//Enter Username 
    	 Login.UserName.sendKeys(OrdersTestdata.Username);
    	 //Enter Password
    	 Login.Password.sendKeys(OrdersTestdata.Password);
    	 
    	 //Wait for few sec
    	 
    	 //Now Press the Login ButtonC:/DocP
    	 
    	// Login.LoginButton.click();
    	 
    	 Click("a", Login.LoginButton);
    	 Thread.sleep(5000);
  
    	 WebDriverWait wait = new WebDriverWait(driver, 15);
     	try{
     		wait.until(ExpectedConditions.alertIsPresent());
     		 Alert alert = driver.switchTo().alert();		
     		 alert.accept();
     	}
     	catch (Exception e) {
     	
         }
     	
    	Thread.sleep(2000);
     	
	      if(driver.getTitle().contains("CRM") )
     {
    	 System.out.println("Loggedin To ESP Orders Successfully");
    	 resultPass("Login", "Loggedin To ESP Orders Successfully");
     }
     else{
    	 System.out.println("Loggedin To ESP Orders UnSuccessfully");
    	 resultFail("Login", "Loggedin To ESP Orders UnSuccessfully");
     }
     
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
	    	 System.err.println("NoSuchElementException: " + e.getMessage());
		}
	}



	





}