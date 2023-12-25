package com.facebook.pages;

import java.util.concurrent.TimeUnit;

import com.facebook.genericPage.MasterPage;

public class MyInfo extends MasterPage
{

	public MyInfo() throws Exception 
	{
		super();
		
	}
	public void myInfoMenu()
	{
		System.out.println("Clicking on myInfo");
		click("MyInfo");
	}
	public void DriverLicenseNum2()
	{
		System.out.println("Entering Driving License");
		enterData("DriverLicenseNum","drivingLicenceNUmber");
		
	}
	public void SSN()
	{
		System.out.println("Entering SSN");
		enterData("SSN","drivingLicenceNUmber");
		
	}
	public void DOB()
	{
		System.out.println("Clicking on DOB");
		click("DOB");
		
	}
	public void Save()
	{
		System.out.println("Clicking on DOB");
		click("save");
		
	}
	public void DriverLicenseNum()
	{
		MasterPage.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Entering Driving License");
		enterData("DriverLicenseNum","drivingLicenceNUmber");
		
	}

}
