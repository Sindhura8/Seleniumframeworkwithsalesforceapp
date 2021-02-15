package Framedemo.Frameworkwithtestcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	static ExtentReports extent;
	
	public static ExtentReports getReports() {
	
		extent=new ExtentReports();
		
		String path =System.getProperty("user.dir")+"/reports/first.html";

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		extent.attachReporter(reporter);
		
		return extent;

	}

}
