package Com.HRMSproject.Pom_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.HRMSproject.constants.constant;
import Com.HRMSproject.utilitie.loadproperties;
import io.cucumber.java.Before;

public class browser_launch {
	
	public static WebDriver driver;

	@Before
	public void beforescenario() {
		
		//loadproperties loadproperties=new loadproperties();
		
		//loadproperties.loadpropertie();
		
		try {
			if(driver==null)
			launchbrowser();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void launchbrowser() {
		// TODO Auto-generated method stub
		
		switch (constant.BROWSER) {
		case "chrome":
			System.setProperty(constant.CHROME_DRIVER, constant.CHROME_DRIVER_LOCATION);
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty(constant.FIREFOX_DRIVER, constant.FIREFOX_DRIVER_LOCATION);
			driver=new ChromeDriver();
			break;
		case "edge":
			System.setProperty(constant.EDGE_DRIVER, constant.EDGE_DRIVER_LOCATION);
			driver=new ChromeDriver();
			break;
		default:	
			System.setProperty(constant.CHROME_DRIVER, constant.CHROME_DRIVER_LOCATION);
		driver=new ChromeDriver();
		break;
		}
	}
	
}
