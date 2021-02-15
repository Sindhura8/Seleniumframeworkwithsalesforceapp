package usermenupo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import Utilities.TestBase;
import listener.Listenerst;

@Listeners(Listenerst.class)
public class Usermenudropdown extends TestBase {
	
	WebDriver driver;
	public Usermenudropdown(WebDriver driver) {
		this.driverweb=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@id=\"userNavLabel\"]")
	WebElement user_navigation;
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[1]")
	WebElement usernavigation_menu;
	
	@FindBy(xpath="//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
	WebElement editbutton;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement iframe;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement about;
	

	public void usermenurun() throws InterruptedException {
		
		oSeleniumUtility.webElelementClick(user_navigation);
		oSeleniumUtility.webElelementClick(usernavigation_menu);
		Assert.assertTrue(false);
		Thread.sleep(4000);
		oSeleniumUtility.webElelementClick(editbutton);
		Thread.sleep(3000);
		oSeleniumUtility.switchframes(iframe);
		System.out.println("Switched to iframe");
		Thread.sleep(8000);
		oSeleniumUtility.webElelementClick(about);
		
		
	}
}
