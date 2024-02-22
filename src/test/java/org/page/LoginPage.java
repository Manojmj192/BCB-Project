package org.page;

import org.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	By Loginbutton = By
			.xpath("//header[@id='masthead']//div[1]/div[1]//div[1]//div[3]//button[contains(text(),'Login')]");

	@SuppressWarnings("static-access")

//	LoginCred

	By Email = By.xpath("//input[@id='email']");
	By Password = By.xpath("//input[@id='password']");
	By LoginProceed = By.xpath("//button[@id='loginsubmit']");
	By Registerhere = By.xpath("//p[@id='login-sec']//following::div[1]/p/a");
	By Createnewbot = By.xpath("//a[@id='createLink']");
	By botname = By.xpath("//input[@id='chatName']");
	By Createbotbutton = By.xpath("//button[@id='createbot']");

	By exisitingbot = By.xpath(
			"//button[@id='createbot']//following::div[1]//child::div[contains(@class,'chat_list')]//div[1]//div[1]//div[1]//h4");

//	public LoginPage(WebDriver driver) {
//
//		this.driver = driver;
//
//	}

	public void clicklogin() {

		this.clickcondition(Loginbutton);
		this.inputcondition(Email, "manivel@zaigoinfotech.com");
		this.inputcondition(Password, "Password@123");
		this.clickcondition(LoginProceed);

	}
	
	
	
	

}
