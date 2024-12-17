package com.OBP.StepDefinations;


import io.cucumber.java.en.Given;
import com.OBP.PageObjects.paymentsPage;
import Base.BaseTest;
import io.cucumber.java.en.Then;

public class paymentsStep extends BaseTest{
	
	
	
	
	
	paymentsPage page;
	
	//public WebDriver driver;
	@Given("User launch the browser and login Corporate Maker successfully in obdx")
	public void user_launch_the_browser_and_login_corporate_maker_successfully_in_obdx() throws Exception {
		page = new paymentsPage(driver);
		page.login();
	   
	}

	@Then("click on the toogle menu")
	public void click_on_the_toogle_menu() throws Exception {
		page.navigation();
	   
	}

	@Then("click on payments and select payments transfer")
	public void click_on_payments_and_select_payments_transfer() throws Exception {
		page.enterData();
	   
	}

	@Then("click on transfer money")
	public void click_on_transfer_money() throws Exception {
	    
		page.money();
	}

	@Then("click on payee dropdown and enter payee name")
	public void click_on_payee_dropdown_and_enter_payee_name() {
	    
	   
	}

	@Then("enter the amount and payments details")
	public void enter_the_amount_and_payments_details() throws Exception {
		page.discription();
	   
	}

	@Then("click on checkbox of accept terms")
	public void click_on_checkbox_of_accept_terms() throws Exception {
		page.checkbox();
	   
	}

	@Then("click on pay")
	public void click_on_pay() throws Exception {
		page.paybutton();
	   
	}

	@Then("select confirm")
	public void select_confirm() {
	    
	   
	}
	
	
	
	
	
//	@AfterStep
//	public void addScreenshot(Scenario scenario) {
//		
//        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	scenario.attach(screenshot, "image/png",scenario.getName());
//	}
//	

	
//	// @After(order=1)
//	    public void tearDown(Scenario scenario) throws UnknownHostException{
//	    	if(scenario.getStatus().toString().equals("PASSED")) {
//	     	   BaseTest.PASSED_TC_COUNTER = BaseTest.PASSED_TC_COUNTER + 1;
//	    	}
//	    	else if(scenario.getStatus().toString().equals("FAILED")) {
//				String screenshotName = scenario.getName().replaceAll(" ", "_");
//				byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//				scenario.attach(sourcePath, "image/png", screenshotName);
//		    	   BaseTest.FAILED_TC_COUNTER = BaseTest.FAILED_TC_COUNTER + 1;  
//	    	}
//	    else {
//	    	   BaseTest.SKIPPED_TC_COUNTER = BaseTest.SKIPPED_TC_COUNTER + 1;
//	    	}
//	    }
//	    
//	    
//	    @AfterStep
//	    public void AddScreenshot(Scenario scenario) throws IOException
//
//	    {
//
//	    File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//	    byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
//
//	    scenario.attach(fileContent, "image/png", " ");
//
//	    }
//
//	
//	
//	
}
