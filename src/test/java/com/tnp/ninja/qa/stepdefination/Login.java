package com.tnp.ninja.qa.stepdefination;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tnp.ninja.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;


	@Given("User navigate to Login page")
	public void user_navigate_to_Login_page() {
		driver= DriverFactory.getDriver();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

	}

	@When("User enters Valid Email {string} in Email Field")
	public void user_enters_Valid_Email_in_Email_Field(String email) {
		driver.findElement(By.id("input-email")).sendKeys(email);

	}

	@When("User enters Valid Password {string} in password field")
	public void user_enters_Valid_Password_in_password_field(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);

	}

	@When("user click on Login button")
	public void user_click_on_Login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("User should get login in successfully")
	public void user_should_get_login_in_successfully() {

	}

	@Then("User should get login in sucessfully")
	public void user_should_get_login_in_sucessfully() {
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());

	}

	@When("User enter the Invaild Email {string} in Email field")
	public void user_enter_the_invaild_email_in_email_field(String InvalidEmail) {
		driver.findElement(By.id("input-email")).sendKeys(InvalidEmail);

	}

	@When("User enter the Invalid Password {string} in password field")
	public void user_enter_the_invalid_password_in_password_field(String InvalidPassword) {
		driver.findElement(By.id("input-password")).sendKeys(InvalidPassword);

	}

	@Then("User should get a proper warning message about crediantail mismatch")
	public void user_should_get_a_proper_warning_message_about_crediantail_mismatch() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));

	}

	@When("user not provided any email in email field")
	public void user_not_provided_any_email_in_email_field() {
		driver.findElement(By.id("input-email")).sendKeys("");

	}

	@When("User not provided any password in Password field")
	public void user_not_provided_any_password_in_password_field() {
		driver.findElement(By.id("input-password")).sendKeys("");

	}

}
