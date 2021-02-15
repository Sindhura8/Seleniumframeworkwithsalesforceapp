package usermenutestcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.TestBase;
import loginpo.poLogin;
import usermenupo.Usermenudropdown;

public class usermenutc extends TestBase {

	poLogin ologin;
	Usermenudropdown usm;

	@BeforeTest
	public void settingdependency() {
		ologin = new poLogin(driverweb);
		usm=new Usermenudropdown(driverweb);
		oSeleniumUtility.goToSalesforceURL();
	}

	@Test
	public void usermenucall() throws IOException, InterruptedException {
		ologin.Logintosalesforce();
		usm.usermenurun();

	}

}
