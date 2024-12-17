package com.OBP.StepDefinations;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OBP.PageObjects.STDCIF;

import Base.BaseTest;
import Utitlities.ReadConfig;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.Scenario;








public class STDCIFstep extends BaseTest {

	
// public WebDriver driver;
 public	STDCIF page;
 
 
 
//   @Before
//	public void setup() throws MalformedURLException {
//	  
//	  driver = new ChromeDriver();
//	   driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
//		
//		
//		
//	  
//}
// 
 
 
 
 
	@Given("launch the application and Validation the_STDCIF")
	public void launch_the_application_and_validation_the_stdcif() throws Exception {
		
	   page = new STDCIF(driver);
	   page.remote();
	   page.openUrl();
	   
	}

	@Then("click on new button and click the populate button_STDCIF")
	public void click_on_new_button_and_click_the_populate_button_stdcif() throws InterruptedException {
		page.login();
	   
	}

	@Then("enter full name and short name_STDCIF")
	public void enter_full_name_and_short_name_stdcif() throws InterruptedException {
	    page.enterFastPath();
	    page.customerNo();
	}

	@Then("click on  customer category_STDCIF")
	public void click_on_customer_category_stdcif() throws InterruptedException {
	    page.personaldetails();
	   
	}

	@Then("enter address1 and country and nationality_STDCIF")
	public void enter_address1_and_country_and_nationality_stdcif() throws InterruptedException {
		page.Additional_tab();
	   
	}

	@Then("enter the gender and birth country and DateOfBirth and Language _STDCIF")
	public void enter_the_gender_and_birth_country_and_date_of_birth_and_language__stdcif() {
		 page.MIS();
	   
	}

	@Then("click on additional tab and enter the Loaction and media and misSTDCIF")
	public void click_on_additional_tab_and_enter_the_loaction_and_media_and_mis_stdcif() throws InterruptedException {
	    page.clickOnSaveButton();
	   
	}

	@Then("save the record_STDCIF")
	public void save_the_record_stdcif() throws InterruptedException {
	    
	   page.Exits();
	}

	@Then("user logout from  maker_CustomerMaintenance")
	public void user_logout_from_maker_customer_maintenance() {
	    
	   
	}
	
	
//	@After
//	public void teardown(Scenario sc)
//	{
//		System.out.println("Tear Down method executed..");
//		if(sc.isFailed()==true)
//		{
//			//Convert web driver object to TakeScreenshot
//
//			String fileWithPath = "D:\\automation\\New folder\\parallerTesting\\Screenshot\\failedScreenshot.png";
//			
//			TakesScreenshot scrShot =((TakesScreenshot)driver);
//
//			//Call getScreenshotAs method to create image file
//			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//			//Move image file to new destination
//			File DestFile=new File(fileWithPath);
//
//			//Copy file at destination
//
//			try {
//				FileUtils.copyFile(SrcFile, DestFile);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//		driver.quit();
//	}
//
	 

//	@AfterStep
//	public void addScreenshot(Scenario scenario) {
//		
//        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		scenario.attach(screenshot, "image/png",scenario.getName());
//	}
	
	

	
}
