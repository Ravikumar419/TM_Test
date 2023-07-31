package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;

//Author: rpendyala19@gmail.com

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "./Features/TC1.feature",
	   glue = "stepDefinitions",
			 plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/report.html"}
//	    dryRun=true
//	    monochrome=true,
//	    plugin= {"pretty", "html.test-output"}
	    
	)
	public class Runner extends AbstractTestNGCucumberTests{
		
	}

	

