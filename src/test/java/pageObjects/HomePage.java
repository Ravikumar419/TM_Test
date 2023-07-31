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
		if (Display_Get_ListUsers) {
			 System.out.println("Get_ListUsers is displayed.");
		}else {
			System.out.println("Get_ListUsers is not displayed.");
		}
	}
	
	public void Verify_GetSingleUser() {
		boolean Display_Get_SingleUser = Get_SingleUser.isDisplayed();
		if (Display_Get_SingleUser) {
			 System.out.println("Get_SingleUser is displayed.");
		}else {
			System.out.println("Get_SingleUser is not displayed.");
		}
	}
	
	public void Verify_SingleUserNotFound() {
		boolean Display = SingleUserNotFound.isDisplayed();
		if (Display) {
			 System.out.println("SingleUserNotFound is displayed.");
		}else {
			System.out.println("SingleUserNotFound is not displayed.");
		}
	}
	
	public void Verify_GetListResource() {
		boolean Display = ListResource.isDisplayed();
		if (Display) {
			 System.out.println("ListResource is displayed.");
		}else {
			System.out.println("ListResource is not displayed.");
		}
	}
	
	public void Verify_PostCreate() {
		boolean Display = PostCreate.isDisplayed();
		if (Display) {
			 System.out.println("PostCreate is displayed.");
		}else {
			System.out.println("PostCreate is not displayed.");
		}
	}
	
	public void Verify_PatchUpdate() {
		boolean Display = PatchUpdate.isDisplayed();
		if (Display) {
			 System.out.println("PatchUpdate is displayed.");
		}else {
			System.out.println("PatchUpdate is not displayed.");
		}
	}
	
	public void Verify_PutUpdate() {
		boolean Display = PutUpdate.isDisplayed();
		if (Display) {
			 System.out.println("PutUpdate is displayed.");
		}else {
			System.out.println("PutUpdate is not displayed.");
		}
	}
	
	public void Verify_Delete() {
		boolean Display = Delete.isDisplayed();
		if (Display) {
			 System.out.println("Delete is displayed.");
		}else {
			System.out.println("Delete is not displayed.");
		}
	}
	
	public void Verify_RegisterSuccessful() {
		boolean Display = RegisterSuccessful.isDisplayed();
		if (Display) {
			 System.out.println("RegisterSuccessful is displayed.");
		}else {
			System.out.println("RegisterSuccessful is not displayed.");
		}
	}
	
	public void Verify_RegisterUnuccessful() {
		boolean Display = RegisterUnuccessful.isDisplayed();
		if (Display) {
			 System.out.println("RegisterUnuccessful is displayed.");
		}else {
			System.out.println("RegisterUnuccessful is not displayed.");
		}
	}
	
	public void Verify_LoginSuccessful() {
		boolean Display = LoginSuccessful.isDisplayed();
		if (Display) {
			 System.out.println("LoginSuccessful is displayed.");
		}else {
			System.out.println("LoginSuccessful is not displayed.");
		}
	}
	
	public void Verify_LoginUnsuccessful() {
		boolean Display = LoginUnsuccessful.isDisplayed();
		if (Display) {
			 System.out.println("LoginUnsuccessful is displayed.");
		}else {
			System.out.println("LoginUnsuccessful is not displayed.");
		}
	}
	
	public void Verify_DelayRespnse() {
		boolean Display = DelayRespnse.isDisplayed();
		if (Display) {
			 System.out.println("DelayRespnse is displayed.");
		}else {
			System.out.println("DelayRespnse is not displayed.");
		}
	}
	
	public void Verify_Request() {
		boolean Display = Request.isDisplayed();
		if (Display) {
			 System.out.println("Request is displayed.");
		}else {
			System.out.println("Request is not displayed.");
		}
	}
	
	public void Verify_Response() {
		boolean Display = Response.isDisplayed();
		if (Display) {
			 System.out.println("Response is displayed.");
		}else {
			System.out.println("Response is not displayed.");
		}
	}
	
	public void Verify_btn_SupportReqres() {
		boolean Display = btn_SupportReqres.isDisplayed();
		if (Display) {
			 System.out.println("btn_SupportReqres is displayed.");
		}else {
			System.out.println("btn_SupportReqres is not displayed.");
		}
	}
	
	public void Click_btn_SupportReqres() {
		btn_SupportReqresMain.click();
		
	}
	
	public void Verify_lbl_OnetimePayment() {
		boolean Display = lbl_OnetimePayment.isDisplayed();
		if (Display) {
			 System.out.println("lbl_OnetimePayment is displayed.");
		}else {
			System.out.println("lbl_OnetimePayment is not displayed.");
		}
	}
	
	public void Verify_lbl_MonthlySupport() {
		boolean Display = lbl_MonthlySupport.isDisplayed();
		if (Display) {
			 System.out.println("lbl_MonthlySupport is displayed.");
		}else {
			System.out.println("lbl_MonthlySupport is not displayed.");
		}
	}
	
	public void Verify_btn_Upgrade() {
		boolean Display = btn_Upgrade.isDisplayed();
		if (Display) {
			 System.out.println("btn_Upgrade is displayed.");
		}else {
			System.out.println("btn_Upgrade is not displayed.");
		}
	}
	
}