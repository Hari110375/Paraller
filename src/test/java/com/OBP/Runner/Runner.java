package com.OBP.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features = "src/test/resources/FCUBS/CustomerCreation.feature",
//"src/test/resources/OBP/AccountCustomerMaintance.feature"
@CucumberOptions(features = {"Features/STDCIF.feature"},
glue = {"com/OBP/StepDefinations","Hooks"},
plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@Regression",
dryRun=false,
monochrome=true


)
//html:target/extentreports/cucumberRepoet.html
//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:

public class Runner extends AbstractTestNGCucumberTests{
	

}






