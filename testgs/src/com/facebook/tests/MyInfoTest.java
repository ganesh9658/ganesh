package com.facebook.tests;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;
import com.facebook.pages.MyInfo;


public class MyInfoTest 
{
		
		@Test 
		
		public void AMyInfoTest1() throws Exception 
		{
			LoginPage lp = new LoginPage();
			MyInfo mi = new MyInfo();
			lp.clickEmailorPhone();
			lp.Enteremail();
			lp.ClickPassword();
			lp.EnterPassword();
			lp.LoginButton();	
			mi.myInfoMenu();
			mi.DriverLicenseNum();	
			mi.SSN();
			mi.DOB();
			mi.Save();
			
		}
//		@Test 
//		
//		public  void BMyInfoTest2() throws Exception
//		{
//			MasterPage.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//			MyInfo mi = new MyInfo();
//			mi.DriverLicenseNum();			
//		}
		@AfterClass
		public static void CloseBroswer()
		{
			System.out.println("Closing the Broswer");
			MasterPage.driver.close();
		}

	}

