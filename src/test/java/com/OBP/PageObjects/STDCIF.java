package com.OBP.PageObjects;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;


public class STDCIF extends BaseTest {
	
       WebDriver driver;
       
       public STDCIF(WebDriver driver) throws Exception {
    	   
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
@FindBy(xpath = "//li[@id='New']/a")
List<WebElement> btn_New;
@FindBy(id = "fastpath")
WebElement FastPath;
@FindBy(id = "btnGo")
WebElement btn_Go;
@FindBy(xpath = "//iframe[contains(@id,'ifr_LaunchWin')]")
WebElement inp_FastPath;
@FindBy(xpath = "//iframe[contains(@id,'ifrSubScreen')]")
WebElement in_frame;
@FindBy(xpath = "//input[@id='fastpath']/..//span[@class='ICOgo']")
WebElement Go_button;
@FindBy(xpath = "//button[@id='BTN_OK']")
WebElement ok_new;

@FindBy(xpath = "//button[contains(text(),'Fetch')]")
WebElement fetch_button;

@FindBy(xpath = "//button[@id='BLK_CUSTOMER__BTN_P']")
WebElement customerNo;
@FindBy(xpath = "//button[contains(@onclick,'Category')]")
WebElement cusCategory;
@FindBy(xpath ="//a[text()='ABX']")
WebElement CategoryName;
@FindBy(xpath = "//input[@id='BLK_CUSTOMER__FULLNAME']")
WebElement FullName;
@FindBy(xpath = "//input[@id='BLK_CUSTOMER__SNAME']")
WebElement shortName;
@FindBy(xpath = "//button[contains(@onclick,'Prefix 1')]")
WebElement prefix1;
@FindBy(xpath = "//a[text()='Mr.']")
WebElement typeOfPrefix;
@FindBy(xpath = "//input[@id='BLK_CUSTOMER__ADDRLN1']")
WebElement ADDRLN1;
@FindBy(xpath = "//input[@id='BLK_CUSTOMER__COUNTRY']/..//button[contains(@onclick,'LOV_COUNTRY')]")
WebElement LOV_COUNTRY;
@FindBy(xpath = "//a[text()='AED']")
WebElement country;



@FindBy(xpath = "//input[@id='BLK_CUSTOMER__NLTY']/..//button[contains(@onclick,'Nationality')]")
WebElement Nationality;
@FindBy(xpath = "//a[text()='AED']")
WebElement Nationality_type;
@FindBy(xpath = "//input[@label_value='Male']/..//div[@class='DIVChkRadSel']")
WebElement Gender;
@FindBy(xpath = "//button[contains(@onclick,'Birth Country')]")
WebElement Birth_Country;
@FindBy(xpath = "//a[text()='AED']")
WebElement Birth_Country_type;
@FindBy(xpath = "//input[@id='BLK_CUSTPERSONAL__DOBI']")
WebElement date_of_barth;
@FindBy(xpath = "//input[@id='BLK_CUSTPERSONAL__LANG']")
WebElement Language;
@FindBy(xpath = "//a[text()='ENG']")
WebElement Language_type;
@FindBy(xpath = "//span[text()='Additional']")
WebElement Additional_tab;
@FindBy(xpath = "//button[contains(@onclick,'LOV_LOCATION')]")
WebElement LOCATION;
@FindBy(xpath = "//a[text()='Delhi']")
WebElement LOCATION_type;
@FindBy(xpath = "//button[contains(@onclick,'LOV_MEDIA')]")
WebElement LOV_MEDIA;
@FindBy(xpath = "//a[text()='Mail']")
WebElement LOV_MEDIA_type;
@FindBy(xpath = "//a[text()='MIS']")
WebElement MIS_tab;
@FindBy(xpath = "//iframe[@id='ifrSubScreen']")
WebElement mis_iframe;
@FindBy(xpath = "//input[contains(@id,'CUSTOMERMISRC7')]/..//div[@class='DIVChkRadSel']")
WebElement indus;
@FindBy(xpath = "//input[@id='BLK_CUSTOMERMIS__MISCDRC7']/..//button[contains(@onclick,'LOV_COMP_1')]")
WebElement indus_search_ico;
@FindBy(xpath = "//div[@style='width: 75px;']/..//a[@style='display: inline-block;' and @tabindex='-1']")
WebElement indus_type;
@FindBy(xpath = "//input[@id='BTN_OK' and contains(@onclick,'CVS_CUSTOMER')]")
WebElement mis_ok;
@FindBy(xpath = "//li[@id='Save']")
WebElement save;
@FindBy(xpath = "//iframe[@src='Remarks.jsp?iframeLaunch=true']")
WebElement MT_message_iframe;
@FindBy(xpath = "//input[@id='BTN_OK' and @title='Ok']")
WebElement MT_mess_ok;
@FindBy(xpath = "//iframe[@title='Override Message']")
WebElement Override_mesg_iframe;
@FindBy(xpath = "//input[@id='BTN_ACCEPT']")
WebElement Override_mesg_accept;
@FindBy(xpath = "//iframe[@title='Information Message']")
WebElement Information_msg_iframe;
@FindBy(xpath = "//input[@id='BTN_OK' and@title='Ok']")
WebElement Information_msg_ok;



@FindBy(id = "BTN_EXIT_IMG")
List<WebElement> btn_Exit;
@FindBy(css = "[id*='ifrSubScreen']")
List<WebElement> iframe_auth_accept;
@FindBy(xpath="//input[@name='CUSTNO']")
WebElement custno;

@FindBy(xpath = "//li[@id='Authorize']/a")
List<WebElement> lnk_Authorize;
@FindBy(xpath = "//input[@id='BTN_OK' and @value='Accept']")
List<WebElement> btn_accept;
@FindBy(xpath = "//input[@name='KYCREFNO']")
WebElement inp_kyc;
@FindBy(xpath = "//a[contains(@onclick,'Authorize')]")
WebElement Authorize;
@FindBy(xpath = "//iframe[@id='ifrSubScreen']")
WebElement iframe_ckr;
@FindBy(xpath = "//button[@id='BLK_BRN_PX_OUT_TXN__BTN_AUTH']")
WebElement AuthorizeButton;
@FindBy(xpath = "//iframe[contains(@src,'Flexblue.css&OVDSCRTYP')]")
WebElement AuthorizeOkFrame;
@FindBy(xpath = "//input[@id='BTN_OK' and @title='Ok']")
WebElement AuthorizeOk;
@FindBy(xpath = "//iframe[contains(@id,'ifr_LaunchWin')]")
WebElement iframe;
@FindBy(xpath = "//input[@id='BTN_EXIT_IMG']")
WebElement Exit;



@FindBy(xpath = "//input[@name='LANGUAGE']")
WebElement inp_Lang;
@FindBy(xpath = "//input[@id='BLK_CUSTCORP__LANGUAGE']")
WebElement inp_corpLanguage;
@FindBy(xpath = "//div[@id='nav']//ul//li[@class='user']")
List<WebElement> navTab_DefaultAdmUser;
@FindBy(xpath = "//li[contains(text(),'Sign Off')]")
List<WebElement> btn_SignOff;
@FindBy(xpath = "//iframe[@id='ifr_AlertWin'][contains(@title,'Information Message')]")
List<WebElement> frame_AlertWinInfoMsg;
@FindBy(xpath = "//iframe[@id='ifr_AlertWin'][contains(@title,'Confirmation Message')]")
List<WebElement> frame_AlertWinConfirmation;
@FindBy(xpath = "//li[@id='EnterQuery']/a")
List<WebElement> btn_Enterquery;
@FindBy(xpath = "//li[@id='ExecuteQuery']/a")
List<WebElement> lnk_executequery;
@FindBy(xpath = "//input[@id='BLK_CUSTOMER__CUSTNO']")
WebElement inp_custRefNumber;
@FindBy(xpath="//body[contains(@onload,'chkErr')]//input[@onclick='closeAlerts(event)']")
WebElement btn_AlertWinOk;
@FindBy(xpath="//iframe[starts-with(@id,'ifr_LaunchWin')]")
WebElement frame_Launch;
@FindBy(xpath="//input[@id='BLK_CUSTOMER__CUSTNO']")
WebElement inp_AccRefNumber;




public void remote() throws MalformedURLException {
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);	
	 driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);
}


