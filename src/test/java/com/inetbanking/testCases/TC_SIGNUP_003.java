package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;
import com.inetbanking.pageobjects.Signup;


public class TC_SIGNUP_003 extends BaseClass
{


    @Test
	public void Signup() throws IOException, InterruptedException
	{
		Signup sp=new Signup(driver);
		
		sp.SignupLink();
		logger.info("Signup link clicked");
		sp.EnterFName(FNAMEEE);
		logger.info("Entered first name");
		sp.EnterLName(LNAMEEE);
		logger.info("Entered last name");
		sp.PhoneNo(Phoneee);
		logger.info("Entered phone number");
		
		String email =randomstring()+ "@gmail.com";
		
		
		sp.EnterEmail(email);
		logger.info("Entered email address");
		sp.EnterPass(Passworddd);
		logger.info("Entered password");
		sp.EnterCPass(Cpassss);
		logger.info("Entered confirm password");
		sp.ClickSignUpBTN();
		logger.info("Clicked signup button");
		
		Thread.sleep(5000);
		if(driver.getTitle().equals("Dashboard"))
		{
			
			logger.info("Login test passed");
			Assert.assertTrue(true);
			
		}
		else
		{
			captureScreen(driver,"Signup");
			logger.info("Login test failed");
			Assert.assertTrue(false);
		
		}
		
		
		
	}
    
    
    
    
}
