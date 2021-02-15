package loginpo;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;
import junit.framework.Assert;

public class poLogin extends TestBase{
	WebDriver driver;
	public poLogin(WebDriver driver) {
		this.driverweb=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	WebElement email_field;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password_field;
	
	@FindBy(xpath="//*[@id=\"Login\"]")
	WebElement Login_Button;
	
	@FindBy(xpath="//*[@id=\"home_Tab\"]/a")
	WebElement Home_Button;
	
	public void Logintosalesforce() throws IOException {
		
//		oSeleniumUtility.waitExplicitly(5,password_field,driver);
		//oSeleniumUtility.webElelementClear(email_field);
		oSeleniumUtility.webElelementsendkeys(email_field,"sindhura.p@salesforce.com");
		//oSeleniumUtility.webElelementClear(password_field);
		oSeleniumUtility.webElelementsendkeys(password_field,"test@1234");
		oSeleniumUtility.webElelementClick(Login_Button);
		String home_button_next=Home_Button.getText();
		System.out.println(home_button_next);
		Assert.assertEquals(home_button_next, "Home");
		
	}

}
