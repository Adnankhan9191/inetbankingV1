package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		
		logger.info("user name provided");
		lp.setPassword(pwd);
		Thread.sleep(5000);
		logger.info("password provided");
		lp.clickSubmit();
		logger.info("Login button clicked");
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("My Account"))
		{
			//Assert.assertTrue(true);
			lp.LogoutDropdown();
			logger.info("Logout dropdown clicked");
			logger.info("Login passed");
		}
		else
		{
		
			//Assert.assertTrue(false);
		
		//	lp.clickLogout();
			//Thread.sleep(3000);
		//	driver.switchTo().alert().accept();//close logout alert
			logger.info("Login failed");
			captureScreen(driver,"loginDDT");
			
			
			driver.switchTo().defaultContent();
			lp.Clearusername();
			lp.Clearpassword();
			Assert.assertTrue(false);
			
		}
		
		
	}
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	
}
