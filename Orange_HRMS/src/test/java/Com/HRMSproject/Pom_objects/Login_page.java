package Com.HRMSproject.Pom_objects;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.HRMS.drivermanager.Drivermanager;
import Com.HRMSproject.utilitie.loadproperties;
import Step_definitions.browser;

public class Login_page {

	private static Login_page loginpage;
	
	private Login_page() {
		
	}
	
	public static Login_page loginpage_instance() {
		
		if(loginpage==null) {
			loginpage=new Login_page();
		}
		return loginpage;
	}
	
	browser browserpage=new browser();
	
	@FindBy(name = "username")
	//@FindBy(xpath="//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement username;
	
	@FindBy(name = "password")
	//@FindBy(xpath="//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement login_button;

//	public WebElement getUsername() {
//		return username;
//	}
//
//	public WebElement getPassword() {
//		return password;
//	}
//
//	public WebElement getLogin_button() {
//		return login_button;
//	}
	
	
	public void enter_username(String uname) {
		
		//browserpage.highlight_element(username);
			username.sendKeys(uname);
	}
	
  public void enter_password(String pwd) {
	  
	 // browserpage.highlight_element(password);
	  password.sendKeys(pwd);
		
	}
  public void click_login_btn() {
	//  browserpage.highlight_element(login_button);
	  login_button.click();
}
	
}

