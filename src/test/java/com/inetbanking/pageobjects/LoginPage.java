package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"loginfrm\"]/button")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(using="Log me out")
	@CacheLookup
	WebElement lnkLogout;
	
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement ClickLoginDropD;
	//*[@id="header"]/div[2]/div/div/nav/div[2]
	

	@FindBy(id="dropdownCurrency")  //elements
	@CacheLookup
	WebElement LogoutdropdownB;
	
	public void setUserName(String uname)    //Action methods
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}



	public void LoginDropDClick() {
		// TODO Auto-generated method stub
		ClickLoginDropD.click();
	}
	
	public void Clearusername() {
		// TODO Auto-generated method stub
		txtUserName.clear();
	}
	
	public void Clearpassword() {
		// TODO Auto-generated method stub
		txtPassword.clear();
	}
	
	
	public void LogoutDropdown() {
		// TODO Auto-generated method stub
		LogoutdropdownB.click();
	}
}









