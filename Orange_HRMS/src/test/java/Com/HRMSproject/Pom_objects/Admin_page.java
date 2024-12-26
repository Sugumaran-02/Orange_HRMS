package Com.HRMSproject.Pom_objects;

import javax.xml.xpath.XPath;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import Step_definitions.Verifypending_sheet_step_Def;

public class Admin_page {
	private static final  Logger LOGGER= LogManager.getLogger(Verifypending_sheet_step_Def.class);	
	
	private static Admin_page adminpage;
	
	private Admin_page() { }
	
	public static Admin_page adminpage_instance() {
		
		if(adminpage==null) {
			adminpage=new Admin_page();
		}
		
		return adminpage;
		
	}
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	private WebElement Search_button;
	
	
	@FindBy(xpath ="//div[text()=\"Admin\"]")
	private WebElement job_role;

//
//	public WebElement getUsername() {
//		return username;
//	}
//
//
//	public WebElement getSearch_button() {
//		return Search_button;
//	}
//
//
//	public WebElement getJob_role() {
//		return job_role;
//	}
	
	//instead of use getter method we create method and action in a page class
	
	public void enter_username(String uname) {
		username.sendKeys(uname);
	}
	
	public void click_search_btn() {
		Search_button.click();
	}
	
	public void jobrole() {
	String role=job_role.getText();
	
	if(role.contains("Admin")) {
		LOGGER.info("User clicked the Jobtitle");
		}else {
			LOGGER.info("User is not valued");
		}

		
	}
	
	
	
	
}
