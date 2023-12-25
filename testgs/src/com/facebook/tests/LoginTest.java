package com.facebook.tests;

import org.junit.AfterClass;
import org.junit.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest 
{	
	@Test
	public void LoginTest() throws Exception
	{
		LoginPage lp = new LoginPage();
		lp.clickEmailorPhone();
		lp.Enteremail();
		lp.ClickPassword();
		lp.EnterPassword();
		lp.LoginButton();
		
	}
	@AfterClass
	public static void CloseBrowser()
	{
		System.out.println("Browser is Closed");
		MasterPage.driver.close();
	}
}