public void openUrl() throws InterruptedException {
	//WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://10.20.9.23:9004/FCJNeoWeb/LoginServlet?entity=ENTITY_ID1");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id='details-button']")).click();
	driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
	
}

public void login() throws InterruptedException {
	
	WebElement e2 =driver.findElement(By.xpath("//iframe[@id='ifr_AlertWin'][contains(@title,'Information Message')]"));
    driver.switchTo().frame(e2);
    driver.findElement(By.xpath("//body[contains(@onload,'chkErr')]//input[@onclick='closeAlerts(event)']")).click();
    driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@id='LOGINUSERID']")).sendKeys("SUMANTHMAKER");
	driver.findElement(By.xpath("//input[@id='user_pwd']")).sendKeys("Sumanth@01");
	driver.findElement(By.id("fc_sbmit")).click();
	Thread.sleep(2000);
	WebElement e3 =driver.findElement(By.xpath("//iframe[@title='Information Message']"));
    driver.switchTo().frame(e3);
    driver.findElement(By.xpath("//input[@id='BTN_OK' and@title='Ok']")).click();
	
}

public void enterFastPath() throws InterruptedException {
	driver.switchTo().parentFrame();
    driver.findElement(By.id("fastpath")).sendKeys("STDCIF");
    driver.findElement(By.id("btnGo")).click();
    Thread.sleep(3000);
	
}


	

