package Step_definitions;

import io.cucumber.java.en.*;

public class Verifypending_sheet_step_Def {
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		System.out.println("Verifed the steps");
	}

	@When("The user click on the time option from menu")
	public void the_user_click_on_the_time_option_from_menu() {
		System.out.println("Verifed the steps");
	}

	@And("^User enter the (.*)$")
	public void User_enter_the_employee_name(String name) {
		System.out.println("Verifed the steps");
	}

	@Then("Click on the view button")
	public void click_on_the_view_button() {
		System.out.println("Verifed the steps");
	}

	@And("User verify the pending task")
	public void user_verify_the_pending_task() {
		System.out.println("Verifed the steps");
	}



}
