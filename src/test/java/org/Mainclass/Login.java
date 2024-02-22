package org.Mainclass;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.page.BotPage;
import org.page.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends BaseClass {

	private WebDriver driver;

	@BeforeClass
	public void launch() {
		this.driver = LaunchBrowser("Chrome", "https://beta.buildchatbot.ai/");

	}

	@Test(priority=1)
	public void Loginone() {
		LoginPage page = PageFactory.initElements(this.driver, LoginPage.class);
		page.clicklogin();
	}

	@Test(priority=2)
	public void createbott() {
		
		BotPage bot = PageFactory.initElements(this.driver, BotPage.class);
	    bot.singleBot();   
		

	}  
	
	
	
	
	
	
	
	
	
	
	
	

}
