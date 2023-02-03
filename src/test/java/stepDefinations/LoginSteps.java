package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside step - user is on login page ");
	}

	@When("user enter user name and password")
	public void user_enter_user_name_and_password() {
		System.out.println("inside step - user enters username and password ");

	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("inside step - click on logi button  ");

	}

	@Then("user is navigating to the home page")
	public void user_is_navigating_to_the_home_page() {
		System.out.println("inside step - user land on login screen ");

	}


}
