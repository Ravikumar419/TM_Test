package testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(
    features = "./Features/TestCases.feature",
    glue = "stepDefinitions",
    plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumber.html"}
    
)
public class testngRunner extends AbstractTestNGCucumberTests {
   
}

