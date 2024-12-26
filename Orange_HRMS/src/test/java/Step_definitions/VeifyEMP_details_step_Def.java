package Step_definitions;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import Com.HRMS.drivermanager.Drivermanager;
import Com.HRMSproject.Pom_objects.Admin_page;
import Com.HRMSproject.Pom_objects.Home_page;
import Com.HRMSproject.Pom_objects.Login_page;
import Com.HRMSproject.constants.constant;
import Com.HRMSproject.utilitie.loadproperties;
import io.cucumber.java.en.*;

public class VeifyEMP_details_step_Def {
	private static final  Logger LOGGER= LogManager.getLogger(Verifypending_sheet_step_Def.class);
	
	//Admin_page adminpage=new Admin_page();
	
	@Given("User is Logged in successfully and enter in to Home page")
	public void user_is_logged_in_successfully_and_enter_in_to_home_page() throws InterruptedException, IOException {
	try {			
		//Login_page login_page=new Login_page();
//			Drivermanager.getDriver().get(constant.URL);
//		Drivermanager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	Login_page.loginpage_instance().enter_username(constant.USER_NAME);
//	Login_page.loginpage_instance().enter_password(constant.PASSWORD);
//	Login_page.loginpage_instance().click_login_btn();
		
	String url=	Drivermanager.getDriver().getCurrentUrl();
		
		if (url.contains("dashboard")) {
			LOGGER.info("User successfully logged into the webpage and entered into homepage");
		}
		
	}catch (Exception e) {
		// TODO: handle exception
		//loadproperties.loadpropertie_instance().take_screenshot();
		LOGGER.info(e);
		Assert.fail(e.getMessage());
	}
		
	}

	@When("User click the Admin option from menu bar")
	public void user_click_the_Admin_option_from_menu_bar() throws InterruptedException, IOException {
		try {
		//Home_page homepage=new Home_page();
		Drivermanager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Home_page.homepage_instance().click_admin_btn();
		
		LOGGER.info("User entered into directory page");
		}
		catch (Exception e) {
			// TODO: handle exception
			//loadproperties.loadpropertie_instance().take_screenshot();
			LOGGER.info(e);
			Assert.fail(e.getMessage());
		}
	}

	@And("^Enter the (.*) in field$")
	public void Enter_the_username_in_field(String name) throws InterruptedException, IOException {
			
		try {
		Drivermanager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Admin_page.adminpage_instance().enter_username(name);
		LOGGER.info("User enter the username");
		
//		Select select=new Select(directorypage.job_title);
//		select.selectByVisibleText("Chief Financial Officer");
		}
		catch (Exception e) {
			// TODO: handle exception
			//loadproperties.loadpropertie_instance().take_screenshot();
			LOGGER.info(e);
		}
	}
	
	@Then("Click the search button")
	public void click_the_search_button() throws IOException {
		try {
		Admin_page.adminpage_instance().click_search_btn();
		LOGGER.info("User click the search button");
		}catch (Exception e) {
			// TODO: handle exception
			//loadproperties.loadpropertie_instance().take_screenshot();
			LOGGER.info(e);
			Assert.fail(e.getMessage());
		}
	}
	
	

	@And("User should see the Admin details")
	public void user_should_see_the_Admin_details() throws IOException {
		try {
		Drivermanager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Admin_page.adminpage_instance().jobrole();
		}
		catch (Exception e) {
			// TODO: handle exception
			//loadproperties.loadpropertie_instance().take_screenshot();
			LOGGER.info(e);
		}
		}

}
