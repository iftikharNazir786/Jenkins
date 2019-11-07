package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import LocatorsAndData.TestData;
import Master.Yelp;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StartBrowser extends Yelp {


				public static void StartupBrowser(String Suite) throws InterruptedException, AWTException, IOException{
	
					try {
						if(browser.equals("chrome")){
					     WebDriverManager.chromedriver().setup();
						ChromeOptions options = new ChromeOptions();
						options.addArguments("-incognito");
					  	options.addArguments("--disable-popup-blocking");
					  	options.addArguments("--disable-extensions");
					  	options.addArguments();
					 	options.addArguments("--start-maximized");
					// 	options.addArguments("--start-fullscreen");

					  	driver = new ChromeDriver(options);
					 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
						
						}
						
						else if(browser.equalsIgnoreCase("ff")){
				/*			System.setProperty("webdriver.firefox.marionette", CrmTestData.Firefoxpath);
			    			DesiredCapabilities dc = new DesiredCapabilities();
			    			dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			    			driver = new FirefoxDriver();*/
							DesiredCapabilities dc = new DesiredCapabilities();
							dc = DesiredCapabilities.firefox();
							dc.setCapability("marionette", true);
						//	driver = new FirefoxDriver(dc);				
							System.setProperty("webdriver.gecko.driver", TestData.Firefoxpath);
			    		//	driver = new FirefoxDriver(dc);
			    			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			    			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			    			//WebDriver driver = new ChromeDriver();
			    	    	
			    	      
						}
						
						else if(browser.equalsIgnoreCase("edge")){
							System.setProperty("webdriver.edge.driver", TestData.EdgePath);
					//		driver = new EdgeDriver();
									}
									
						
					} 
					catch (IndexOutOfBoundsException e) {
					    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
						}
					
					}
			
			}







