package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Accountcreation;
import page.Addtocart;
import page.Itemsearch;
import page.Signinpage;

public class Sitetest {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		driver=new ChromeDriver(c);
		driver.get("https://www.justwatches.com");                 //Loading just watch site
        driver.manage().window().maximize();
		driver.navigate().refresh();
		
	}
	@Test
	public void justwatchtest() throws Exception
	{
		  Accountcreation ac=new Accountcreation(driver);
		//  ac.accountcreation("subin Thomas","saji","subinsaji126@gmail.com","subin@123");

		  Signinpage s=new Signinpage(driver);
		  s.signin("subinsaji126@gmail.com","subin@123");
		 Itemsearch is=new Itemsearch(driver);
		 is.search("men");
		 Addtocart a=new Addtocart(driver);
		 a.addtitem1();
		
		 
		
		  
	}
	
}


