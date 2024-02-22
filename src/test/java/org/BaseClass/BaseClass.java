package org.BaseClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	static WebElement until;
	static WebDriverWait wait;

	public void inputkey(WebElement value, String V) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement until = wait.until(ExpectedConditions.visibilityOf(value));
		until.sendKeys(V);

	}

	public void click(By value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(value));
		until.click();

	}

	public void inputcondition(Object value, String Value1) {

		if (value instanceof WebElement) {

			wait = new WebDriverWait(driver, 10);
			until = wait.until(ExpectedConditions.visibilityOf((WebElement) value));

		} else {

			wait = new WebDriverWait(driver, 10);
			until = wait.until(ExpectedConditions.visibilityOfElementLocated((By) value));

		}
		until.sendKeys(Value1);

	}

	public void clickcondition(Object value) {
		wait = new WebDriverWait(driver, 10);
		if (value instanceof WebElement) {
			until = wait.until(ExpectedConditions.visibilityOf((WebElement) value));
		} else if (value instanceof By) {
			until = wait.until(ExpectedConditions.visibilityOfElementLocated((By) value));
		}
		until.click();
	}

	public WebDriver LaunchBrowser(String value, String URL) {

		if (value == "FireFox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (value == "Chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(URL);

		driver.manage().window().maximize();

		return driver;

	}

	public void swappcondition(Object value, Object value1, String value2, By value3) {

		if (value instanceof WebElement) {

			try {

				wait = new WebDriverWait(driver, 10);
				WebElement until2 = wait.until(ExpectedConditions.visibilityOf((WebElement) value));
				until2.click();

			} catch (Exception e) {
				// TODO: handle exception

				wait = new WebDriverWait(driver, 10);
				WebElement until3 = wait.until(ExpectedConditions.visibilityOf((WebElement) value1));
				until3.sendKeys(value2);
			}

		} else if (value instanceof By) {
			try {
				wait = new WebDriverWait(driver, 10);
				WebElement until2 = wait.until(ExpectedConditions.visibilityOfElementLocated((By) value));
				until2.click();
			} catch (Exception e) {
				// TODO: handle exception

				wait = new WebDriverWait(driver, 10);
				WebElement until3 = wait.until(ExpectedConditions.visibilityOfElementLocated((By) value1));
				until3.sendKeys(value2);
				WebElement until4 = wait.until(ExpectedConditions.visibilityOfElementLocated(value3));
				until4.click();
			}

		}

	}
	
	public void checkboxlist(Object elements) {
		
		
		if (elements instanceof WebElement) {
			
		}
		wait = new WebDriverWait(driver, 10);
		List<WebElement> until2 = wait.until(ExpectedConditions.visibilityOfAllElements((WebElement[]) elements));
		
		int count;
		for (WebElement webElement2 : until2) {
			count++;
			webElement2.click();
			if (count==10) {
				break;
			}
			
			
			
			
			}
		
		
		

       
		count++;
		
			
			
			
			
		}
		
			
		}
		
		
		
		
		

	}
