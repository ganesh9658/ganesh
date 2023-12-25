package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MasterPage 
{
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;
	
	public MasterPage() throws Exception 
	{
		FileInputStream ip = 
		new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\configuration.properties");
	prop = new Properties();
	prop.load(ip);
	
	FileInputStream fs = 
	new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\locators.properties");
	or = new Properties();
	or.load(fs);
		
		FileInputStream ts = 
		new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\facebook\\repository\\testdata.properties");
		td = new Properties();
		td.load(ts);
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\com.facebook2.drivers\\chromedriver.exe") ;
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				System.out.println("Chrome is Open");
			}
			
			
			else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\src\\com.facebook2.drivers\\chromedriver.exe") ;
				driver=new ChromeDriver();
				System.out.println("firefox is Open");
			}
			else 
			{
				System.out.println("Please select browser ");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));

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
