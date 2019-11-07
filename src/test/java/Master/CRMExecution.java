package Master;

import static CrmTestCases.StartBrowser.StartupBrowser;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import CrmTestCases.CompanyScenarios;
import CrmTestCases.ContactScenarios;
import CrmTestCases.Email;
import CrmTestCases.ExportScenarios;
import CrmTestCases.Filters;
import CrmTestCases.Login;
import CrmTestCases.Notes;
import CrmTestCases.RecordOwnerAndVisi;
import CrmTestCases.SettingsScenarios;
import CrmTestCases.Systemroperties;
import CrmTestCases.Tasks;
import PageFactoryandTestdata.CrmLocatiors;
import PageFactoryandTestdata.HelpingFunction;


public class CRMExecution extends HelpingFunction{

	static String Suite="CRMReport.html";

		
	@BeforeSuite
			public static void SystmProperties() throws InterruptedException, AWTException, IOException{

		Systemroperties.Property(Suite);
		
		}

	@BeforeTest
			public void Startup() throws InterruptedException, AWTException, IOException{

					StartupBrowser(Suite);
			} 
	

	@Test(priority=0)
	 		public   void LoginIdaho() throws InterruptedException, AWTException, IOException{
				 	Login.login();
				 	
			 	}


	 	@Test  (priority=1)
	  		  public static void VerifyOrdersDomain() throws InterruptedException, AWTException, IOException{
					 	Login.VerifyExistingDomain();
					 	
				 	}
	
	 	

	
	 	@Test  (priority=2)
 		public static void ValidatingCompanyRequiredField() throws InterruptedException, AWTException, IOException{
	    	  CompanyScenarios.ValidatingRequiredField();
			 	
		 	}
	 	
	 	@Test  (priority=3)
  		  public static void VerifyStateDDwrtCountry() throws InterruptedException, AWTException, IOException{
		 	  CompanyScenarios.VerifyStateDD();
		 	
	 	}
	    
	 
	 	@Test  (priority=4)
		 	  public static void CreateCustomerCompany() throws InterruptedException, AWTException, IOException{
				 	  CompanyScenarios.CreateCompany("Customer");	  
			 	}
	 	
