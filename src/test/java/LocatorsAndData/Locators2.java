package LocatorsAndData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Master.Yelp;



public class Locators2 extends Yelp{
	

	@FindBy(id="txtAsiNum") public WebElement ASINo;
	@FindBy(id="txtUserName") public WebElement AsiUserName;
	@FindBy(id="txtPassword") public WebElement Password;
	@FindBy(xpath="//input[contains(@onclick,'LoginUser()')]") public WebElement LoginButton;

	@FindBy(xpath="//div[contains(@class, 'item-title white-space-pre word-break ng-binding')]") public WebElement ClickCompanyName;
	@FindBy(xpath="//a[contains(@ui-sref, 'companies.company.view')][text()='Designs']") public WebElement Designs;
	@FindBy(xpath="//ng-content[contains(text(), 'Upload')]") public WebElement Upload;
	@FindBy(xpath="//a[contains(@ng-click, 'vm.deleteArtwork')]") public WebElement Delbutton;
	@FindBy(xpath="//button[contains(@ng-class, 'vm.confirmButtonClass')]") public WebElement ConfirmDelete;
	@FindBy(xpath="//i[contains(@class, 'fa fa-pencil')]") public WebElement EditComp;


}


// Dynamic Xpath
//$($x("//strong[contains(text(),'Less than Minimum Charge')]/parent::td//button[contains(@title,'Add Charge')]")).click();





