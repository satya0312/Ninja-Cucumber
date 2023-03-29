package com.tnp.ninja.qa.stepdefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("User Navigate to Register page")
	public void user_navigate_to_register_page() {

	}

	@When("User provide the below fields")
	public void user_provide_the_below_fields(DataTable dataTable) {
		
	}

	@When("User select the agree Checkbox")
	public void user_select_the_agree_checkbox() {

	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {

	}

	@Then("User Account should be created sucessfully")
	public void user_account_should_be_created_sucessfully() {
		;
	}

	@When("User select the NewsLetter as yes radio button")
	public void user_select_the_news_letter_as_yes_radio_button() {

	}

	@Then("User should get a proper warning message about duplicate account")
	public void user_should_get_a_proper_warning_message_about_duplicate_account() {

	}

	@When("User dont enter any fields")
	public void user_dont_enter_any_fields() {

	}

	@Then("User should get a proper warning message about Manditatory fields")
	public void user_should_get_a_proper_warning_message_about_manditatory_fields() {

	}

}
