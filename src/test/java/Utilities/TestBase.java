package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import listener.Listenerst;
import webdriverutilities.WebDrManager;

@Listeners(Listenerst.class)
public class TestBase {
	public static String sConfig;
	public static String sBrowser;
	WebDrManager drivermanagerweb= new WebDrManager();
	public WebDriver driverweb;
	public static SeleniumUtilities oSeleniumUtility=new SeleniumUtilities();
	
	@BeforeSuite
	public void dependencyFullfilment() throws Exception{
		sConfig = CommonUtilities.readfileReturnInString(System.getProperty("user.dir")+"/resources/testdata/config.json");
		String sAutomation=JsonPath.read(sConfig,"automation");
		if(sAutomation.toLowerCase().equals("web")) {
			
			sBrowser=JsonPath.read(sConfig,"browser");
			oSeleniumUtility.launchapp();
			driverweb= oSeleniumUtility.getDriver();
			
		}

		/*@AfterSuite
		public void quitapp() {
			if(sAutomation.toLowerCase().contentEquals("web")) {
				drivermanagerweb.quitapp();
			}
		
			
		}*/	
	}
}
