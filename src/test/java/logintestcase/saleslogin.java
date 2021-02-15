package logintestcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.TestBase;
import loginpo.poLogin;

public class saleslogin extends TestBase{
	
	poLogin ologin;
	
	@BeforeTest
	public void settingdependency() {
		ologin=new poLogin(driverweb);
		oSeleniumUtility.goToSalesforceURL();
	}
	
	
	@Test
	public void logintosalesforceportal() throws IOException {
		ologin.Logintosalesforce();
		
	}

}
