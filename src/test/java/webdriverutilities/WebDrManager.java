package webdriverutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrManager implements iWebDriver {

	WebDriver driver;
	public WebDriver getDriver() {
	
		return driver;
	}
	
  public void quitapp() {
	  driver.quit();
  }

public void launchapp(String sBrowserType) {
	
	if(sBrowserType.toLowerCase().equals("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
}
}
