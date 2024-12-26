package Com.HRMSproject.utilitie;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.drivermanager.Drivermanager;
import Com.HRMSproject.Pom_objects.Admin_page;
import Com.HRMSproject.Pom_objects.Home_page;
import Com.HRMSproject.Pom_objects.Login_page;
import Com.HRMSproject.constants.constant;
import Step_definitions.browser;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class loadproperties {
	
	private static loadproperties loadpropertie_1;
	
	private loadproperties() {
		
	}
	
	public static loadproperties loadpropertie_instance() {
		
		if (loadpropertie_1==null) {
		loadpropertie_1=new loadproperties();	
		}
		return loadpropertie_1;
		
	}
	
	public void loadpropertie() {
//	 FileReader reader = null;
//		
//		try {
//			 reader=new FileReader("config.properties");
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		
		Properties properties=new Properties();
		
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	constant.BROWSER=	properties.getProperty("Browser");
	constant.URL=	properties.getProperty("URL");
	constant.USER_NAME=	properties.getProperty("Username");
	constant.PASSWORD=	properties.getProperty("Password");
	constant.CHROME_DRIVER_LOCATION=	properties.getProperty("Chrome_driver_location");
	constant.FIREFOX_DRIVER_LOCATION=	properties.getProperty("Firefox_driver_location");
	constant.EDGE_DRIVER_LOCATION=	properties.getProperty("Edge_driver_location");
	constant.CHROME_DRIVER=	properties.getProperty("Chrome_driver");
	constant.FIREFOX_DRIVER=	properties.getProperty("Edge_driver");
	constant.FIREFOX_DRIVER=	properties.getProperty("Firefox_driver");
	
	System.out.println(constant.CHROME_DRIVER_LOCATION);
		
	
	}
	
	public void initelement() {
		
		PageFactory.initElements(Drivermanager.getDriver(), Login_page.loginpage_instance());
		PageFactory.initElements(Drivermanager.getDriver(), Home_page.homepage_instance());
		PageFactory.initElements(Drivermanager.getDriver(), Admin_page.adminpage_instance());
		
	}
	
	// takescreenshot for commonway
	
	public void take_screenshot() throws IOException {
		File file=new File(browser.getscenarioname()+".png");
		
	File screenshot=((TakesScreenshot)Drivermanager.getDriver()).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(screenshot,file);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}

	
		
	

	

}
