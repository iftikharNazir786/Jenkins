package LocatorsAndData;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Master.Yelp;



public class Locators extends Yelp{
	

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
	@FindBy(xpath="//input[contains(@id, 'find_desc')]") public WebElement SearchTerm;
	@FindBy(xpath="//input[contains(@id, 'dropperText_Mast')]") public WebElement SearchTerm1;
	@FindBy(xpath="//p[contains(@class, 'lemon--p__373c0__3Qnnj text__373c0__2pB8f text-color--black-regular__373c0__38bRH text-align--left__373c0__2pnx_ text-size--inherit__373c0__2gFQ3')]/a") public List<WebElement> GetNoOfRecords;

	
	@FindBy(xpath="//div[contains(@class, 'lemon--div__373c0__1mboc i-stars__373c0__3UQrn i-stars--regular-5__373c0__3kPgP border-color--default__373c0__2oFDT overflow--hidden__373c0__8Jq2I')]") public List<WebElement> Rating;
	@FindBy(xpath="//span[contains(@class, 'lemon--span__373c0__3997G text__373c0__2pB8f text-color--mid__373c0__3G312 text-align--left__373c0__2pnx_')]") public List<WebElement> Date;
	@FindBy(xpath="//span[contains(@class, 'lemon--span__373c0__3997G text__373c0__2pB8f fs-block text-color--inherit__373c0__w_15m text-align--left__373c0__2pnx_ text-weight--bold__373c0__3HYJa')]") public List<WebElement> Name;
	@FindBy(xpath="//span[contains(@class, 'lemon--span__373c0__3997G text__373c0__2pB8f text-color--normal__373c0__K_MKN text-align--left__373c0__2pnx_ text-weight--bold__373c0__3HYJa text-size--small__373c0__3SGMi')]") public List<WebElement> Location;
	@FindBy(xpath="//div[contains(@class, 'lemon--div__373c0__1mboc arrange-unit__373c0__1piwO arrange-unit-fill__373c0__17z0h border-color--default__373c0__2oFDT')]/div[2]/p/span") public List<WebElement> Content;

	@FindBy(xpath="//h1[contains(@class, 'lemon--h1__373c0__2ZHSL heading--h1__373c0__1VUMO heading--no-spacing__373c0__1PzQP heading--inline__373c0__1F-Z6')]") public WebElement CompanyName;
	@FindBy(xpath="//p[contains(@class, 'lemon--p__373c0__3Qnnj text__373c0__2pB8f text-color--normal__373c0__K_MKN text-align--left__373c0__2pnx_')]") public WebElement PhoneNo;
	@FindBy(xpath="//a[contains(@class, 'lemon--a__373c0__IEZFH link__373c0__29943 link-color--blue-dark__373c0__1mhJo link-size--default__373c0__1skgq')]/parent::div/address/p/span") public WebElement Street;

	
	
	
	
	
	
	

}


// Dynamic Xpath
//$($x("//strong[contains(text(),'Less than Minimum Charge')]/parent::td//button[contains(@title,'Add Charge')]")).click();





