package com.tnp.ninja.qa.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("User opens the application")
	public void user_opens_the_application1() {

	}

	@When("user provide the Valid product {string} in search field")
	public void user_provide_the_valid_product_in_search_field(String string) {

	}

	@When("User clicks on Search button")
	public void user_clicks_on_search_button() {

	}

	@Then("User should get valid product displayed in search page")
	public void user_should_get_valid_product_displayed_in_search_page() {

	}

	@Given("user opens the application")
	public void user_opens_the_application() {

	}

	@When("user provide the InValid product {string} in search field")
	public void user_provide_the_in_valid_product_in_search_field(String string) {

	}

	@Then("User should get a message abou no product matching")
	public void user_should_get_a_message_abou_no_product_matching() {

	}

	@When("User not provided any value in Search field")
	public void user_not_provided_any_value_in_search_field() {

	}

}
