package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//Author: rpendyala19@gmail.com

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		
		driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	

	@FindBy(xpath="//*[@data-id='users']")
	WebElement Get_ListUsers;
	
	@FindBy(xpath="//*[@data-id='users-single']")
	WebElement Get_SingleUser;

	@FindBy(xpath="//*[@data-id='users-single-not-found']")
	WebElement SingleUserNotFound;
	
	@FindBy(xpath="//*[@data-id='unknown']")
	WebElement ListResource;
	
	@FindBy(xpath="//*[@data-id='post']")
	WebElement PostCreate;

	@FindBy(xpath="//*[@data-id='patch']")
	WebElement PatchUpdate;

	@FindBy(xpath="//*[@data-id='put']")
	WebElement PutUpdate;
	
	@FindBy(xpath="//*[@data-id='delete']")
	WebElement Delete;
	
	@FindBy(xpath="//*[@data-id='register-successful']")
	WebElement RegisterSuccessful;
	
	@FindBy(xpath="//*[@data-id='register-unsuccessful']")
	WebElement RegisterUnuccessful;
	
	@FindBy(xpath="//*[@data-id='login-successful']")
	WebElement LoginSuccessful;
	
	@FindBy(xpath="//*[@data-id='delay']")
	WebElement DelayRespnse;
	
	@FindBy(xpath="//*[@data-id='login-unsuccessful']")
	WebElement LoginUnsuccessful;
	
	@FindBy(xpath="//*[@class='request']")
	WebElement Request;
	
	@FindBy(xpath="//*[@data-key='output-response']")
	WebElement Response;
	
	@FindBy(xpath="//*[contains(text(),'Support ReqRes')][1]")
	WebElement btn_SupportReqresMain;
	
	@FindBy(xpath="//button[contains(text(),'Support ReqRes')]")
	WebElement btn_SupportReqres;
	
	@FindBy(xpath="//label[contains(text(),'One-time payment')]")
	WebElement lbl_OnetimePayment;
	
	@FindBy(xpath="//label[contains(text(),'Monthly support')]")
	WebElement lbl_MonthlySupport;
	
	@FindBy(xpath="//*[contains(text(),'Upgrade')]")
	WebElement btn_Upgrade;
	
	
	public void Clic_GetListUsers() {
		Get_ListUsers.click();
	}
	public void Verify_GetListUsers() {
		String GetLSData=Get_ListUsers.getText();
		System.out.println(GetLSData);
		boolean Display_Get_ListUsers = Get_ListUsers.isDisplayed();
		Assert.assertTrue(Display_Get_ListUsers,"Get_ListUsers is not displayed.");
		System.out.println("Get_ListUsers is displayed.");
		
	}
	
	public void Verify_GetSingleUser() {
		boolean Display_Get_SingleUser = Get_SingleUser.isDisplayed();
		Assert.assertTrue(Display_Get_SingleUser, "Display Get Single User is not displayed");
		 System.out.println("Display Get Single User is displayed.");
	}
	
	public void Verify_SingleUserNotFound() {
		boolean Display = SingleUserNotFound.isDisplayed();
		Assert.assertTrue(Display,"SingleUserNotFound is not displayed.");
		System.out.println("SingleUserNotFound is displayed.");
		
	}
	
	public void Verify_GetListResource() {
		boolean Display = ListResource.isDisplayed();
		Assert.assertTrue(Display,"ListResource is not displayed.");
		System.out.println("ListResource is displayed.");

	}
	
	public void Verify_PostCreate() {
		boolean Display = PostCreate.isDisplayed();
		Assert.assertTrue(Display,"PostCreate is not displayed.");
		System.out.println("PostCreate is displayed.");
	}
	
	public void Verify_PatchUpdate() {
		boolean Display = PatchUpdate.isDisplayed();
		Assert.assertTrue(Display,"PatchUpdate is not displayed.");
		System.out.println("PatchUpdate is displayed.");
	}
	
	public void Verify_PutUpdate() {
		boolean Display = PutUpdate.isDisplayed();
		Assert.assertTrue(Display,"PutUpdate is not displayed.");
		System.out.println("PutUpdate is displayed.");

	}
	
	public void Verify_Delete() {
		boolean Display = Delete.isDisplayed();
		Assert.assertTrue(Display,"Delete is not displayed.");
		System.out.println("Delete is displayed.");
	}
	
	public void Verify_RegisterSuccessful() {
		boolean Display = RegisterSuccessful.isDisplayed();
		Assert.assertTrue(Display,"RegisterSuccessful is not displayed.");
		System.out.println("RegisterSuccessful is displayed.");
	}
	
	public void Verify_RegisterUnuccessful() {
		boolean Display = RegisterUnuccessful.isDisplayed();
		Assert.assertTrue(Display,"RegisterUnuccessful is not displayed.");
		System.out.println("RegisterUnuccessful is displayed.");
	}
	
	public void Verify_LoginSuccessful() {
		boolean Display = LoginSuccessful.isDisplayed();
		Assert.assertTrue(Display,"LoginSuccessful is not displayed.");
		System.out.println("LoginSuccessful is displayed.");

	}
	
	public void Verify_LoginUnsuccessful() {
		boolean Display = LoginUnsuccessful.isDisplayed();
		Assert.assertTrue(Display,"LoginUnsuccessful is not displayed.");
		System.out.println("LoginUnsuccessful is displayed.");
	
	}
	
	public void Verify_DelayRespnse() {
		boolean Display = DelayRespnse.isDisplayed();
		Assert.assertTrue(Display,"DelayRespnse is not displayed.");
		System.out.println("DelayRespnse is displayed.");

	}
	
	public void Verify_Request() {
		boolean Display = Request.isDisplayed();
		Assert.assertTrue(Display,"Request is not displayed.");
		System.out.println("Request is displayed.");
	}
	
	public void Verify_Response() {
		boolean Display = Response.isDisplayed();
		Assert.assertTrue(Display,"Response is displayed");
	}
	
	public void Verify_btn_SupportReqres() {
		boolean Display = btn_SupportReqres.isDisplayed();
		Assert.assertTrue(Display,"btn_SupportReqres is not displayed.");
		System.out.println("btn_SupportReqres is displayed.");
	}
	
	public void Click_btn_SupportReqres() {
		btn_SupportReqresMain.click();
		
	}
	
	public void Verify_lbl_OnetimePayment() {
		boolean Display = lbl_OnetimePayment.isDisplayed();
		Assert.assertTrue(Display,"lbl_OnetimePayment is not displayed.");
		System.out.println("lbl_OnetimePayment is displayed.");

	}
	
	public void Verify_lbl_MonthlySupport() {
		boolean Display = lbl_MonthlySupport.isDisplayed();
		Assert.assertTrue(Display,"lbl_MonthlySupport is not displayed.");
		System.out.println("lbl_MonthlySupport is displayed.");
	}
	
	public void Verify_btn_Upgrade() {
		boolean Display = btn_Upgrade.isDisplayed();
		Assert.assertTrue(Display,"btn_Upgrade is not displayed.");
		System.out.println("btn_Upgrade is displayed.");

	}
	
}