public void customerNo() {
	
	WebElement e4 =driver.findElement(By.xpath("//iframe[starts-with(@id,'ifr_LaunchWin')]"));
    driver.switchTo().frame(e4);
    
    
  //li[@id='New']
    driver.findElement(By.xpath(" //li[@id='New']")).click();
    driver.findElement(By.xpath("//button[@id='BLK_CUSTOMER__BTN_P']")).click();
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__CCATEG']")).sendKeys("INDIVIDUAL");
	
}






public void personaldetails() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__FULLNAME']")).sendKeys("sumanthsai");
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__SNAME']")).sendKeys("sao");
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__ADDRLN1']")).sendKeys("Dubai");
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__COUNTRY']")).sendKeys("AED");
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__NLTY']")).sendKeys("AED");
    driver.findElement(By.xpath("//input[@label_value='Male']/..//div[@class='DIVChkRadSel']")).click();
    driver.findElement(By.xpath("//input[@id='BLK_CUSTPERSONAL__BIRTH_COUNTRY']")).sendKeys("AED");
    driver.findElement(By.xpath("//input[@id='BLK_CUSTPERSONAL__DOBI']")).sendKeys("1999-12-23");
    driver.findElement(By.xpath("//input[@id='BLK_CUSTPERSONAL__LANG']")).sendKeys("ENG");
    
    Thread.sleep(2000);
}




public void Additional_tab() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='Additional']")).click();
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__LOC']")).sendKeys("DL");
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMER__MEDIA']")).sendKeys("MAIL");
    
    Thread.sleep(2000);
	
}



public void MIS() {
	
	driver.findElement(By.xpath("//a[text()='MIS']")).click();
    WebElement e5 =driver.findElement(By.xpath("//iframe[@id='ifrSubScreen']"));
    driver.switchTo().frame(e5);
    driver.findElement(By.xpath("//input[contains(@id,'CUSTOMERMISRC7')]/..//div[@class='DIVChkRadSel']")).click();
    driver.findElement(By.xpath("//input[@id='BLK_CUSTOMERMIS__MISCDRC7']")).sendKeys("INDUSTORY");
    driver.findElement(By.xpath("//input[@id='BTN_OK' and contains(@onclick,'CVS_CUSTOMER')]")).click();
	
}

public void clickOnSaveButton() throws InterruptedException {
	
	
	driver.switchTo().parentFrame();				
	driver.findElement(By.xpath("//li[@id='Save']")).click();
	
	WebElement e7 =driver.findElement(By.xpath("//iframe[contains(@id,'ifrSubScreen')]"));
    driver.switchTo().frame(e7);
    driver.findElement(By.xpath("//input[@id='BTN_OK' and@title='Ok']")).click();
    
    
	driver.switchTo().parentFrame();
    WebElement e8 =driver.findElement(By.xpath("//iframe[@title='Override Message']"));
    driver.switchTo().frame(e8);
    driver.findElement(By.xpath("//input[@id='BTN_ACCEPT']")).click();
    
    driver.switchTo().parentFrame();
    Thread.sleep(2000);
    WebElement e9 =driver.findElement(By.xpath("//iframe[@title='Information Message']"));
    driver.switchTo().frame(e9);
    driver.findElement(By.xpath("//input[@id='BTN_OK' and@title='Ok']")).click();
}


public void Exits() throws InterruptedException {
	
	 driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//*[@id='BTN_EXIT_IMG']")).click();
	
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//div[@id='nav']//ul//li[@class='user']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[contains(text(),'Sign Off')]")).click();
	Thread.sleep(3000);
	 WebElement e6 =driver.findElement(By.xpath("//iframe[@id='ifr_AlertWin'][contains(@title,'Confirmation Message')]"));
	 driver.switchTo().frame(e6);
	 driver.findElement(By.xpath("//body[contains(@onload,'chkErr')]//input[@onclick='closeAlerts(event)']")).click();
}



}
