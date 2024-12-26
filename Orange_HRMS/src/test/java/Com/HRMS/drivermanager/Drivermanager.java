package Com.HRMS.drivermanager;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.HRMSproject.constants.constant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager {
	
	

	private static WebDriver driver=null;
	
	private static final Logger LOGGER= LogManager.getLogger(Drivermanager.class);
	
	public static void launchbrowser() {
		
		LOGGER.info("Browser is ready to launch");
		switch (constant.BROWSER) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			LOGGER.info("Launching the "+ constant.BROWSER);
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			LOGGER.info("Launching the "+ constant.BROWSER);
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			LOGGER.info("Launching the "+ constant.BROWSER);
			driver=new EdgeDriver();
			break;
		default:	
			WebDriverManager.chromedriver().setup();
			LOGGER.info("Launching the "+ constant.BROWSER);
		driver=new ChromeDriver();
		break;
		}
		LOGGER.info("Browser is launched ready to rock");
	}
		
	public static WebDriver getDriver() {
		return driver;
	}
	
	}


