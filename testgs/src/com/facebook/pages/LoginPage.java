package com.facebook.pages;

import com.facebook.genericPage.CommonFunction;
import com.facebook.genericPage.MasterPage;

public class LoginPage extends CommonFunction
{
	public LoginPage() throws Exception
	{
		super();
	}
	public void clickEmailorPhone()
	{
		System.out.println("Clicking on Email id");
		click("login_use");
		
	}
	public void Enteremail()
	{
		System.out.println("Entering the emailid");
		enterData("login_use", "Usernametd");
	}
	public void ClickPassword()
	{
		System.out.println("clicking the password");
		click("password");
	}
	public void EnterPassword()
	{
		System.out.println("Entering the Password");
		enterData("password", "passwordtd");
	}
	public void LoginButton()
	{
		System.out.println("clicking on the LoginButton");
		click("Login_button");
	}
}
