package stepDefinitions;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;


public class testBase {
	
	protected WebDriver driver;
	Logger logger;
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
	
	public void launch_Browser(String url) throws IOException
	{
//		System.setProperty(
//			"webdriver.chrome.driver",
//			"C:\\Users\\gunna\\Downloads\\CIMB-20230727T114117Z-001\\CIMB\\CIMB_WEB_AUTOMATION\\Driver\\chromedriver.exe");
		System.setProperty(
				"webdriver.chrome.driver",
				"./Driver\\chromedriver.exe");
		
		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get(url);
		TakeScreenshot("TC1", "Home");
	}


	
//	@AfterClass
//	public void Quit(){
//		driver.quit();
//		
//	}
	
}

