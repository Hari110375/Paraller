package Hooks;

import Base.BaseTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.Duration;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class background extends BaseTest {

	@Before
	public void setup() throws MalformedURLException {
//		URL url = new URL("http://localhost:4444");
//		DesiredCapabilities capp = new DesiredCapabilities();
//		capp.setBrowserName("chrome");
//		capp.setPlatform(Platform.WINDOWS);
//		driver = new RemoteWebDriver(url, capp);
		
		
		
		
		
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
 
	
	
	
	
	
	
	
//	@After(order=0)
//	public void quitBrowser(){
//		driver.quit();
//	}
//	@After(order=1)
//	public void tearDown() throws UnknownHostException{
//		if(scenario.getStatus().toString().equals("PASSED")) {
//			BaseTest.PASSED_TC_COUNTER = BaseTest.PASSED_TC_COUNTER + 1;
//		}
//		else if(scenario.getStatus().toString().equals("FAILED")) {
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//			BaseTest.FAILED_TC_COUNTER = BaseTest.FAILED_TC_COUNTER + 1;  
//		}else {
//			BaseTest.SKIPPED_TC_COUNTER = BaseTest.SKIPPED_TC_COUNTER + 1;
//		}
//	}
 
 
	@AfterStep
	public void addScreenshot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png",scenario.getName());
	}
	
	
	
	
	
	
}
