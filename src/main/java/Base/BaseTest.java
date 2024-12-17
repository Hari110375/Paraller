package Base;

import java.util.TreeMap;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;

	public class BaseTest {

		
			   public static WebDriver driver;
			   public static ThreadLocal<String> dateTime = new ThreadLocal<String>();
			   public static Integer TOTAL_TC_COUNTER = 0, PASSED_TC_COUNTER = 0, FAILED_TC_COUNTER = 0, SKIPPED_TC_COUNTER = 0;
			   public static TreeMap<String,String>rekeyFields=new TreeMap<String,String>();
			   public static Scenario scenario;
			   public String getDateTime1() {
				return dateTime.get();
			}
		
		
		
	}
	
	
	

