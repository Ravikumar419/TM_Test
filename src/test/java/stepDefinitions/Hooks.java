package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends testBase {
    private WebDriver driver;

    @Before
    public void initializeWebDriver() {
    	System.setProperty(
    			"webdriver.chrome.driver",
    			"C:./Driver\\chromedriver.exe");
    		// Instantiate a ChromeDriver class.
    		driver = new ChromeDriver();

    		// Maximize the browser
    		driver.manage().window().maximize();

    		// Launch Website
    		driver.get("https://reqres.in/");
    		String actualTitle = driver.getTitle();
   		 System.out.println(actualTitle);
    		Assert.assertEquals(actualTitle, "Reqres - A hosted REST-API ready to respond to your AJAX requests","App Title mismatched");
//    		TakeScreenshots("TC1", "url");
    }
    
public void threadSleep(int sec) {
		
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void MaximiseBrowser() {
		driver.manage().window().maximize();
	}
	public void TakeScreenshot(String TCName,String fileName) throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String TimeStamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(file,new File("./ScreenShots\\"+TCName+fileName+TimeStamp+".jpg"));
	}

    @After
    public void teardownWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