	 	@Test  (priority=4, dependsOnMethods="CreateCustomerCompany")
	 	  public static void CreateContactUnderCompany() throws InterruptedException, AWTException, IOException{
	 		 CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);
	 	//	 Click("Please click at Create Contact Link",GetData.CompDetails);
	 		GetData.CompDetails.click();
	 		ContactScenarios.CreateContact(true);  
	 	
		 	}
	      
		@Test  (priority=5)
	 	  public static void VerifyPrimaryEmailInOrder() throws InterruptedException, AWTException, IOException{
	 		 CrmLocatiors GetData=PageFactory.initElements(driver, CrmLocatiors.class);
	 		 Thread.sleep(5000);
			 GetData.RshipVericationbetContandComp.click();
			 Thread.sleep(5000);
			 GetData.CompanyOrder.click();
			 Thread.sleep(5000);
			 GetData.CreateCompanyOrder.click();
			 Thread.sleep(5000);
			 GetData.CloseOrder_Icon.click();
		 	}
	      
		@Test  (priority=6, dependsOnMethods="VerifyPrimaryEmailInOrder")
	 	  public static void DeleteCustomerCompany() throws InterruptedException, AWTException, IOException{
			
			  CompanyScenarios.DeleteCompany1();	
			  Thread.sleep(5000);
		 	}
		      
		
		      
	 	@Test  (priority=6, dependsOnMethods="DeleteCustomerCompany")
				 	  public static void CreateSupplierCompany() throws InterruptedException, AWTException, IOException{
		    	      CompanyScenarios.CreateCompany("Supplier");	  
					 	}
	 	@Test  (priority=7)
		 	  public static void DeleteSupplierCompany() throws InterruptedException, AWTException, IOException{
				 	  CompanyScenarios.DeleteCompany();	  
			 	}
		
	 	@Test  (priority=8)
				 	  public static void CreateDecoratorCompany() throws InterruptedException, AWTException, IOException{
						 	  CompanyScenarios.CreateCompany("Decorator");	  
					 	}
	 	@Test  (priority=9)
		 	  public static void DeleteDecoraorCompany() throws InterruptedException, AWTException, IOException{
				 	  CompanyScenarios.DeleteCompany();	  
			 	}
		
	 	@Test  (priority=10)
				 	  public static void CreateProspectCompany() throws InterruptedException, AWTException, IOException{
						 	  CompanyScenarios.CreateCompany("Prospect");	  
					 	}
	 	      
	 	@Test  (priority=11)
		 	  public static void DeleteProspectCompany() throws InterruptedException, AWTException, IOException{
				 	  CompanyScenarios.DeleteCompany();	  
			 	}
		
		      
	 	@Test  (priority=12)
		 	  public static void CreateCompany() throws InterruptedException, AWTException, IOException{
				 	  CompanyScenarios.CreateComp("Supplier"); 
			 	}
		
		      
    
	 	@Test  (priority=13)
		 	  public static void VerifyBillingInfoInOrder() throws InterruptedException, AWTException, IOException{
				 	  CompanyScenarios.VerifyBillingInfoInOrder();
				 	  
				 	
			 	}
	 	
	 	@Test  (priority=14)
			 public static void VerifyRecordOwn() throws InterruptedException, AWTException, IOException{
				 RecordOwnerAndVisi.VerifyRecordOwn();
				
			 	}
			 	
	 	@Test  (priority=15)
			 public static void VerifyCompanyDefaultVisibility() throws InterruptedException, AWTException, IOException{
			 RecordOwnerAndVisi.VerifyVisibility();
				
			 	}
		 		
	 	@Test  (priority=16)
			 public static void CompanyUpdatedVisibility() throws InterruptedException, AWTException, IOException{
				 RecordOwnerAndVisi.UpdatedVisibility();
				
			 	}

	 	@Test  (priority=17)
			 public static void VerifyCompanyDetails() throws InterruptedException, AWTException, IOException{
				 CompanyScenarios.VerifyCompDetail();
				 	
			 	}
			 
	 	@Test  (priority=18)
			 public static void AddCompanyAddress() throws InterruptedException, AWTException, IOException{
				 CompanyScenarios.AddAddress();
				 	
			 	}
			 	
	 	@Test  (priority=19)
			 public static void AddCompanyNote() throws InterruptedException, AWTException, IOException{
				 Notes.AddNote();				 
			 	}

	 	@Test  (priority=20)
			 public static void EditCompanyNote() throws InterruptedException, AWTException, IOException{
				 Notes.EditNote();				 
			 	}
			 
	 	@Test  (priority=21)
			 public static void DeleteCompanyNote() throws InterruptedException, AWTException, IOException{
				 Notes.DelNote();				 
			 	}
		 	 
	 	@Test  (priority=22)
			 public static void AddTaskUnderCompany() throws InterruptedException, AWTException, IOException{
				 Tasks.AddTask();
			 }	 
		
	 	@Test  (priority=23)
			 public static void CompanyTaskDisplayingInAppointmentinAllViews() throws InterruptedException, AWTException, IOException{
				 Tasks.VerifyTaskInAppointment();
			 }	
			 
	 	@Test  (priority=24)
			 public static void EditTaskUnderCompany() throws InterruptedException, AWTException, IOException{
				 Tasks.EditTask();
			 }	 
				 
	 	 @Test  (priority=25, dependsOnMethods="EditTaskUnderCompany")
			 public static void CompleteTaskUnderCompany() throws InterruptedException, AWTException, IOException{
				 Tasks.CompleteTask();
			 }	
			 
	 	 @Test  (priority=26, dependsOnMethods="CompleteTaskUnderCompany")
		 public static void VerifyCompletedDataAndCompleteBy() throws InterruptedException, AWTException, IOException{
			 Tasks.CompletedDatAndBY();
		 }	
		 @Test  (priority=26, dependsOnMethods="VerifyCompletedDataAndCompleteBy")
			 public static void DeleteTaskUnderCompany() throws InterruptedException, AWTException, IOException{
				 Tasks.DeleteTask();
			 }	
		 
		
			 			 
	 	@Test  (priority=27)
			 public static void AddContactUnderCompany() throws InterruptedException, AWTException, IOException{
				 ContactScenarios.CreateContact(true);
			 	}
		 
	 	@Test  (priority=28)
			 public static void ContactRecordOwner() throws InterruptedException, AWTException, IOException{
				
				 RecordOwnerAndVisi.VerifyRecordOwn();
			 	}
	 	@Test  (priority=29)
			 
			 public static void CompanyContactRShipVerificaton() throws InterruptedException, AWTException, IOException{
			 CompanyScenarios.RShipVerifBwContAndComp();
		 	}
	 
	 	@Test  (priority=30)
			 public static void ContactDefaultVisibility() throws InterruptedException, AWTException, IOException{
			 	RecordOwnerAndVisi.VerifyVisibility();
				
			 	}
			
	 	@Test  (priority=31)
			 public static void ContactUpdatedVisibility() throws InterruptedException, AWTException, IOException{
				 RecordOwnerAndVisi.UpdatedVisibility();
				
			 	}
			 
	 	@Test  (priority=32)
			 
			 public static void AddContactAddress() throws InterruptedException, AWTException, IOException{
				 CompanyScenarios.AddAddress();
			 	}
			
	 	@Test  (priority=33)
			 public static void AddContactNotes() throws InterruptedException, AWTException, IOException{
				 Notes.AddNote();
				 	
			 	}

	 	@Test  (priority=34)
			 public static void EditNoteContent() throws InterruptedException, AWTException, IOException{
				 Notes.EditNote();				 
			 	}
			 
	 	@Test  (priority=35)
			 public static void DeleteContactNote() throws InterruptedException, AWTException, IOException{
				 Notes.DelNote();				 
			 	}
			 			
	 	@Test  (priority=36)
			 public static void AddTaskUnderContact() throws InterruptedException, AWTException, IOException{
				 Tasks.AddTask();
				 	
			 	}
			 
	 	@Test  (priority=37)
			 public static void ContactTaskDisplayingInAppointmentinAllViews() throws InterruptedException, AWTException, IOException{
				 Tasks.VerifyTaskInAppointment();
			 }	
			 
	 	@Test  (priority=38)
			 public static void EditTaskUnderContact() throws InterruptedException, AWTException, IOException{
				 Tasks.EditTask();
			 }	 
			 
	 	 @Test  (priority=39, dependsOnMethods="EditTaskUnderContact")

			 
			 public static void CompleteTaskUnderContact() throws InterruptedException, AWTException, IOException{
				 Tasks.CompleteTask();
			 }	
		
		 @Test  (priority=40, dependsOnMethods="CompleteTaskUnderContact")

			 public static void DeleteTaskUnderContact() throws InterruptedException, AWTException, IOException{
				 Tasks.DeleteTask();
			 }	
			 
	 	@Test  (priority=41)
			 public static void SearchCreatedCompany() throws InterruptedException, AWTException, IOException{
				 
				 Filters.Search(true);
			 }
			
	 	@Test  (priority=42)
			 public static void SearchCreatedContact() throws InterruptedException, AWTException, IOException{
				 
				 Filters.Search(false);
			 }
			 		
	 	@Test  (priority=43)
			 public static void ExemptTaxFromCompany() throws InterruptedException, AWTException, IOException{
				 SettingsScenarios.AddAddress();
				 CompanyScenarios.ExemptTax();
			 }
			 
	 	@Test  (priority=44)
			 public static void CreateOrderAndVerifyTaxNotCalculating() throws InterruptedException, AWTException, IOException{
				 CompanyScenarios.CreateOrder();
			 }
		
		 @Test  (priority=45, dependsOnMethods = { "CreateOrderAndVerifyTaxNotCalculating" })
			 public static void DeleteCompanywithOrder() throws InterruptedException, AWTException, IOException{
				 CompanyScenarios.DelOrderCompany();
			 }
			
	 	@Test  (priority=46)
			 public static void InactiveCompAndVerifyNotShowingIn_ActiveFilter() throws InterruptedException, AWTException, IOException{
				 
				 CompanyScenarios.InactiveCompany(true);
			 }
			
	 	@Test  (priority=47)
			 public static void InactiveContAndVerifyNotShowingIn_ActiveFilter() throws InterruptedException, AWTException, IOException{
				 
				 CompanyScenarios.InactiveCompany(false);
			 }
 	
	 	@Test  (priority=48)
			 public static void CreateContactFromMain() throws InterruptedException, AWTException, IOException{
				 
 				ContactScenarios.CreateContact(false);
			 	}
							
	 	@Test  (priority=49)
			 public static void CreateNoteFromMain() throws InterruptedException, AWTException, IOException{
				 
				 Notes.AddNoteFromMain();
			 	}

	 	@Test  (priority=50, description="Validating that user is able Create Task From Main, Assigning it to team and creating a Notes")
			 public static void CreateTaskFromMainByAddingNotesAndAssigningIttoTeam() throws InterruptedException, AWTException, IOException{
				 
				 Tasks.AddTaskFromMain();
			 	}
	 	
	 	
	 	
		@Test  (priority=50)
		 public static void ViewTaskBasesOnCategory() throws InterruptedException, AWTException, IOException{
			 
			 Tasks.ViewTaskBasesOnCategory();
		 	}
			 		 
		@Test  (priority=51)
			 public static void VerifyCompanyFilter() throws InterruptedException, AWTException, IOException{
				 
				 Filters.VerifyFilters(true);
			 	}
		@Test  (priority=52)
			 public static void VerifyContactFilter( ) throws InterruptedException, AWTException, IOException{
				 
				 Filters.VerifyFilters(false);
			 	}

		@Test  (priority=53)
			 public static void CreateAndDeleteComp() throws InterruptedException, AWTException, IOException{
				 
				 CompanyScenarios.CreateCompanyFromMain();
			 }
			
		@Test  (priority=54)
			 public static void AddContactInCompany() throws InterruptedException, AWTException, IOException{
				 
				 CompanyScenarios.AddContactToCompany();
			 }
			 
		@Test  (priority=55)
			 public static void ChangeCompaniesRecordOwnerFromDashBoard() throws InterruptedException, AWTException, IOException{
				 
				 RecordOwnerAndVisi.UpdateRecordOwn();
			 }
		
		@Test  (priority=56)
			 public static void ChangeCompaniesVisibilityFromDashBoard() throws InterruptedException, AWTException, IOException{
				 
				 RecordOwnerAndVisi.UpdateVisibility();
			 }
		
		@Test  (priority=57)
			 public static void InactiveCompanyFromDashBoard() throws InterruptedException, AWTException, IOException{
				 
				 CompanyScenarios.InactiveCompFromDBoard();
			 }
		
		@Test  (priority=58)
			 public static void DeleteInactiveCompany() throws InterruptedException, AWTException, IOException{
				 
				 CompanyScenarios.DeleteComp();
			 }
			  
		@Test  (priority=59)
			 public static void AddAddressUnderSettings() throws InterruptedException, AWTException, IOException{
				 
				 SettingsScenarios.AddAddress();
			 	}
			 
		@Test  (priority=60)
			 public static void DeleteAddressUnderSettings() throws InterruptedException, AWTException, IOException{
				 
				 SettingsScenarios.DeleteAddress();
			 	}

		@Test  (priority=61)
			 public static void CreateRelationship() throws InterruptedException, AWTException, IOException{
				 
				 SettingsScenarios.CreateRelationship();
			 	}
		  
		@Test  (priority=62)
			 public static void DeleteRelationship() throws InterruptedException, AWTException, IOException{
				 
				 SettingsScenarios.DeleteRelationship();
			 	}
		
		@Test  (priority=63)
			 public static void CreateTeam() throws InterruptedException, AWTException, IOException{
				 
				 SettingsScenarios.AddTeam();
			 	}
 		
		@Test  (priority=64)
			 public static void DeleteTeam() throws InterruptedException, AWTException, IOException{
				 
				 SettingsScenarios.DeleteTeam();

			 }
			 
		@Test  (priority=65)
			 public static void CreateRelationshipBtCompAndContact() throws InterruptedException, AWTException, IOException{
				 
				 SettingsScenarios.CreateRelationshipBetweenCompCont();
			 	}
			 
	 
		@Test  (priority=66)
			 public static void ExportCompanyCSV() throws InterruptedException, AWTException, IOException{
			 ExportScenarios.ExortCSV();
			 	  
			}
		
		@Test  (priority=67)
		 	public static void ExportCompanyQB() throws InterruptedException, AWTException, IOException{
			ExportScenarios.ExportCompanyQB();
			 	  
		 	}
		
		@Test  (priority=68)
		 	public static void ExportContactCSV() throws InterruptedException, AWTException, IOException{
			ExportScenarios.ExportContactCSV();
			 	  
		 	}

		@Test  (priority=69)
		 	public static void ExportoVcard() throws InterruptedException, AWTException, IOException{
			ExportScenarios.ExportoVcard();
			 	  
		 	}
	
		@Test  (priority=70)
		 	public static void AddTaskatAppointmentPage() throws InterruptedException, AWTException, IOException{
			Tasks.TaskFromAppointment();
			 	  
		 	}
	
		@Test  (priority=71)
		 	public static void MoveEmailToSpam() throws InterruptedException, AWTException, IOException{
				Email.MoveEmailToSpam();
			 	  
		 	}

		 @Test  (priority=72)
		 	public static void DeleteEmailFromAllEmail() throws InterruptedException, AWTException, IOException{
				Email.DeleteEmailFromAllEmail();
			 	  
		 	}
		 
		 @Test  (priority=73)
		 	public static void MoveEmailToSpamFromDetailPage() throws InterruptedException, AWTException, IOException{
				Email.MoveEmailToSpamFromDetailPage();
			 	  
		 	}
		
		 @Test  (priority=74)
		 	public static void DeleteEmailFromEmailDetailPage() throws InterruptedException, AWTException, IOException{
				Email.DeleteEmailFromEmailDetailPage();
			 	  
		 	}
	
		 @Test  (priority=75)
		 	public static void MoveEmailToNotSpam() throws InterruptedException, AWTException, IOException{
				Email.MoveEmailToNotSpam();
			 	  
		 	}
		 @Test  (priority=76)
		 	public static void DeleteEmailFromSpam() throws InterruptedException, AWTException, IOException{
			 Email.DeleteEmailFromAllEmail();
			 	  
		 	}
		 	
		 
		 @Test  (priority=77)
		 	public static void CreateDefaultTask() throws InterruptedException, AWTException, IOException{
				Tasks.CreateDefaultTask();
			 	  
		 	}
		 
		 @Test  (priority=78)
		 	public static void VerifyDefaultTask() throws InterruptedException, AWTException, IOException{
				Tasks.VerifyDefaultTask();
			 	  
		 	}

		 @Test  (priority=79)
		 	public static void DeleteDefaultTask() throws InterruptedException, AWTException, IOException{
				Tasks.DeleteDefaultTask();
			 	  
		 	}
	 
	 	 @Test  (priority=80)
		 	public static void CreateContactWhileCreatingOrder() throws InterruptedException, AWTException, IOException{
				Tasks.CreateContactWhileCreatingOrder();
			 	  
		 	}
	 	
	 	@Test  (priority=81)
	 	public static void CustomizeOrderNo() throws InterruptedException, AWTException, IOException{
	 		SettingsScenarios.CustomizeOrderNo();
	 		
		 	  
	 	}

	 	 
	 	 @Test  (priority=82)
		 	public static void VerifyCompanyContactIconAndAddress() throws InterruptedException, AWTException, IOException{
				Tasks.VerifyCompanyContactIconAndAddress();
			 	  
		 	}
	 	
	 	
		 @AfterMethod

			public void getResult(ITestResult result ) throws IOException, InterruptedException{
			/*
				 System.out.println("Get Status "+ result.getStatus());
				 System.out.println("Get Method with className "+ result.getMethod());
				 System.out.println("Get TC Name "+ result.getName());
				 System.out.println("Get test calsss Name "+ result.getTestClass());
				 System.out.println("Get Test Name"+ result.getTestName());
				 System.out.println("Get Method Name"+ result.isSuccess());
			*/
		//		 test = extent.createTest(result.getName());
			
				if(result.getStatus()==ITestResult.SUCCESS){
	 				test.log(Status.PASS, result.getMethod().getDescription());
	 				test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
	 				test.log(Status.PASS, " Please see attached screenshot");
	 				String screenshotPath = HelpingFunction.capture(result.getName());
	 				test.addScreenCaptureFromPath(screenshotPath);
			 
		 			extent.flush();
	 				}

	 			
	 			if(result.getStatus()==ITestResult.FAILURE){

				 	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
			/*
			 * String screenshotPath = HelpingFunction.capture(result.getName());
			 * test.addScreenCaptureFromPath(screenshotPath);
			 */
			 		test.fail(result.getThrowable());
			 		extent.flush();
			 		}
					 			
	 			
	 			if(result.getStatus()==ITestResult.SKIP){
	 				System.out.print("Test cases is skipped");
					 test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
					 test.skip(result.getThrowable());
				    }				 		
	 			
			 }
			 
			@AfterTest
			public void endReport(){
		 		extent.flush();

			//driver.get(System.getProperty("user.dir")+"/Reports/"+Suite);
			}
			
		
		

}

