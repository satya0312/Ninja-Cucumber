package com.tnp.ninja.qa.stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.tutorialsninja.com/demo/");
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Given("User Navigate to Register page")
	public void user_navigate_to_register_page() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

	}

	@When("User provide the below fields")
	public void user_provide_the_below_fields(DataTable dataTable) {
		
		
	}

	@When("User select the agree Checkbox")
	public void user_select_the_agree_checkbox() {
		driver.findElement(By.name("agree")).click();

	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("User Account should be created sucessfully")
	public void user_account_should_be_created_sucessfully() {
		;
	}

	@When("User select the NewsLetter as yes radio button")
	public void user_select_the_news_letter_as_yes_radio_button() {
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();

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
