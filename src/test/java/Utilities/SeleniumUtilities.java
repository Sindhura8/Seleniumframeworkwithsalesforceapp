package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webdriverutilities.WebDrManager;

public class SeleniumUtilities extends TestBase{
	WebDrManager drivermanagerweb=new WebDrManager();
	
	public WebDriver getDriver() {
		return drivermanagerweb.getDriver();
	}
	
	public void launchapp() {
		drivermanagerweb.launchapp(sBrowser);
	}
	
	public void goToSalesforceURL() {
		driverweb=drivermanagerweb.getDriver();
		driverweb.get("https://login.salesforce.com/");
	}
	public void quitapp() {
		drivermanagerweb.quitapp();
	}

	public void webElelementClear(WebElement email_field) {
		
		
	}

	public void webElelementsendkeys(WebElement ele, String string) {
		
		ele.sendKeys(string);
	}

	public void webElelementClick(WebElement ele) {
		
		ele.click();
	}
public void switchframes(WebElement ele) {
		
	driverweb.switchTo().frame(ele);
	}
	
	public void waitExplicitly(int iSeconds, WebElement ele,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,iSeconds);
		wait.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
	}
	public void webElelementValid(WebElement home_Button) throws IOException {
		
		String s=home_Button.getText();
		System.out.println(s);
	}

}
