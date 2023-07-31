package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = "./Features/TC1.feature",
    glue = "stepDefinitions",
    plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}
    // Add any additional Cucumber options as needed
)
public class testngRunner extends AbstractTestNGCucumberTests {
    // No additional code needed in this class
}

