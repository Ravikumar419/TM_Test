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
import org.testng.annotations.Test;
import io.cucumber.java.en.*;
import pageObjects.HomePage;


//Author: rpendyala19@gmail.com
public class Steps extends testBase{
	public WebDriver driver;
	public HomePage HP;
//	@Test
	@Given ("I want to launch application url {string} in Chrome browser")
	public void launch_Chrome_Browser(String url) throws IOException
	{
		System.setProperty(
			"webdriver.chrome.driver",
			"C:./Driver\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Launch Website
		driver.get(url);
		TakeScreenshots("TC1", "url");
		
	}
	
public void TakeScreenshots(String TCName,String fileName) throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String TimeStamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(file,new File("./ScreenShots\\"+TCName+fileName+TimeStamp+".jpg"));
	}
	
	@Then ("I want to verify Request type Get with Endpoint as List Users")
	public void Verify_Get_ListUsrers()
	{	
		threadSleep(2);
		HomePage HP = new HomePage(driver);
		HP.Verify_GetListUsers();
	}
	
	@Then("I want to verify on Request type Get with Endpoint as Single User")
	public void i_want_to_verify_on_request_type_get_with_endpoint_as_single_user() {
		HomePage HP = new HomePage(driver);
	    HP.Verify_GetSingleUser();
	}

	@Then("I want to verify on Request type Get with Endpoint as Single User Not Found")
	public void i_want_to_verify_on_request_type_get_with_endpoint_as_single_user_not_found() {
		HP = new HomePage(driver);
		HP.Verify_SingleUserNotFound();
	}

	@Then("I want to verify on Request type Get with Endpoint as List Resource")
	public void i_want_to_verify_on_request_type_get_with_endpoint_as_list_resource() {
		HP = new HomePage(driver);
		HP.Verify_GetListResource();
	}

	@Then("I want to verify on Request type Get with Endpoint as Single Resource")
	public void i_want_to_verify_on_request_type_get_with_endpoint_as_single_resource() {
		HP = new HomePage(driver);
		HP.Verify_GetSingleUser();
	}

	@Then("I want to verify on Request type Post with Endpoint as Create")
	public void i_want_to_verify_on_request_type_post_with_endpoint_as_create() {
		HP = new HomePage(driver);
		HP.Verify_PostCreate();
	}

	@Then("I want to verify on Request type Put with Endpoint as Update")
	public void i_want_to_verify_on_request_type_put_with_endpoint_as_update() {
		HP = new HomePage(driver);
		HP.Verify_PutUpdate();
	}

	@Then("I want to verify on Request type Patch with Endpoint as Update")
	public void i_want_to_verify_on_request_type_patch_with_endpoint_as_update() {
		HP = new HomePage(driver);
		HP.Verify_PatchUpdate();
	}

	@Then("I want to verify on Request type Delete with Endpoint as Delete")
	public void i_want_to_verify_on_request_type_delete_with_endpoint_as_delete() {
		HP = new HomePage(driver);
		HP.Verify_Delete();
	}

	@Then("I want to verify on Request type Post with Endpoint as Register Successful")
	public void i_want_to_verify_on_request_type_post_with_endpoint_as_register_successful() {
		HP = new HomePage(driver);
		HP.Verify_RegisterSuccessful(); 
	}

	@Then("I want to verify on Request type Post with Endpoint as Register Unsuccessful")
	public void i_want_to_verify_on_request_type_post_with_endpoint_as_register_unsuccessful() {
		HP = new HomePage(driver);
		HP.Verify_RegisterSuccessful();
	}

	@Then("I want to verify on Request type Post with Endpoint as Login Successful")
	public void i_want_to_verify_on_request_type_post_with_endpoint_as_login_successful() {
		HP = new HomePage(driver);
		HP.Verify_LoginSuccessful();
	}

	@Then("I want to verify on Request type Post with Endpoint as Delayed Response")
	public void i_want_to_verify_on_request_type_post_with_endpoint_as_delayed_response() {
		HP = new HomePage(driver);
		HP.Verify_DelayRespnse();
	}

	@Then("I want to Select or Click “GET SINGLE USER NOT FOUND”")
	public void i_want_to_select_or_click_get_single_user_not_found() {
		HP = new HomePage(driver);
		HP.Verify_GetSingleUser();
	}

	@Then("I want to verify on Request as \\/api\\/users\\/{int} and Response as Response {int} \\{}")
	public void i_want_to_verify_on_request_as_api_users_and_response_as_response(Integer int1, Integer int2) {
		HP = new HomePage(driver);
		HP.Verify_Response();
	}

	@Then("I want to verify button to navigate to support page is displayed")
	public void i_want_to_verify_button_to_navigate_to_support_page_is_displayed() {
		HP = new HomePage(driver);
		HP.Verify_btn_SupportReqres();
	}

	@When("I Click on Support ReqRes button to navigate to support page")
	public void i_click_on_support_req_res_button_to_navigate_to_support_page() throws IOException {
		HP = new HomePage(driver);
		HP.Click_btn_SupportReqres();
		TakeScreenshots("TC1", "support");
	}

	@Then("I will be navigated to support ReqRes page")
	public void i_will_be_navigated_to_support_req_res_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I am able to see One Time Payment option")
	public void i_am_able_to_see_one_time_payment_option() {
		HP = new HomePage(driver);
		HP.Verify_lbl_OnetimePayment();
		HP.Verify_lbl_OnetimePayment();
	}

	@Then("I am able to see One Time Payment option Monthly Support Option")
	public void i_am_able_to_see_one_time_payment_option_monthly_support_option() {
		HP = new HomePage(driver);
		HP.Verify_lbl_MonthlySupport();
	}

	@Then("I am able to see Upgrade button")
	public void i_am_able_to_see_upgrade_button() throws IOException {
		HP = new HomePage(driver);
		HP.Verify_btn_Upgrade();
		TakeScreenshots("TC1", "upgrade");
	}


}
