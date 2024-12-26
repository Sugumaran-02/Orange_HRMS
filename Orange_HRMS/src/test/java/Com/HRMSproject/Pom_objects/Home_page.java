package Com.HRMSproject.Pom_objects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.HRMS.drivermanager.Drivermanager;

public class Home_page {
	
 WebDriver driver=	Drivermanager.getDriver();
	
	private static Home_page homepage;
	
	private Home_page() {
		
	}
	
	public static Home_page homepage_instance() {
		
		if(homepage==null) {
			homepage=new Home_page();
		}
		
		return homepage;
	}
	
	//Using pagefactor method
	
//	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
//	private WebElement Admin;

	//Using BY Locator 
	
	By Admin=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	
//	public WebElement getAdmin() {
//		return Admin;
//	}
	
	//using explict wait
	
	public void click_admin_btn() {
		try {
		driver.findElement(Admin).click();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(Admin));
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
	}
	
}
