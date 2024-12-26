package Step_definitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.HRMS.drivermanager.Drivermanager;
import Com.HRMSproject.Pom_objects.Login_page;
import Com.HRMSproject.constants.constant;
import Com.HRMSproject.utilitie.loadproperties;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class browser {
	
	private static final  Logger LOGGER= LogManager.getLogger(browser.class);
	
private static String scenarioname=null;

public static String getscenarioname() {
	return scenarioname;
}
	
	@Before
	public void beforescenario(Scenario scenario) {
		LOGGER.info("Execution start");
	scenarioname=scenario.getName();
		
		loadproperties.loadpropertie_instance().loadpropertie();
		
		
		LOGGER.info("Properties are loaded");
		try {
			if(Drivermanager.getDriver()==null) {
				LOGGER.info("Browser is null");
			Drivermanager.launchbrowser();
			loadproperties.loadpropertie_instance().initelement();
			
			Drivermanager.getDriver().get(constant.URL);
			Drivermanager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String url=	Drivermanager.getDriver().getCurrentUrl();
			
			if(url.contains("login")) {
			login();
			}else {
				System.out.println("User is aleady logged in");
			}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	private void login() {
//		Drivermanager.getDriver().get(constant.URL);
//		Drivermanager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Login_page.loginpage_instance().enter_username(constant.USER_NAME);
	Login_page.loginpage_instance().enter_password(constant.PASSWORD);
	Login_page.loginpage_instance().click_login_btn();
	}
	
	// Takescreenshot for extent report
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			byte[] 	 screenshot=((TakesScreenshot)Drivermanager.getDriver()).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(screenshot, "image/png", scenario.getName());
			scenario.attach(screenshot, "image/png", scenario.getName());
			System.out.println("I am  inside the screenshot failed");
		}
	}
	
	public void highlight_element(WebElement element) {
		JavascriptExecutor executor= (JavascriptExecutor) Drivermanager.getDriver();
				 executor.executeScript("arguments[0],setAttribute('style','border: 3px solid blue');", element);
		
	}
}


