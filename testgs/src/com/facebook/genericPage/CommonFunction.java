package com.facebook.genericPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonFunction extends MasterPage
{

	public CommonFunction() throws Exception 
	{
		super();
		
	}
	public void click(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
		//driver.findElement(By.id(or.getProperty(xpathkey))).click();
		
	}

	public void enterData(String xpathkey,String testData)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testData));
	}
	//Mouse Over
	public void moveToElement(String xpathkey)
	{
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpathkey))).build();
	}
	//click list of webElement
	public void ClickListElement(String xpathkey,String testData)
	{
		List<WebElement> list=driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(td.getProperty(testData)))
			{
				list.get(i).click();
			}
		}
	}
	
	//Select drop down Values


}
