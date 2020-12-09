package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Signup {

	WebDriver ldriver;
	
	public Signup(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using="//*[@id=\"loginfrm\"]/div[4]/div[1]/a")
	@CacheLookup
	WebElement SignUpLink;
	
	
	@FindBy(how = How.NAME , using="firstname")
	@CacheLookup
	WebElement FirstName;
	
	@FindBy(how = How.NAME , using="lastname")
	@CacheLookup
	WebElement LastName;
	
	
	@FindBy(how = How.NAME , using="phone")
	@CacheLookup
	WebElement PhoneNum;
	
	
	@FindBy(how = How.NAME , using="email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(how = How.NAME , using="password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(how = How.NAME , using="confirmpassword")
	@CacheLookup
	WebElement CPassword;
	
	
	@FindBy(how = How.XPATH, using="//*[@id=\"headersignupform\"]/div[8]/button")
	@CacheLookup
	WebElement SignUpBtnClick;
	

	public void SignupLink()
	{
		SignUpLink.click();
	}
	
	public void EnterFName(String fname)
	{
		FirstName.sendKeys(fname);
	}
	
	public void EnterLName(String Lname)
	{
		LastName.sendKeys(Lname);
	}
	
	public void PhoneNo(String PNUM)
	{
		PhoneNum.sendKeys(PNUM);
	}
	
	public void EnterEmail(String EM)
	{
		Email.sendKeys(EM);
	}
	
	
	public void EnterPass(String Pas)
	{
		Password.sendKeys(Pas);
	}
	
	public void EnterCPass(String Cpas)
	{
		CPassword.sendKeys(Cpas);
	}
	
	public void ClickSignUpBTN()
	{
		SignUpBtnClick.click();
	}
	
	
	
}
