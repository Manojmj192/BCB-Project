package org.page;

import java.util.List;

import org.BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BotPage extends BaseClass {

	By chatname = By.xpath("//input[@id='chatName']");
	By Createnewbot = By.xpath("//button[@id='createbot']");
	By botname = By.xpath("//input[@id='chatName']");
	By Createbotbutton = By.xpath("//button[@id='createbot']");

	By exisitingbot = By.xpath(
			"//button[@id='createbot']//following::div[1]//child::div[contains(@class,'chat_list')]//div[1]//div[1]//div[1]//h4");

	By WebsiteURL = By.xpath("//li[@id='website_url']");
	By WebsiteInput = By.xpath("//input[@id='website']");
	By WebsiteAdd = By.xpath("//button[@id='submit-website']");
	By Checkboxes = By.xpath("//div[@id='files-list-container_website_url']/div/div/span/label");

	public void singleBot() {

		swappcondition(exisitingbot, chatname, "testbot", Createnewbot);

	}

	public void websiteURL() {

		clickcondition(WebsiteURL);
		inputcondition(WebsiteInput,
				"https://www.apple.com/in/store?afid=p238%7Cs8Vs8GkTq-dc_mtid_187079nc38483_pcrid_689251521289_pgrid_112258962467_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
       clickcondition(WebsiteAdd);
       List<WebElement> elements = driver.findElements(Checkboxes);
       checkboxlist(elements);
       
		
	}

}
