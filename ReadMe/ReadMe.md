# QE Tech Assessment Maven Project with Cucumber Framework and TestNG Suite

This is a project demonstrating how to set up a Cucumber framework with TestNG suite for automated testing.

## Setup

1. Clone or download this repository to your local machine.

2. Ensure you have the following prerequisites installed on your system:
   - Java JDK 8 or above
   - Maven

3. Install Maven,Cucumber and testNG software in your IDE (if needed)

## Test Run

## Run the Tests

**To Run Entire Suite(UI Spec)** : Right click on testng.xml file from below path in project structure and run as testNG suite
/testng.xml

**To Run Feature File for specific Scenario** : Right click on TestCases.feature file from below path in project structure and run as cucumber test
/Features/TestCases.feature

**To Run API Tests(API Spec)** : Run below two tests for 002 API Spec and Schema
/src/test/java/API/CreateUser.java
/src/test/java/API/CreateUserByID.java

**To Run DataLoad Tests(003 Data load)** : Run below test for 003 Data load
/src/test/java/dataLoad/DataLoadTransform.java

## Understanding the Results and Report

After the test execution is complete, the Cucumber reports will be generated in the `target/cucumber-reports` directory.

The report includes the following:

- **Cucumber JSON Report**: The JSON report file is located at `target/cucumber-reports/cucumber.json`. This file contains detailed information about each test scenario, including their status (passed, failed, skipped), duration, and other details.

- **Cucumber HTML Report**: The HTML report file is located at `target/cucumber-reports/cucumber.html`. This is a user-friendly report that provides a summary of the test results, including the number of scenarios passed, failed, and skipped, along with their execution times.

- **TestNG emailable-report.html**: TestNG generates its standard XML report in the `test-output/emailable-report.html` directory. This report provides information about the overall test execution, including test suite results, test case results, and overall pass/fail status.

- **ScreenShots**: The ScreenShots folder is located at `/ScreenShots`. This folder contains screen shots of each test scenario.
/ScreenShots

## Customizing the Test Execution

- You can add or modify Cucumber feature files in the `Features/TestCases.feature` directory.

- The Cucumber step definitions are defined in the `src/test/java/stepDefinitions` package. You can add or modify step definitions to match the steps in your feature files.

- You can customize the TestNG suite configuration in the `testng.xml` file to include additional test classes or suites.

## Troubleshooting

- If you encounter any issues with test execution, verify that you have Java and Maven properly installed and configured.


## Dependencies

The project includes the following dependencies:

- Cucumber-Java: For writing Cucumber feature files and step definitions.

- Cucumber-TestNG: Integration of Cucumber with TestNG for test execution.

- TestNG: Test framework for running tests in parallel.

- Maven Surefire Plugin: For running TestNG tests through Maven.


Author : Ravi Kumar Pendyala
Created on : 01/08/2023