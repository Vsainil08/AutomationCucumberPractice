package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on netbanking landing page");
	    
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Practice landing page");
	}
	@When("User login into application")
	public void user_login_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
	    
	}

//	@When("User login into application with {string} and password {string} combination")
//	public void user_login_into_application_with_and_password_combination(String UserName, String Password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User login into application with "+UserName+" and password "+Password+" combination");
//	}
	
	@When("^User login into application with (.+) and password (.+) combination$")
	public void user_login_into_application_with_and_password_combination(String UserName, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into application with "+UserName+" and password "+Password+" combination");
	}
	@Then("HomePage is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Homepage is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards is displayed");
	}
	
	@Given("User setup the enteries in database")
	public void user_setup_the_enteries_in_database() {
	    System.out.println("********Given***********");
	    System.out.println("Setup enteries in Databse");
	    
	}
	@When("Launch the browese from config variables")
	public void launch_the_browese_from_config_variables() {
	    System.out.println("Launch the browese from config variables");
	}
	@When("hit the homepage url of banking site")
	public void hit_the_homepage_url_of_banking_site() {
		System.out.println("hit the homepage url of banking site");
	}
}
