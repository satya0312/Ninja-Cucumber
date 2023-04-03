package com.tnp.ninja.qa.stepdefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tnp.ninja.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;


	@Given("User Navigate to Register page")
	public void user_navigate_to_register_page() {
		
		driver= DriverFactory.getDriver();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

	}

	@When("User provide the below fields")
	public void user_provide_the_below_fields(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		driver.findElement(By.name("firstname")).sendKeys(dataMap.get("FirstName"));
		driver.findElement(By.name("lastname")).sendKeys(dataMap.get("LastName"));
		driver.findElement(By.name("email")).sendKeys(dataMap.get("E-Mail"));
		driver.findElement(By.name("telephone")).sendKeys(dataMap.get("Telephone"));
		driver.findElement(By.name("password")).sendKeys(dataMap.get("Password"));
		driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("Password"));
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
		String ActualSucessMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
	Assert.assertTrue(ActualSucessMessage.contains("Your Account Has Been Created!"));
	}

	@When("User select the NewsLetter as yes radio button")
	public void user_select_the_news_letter_as_yes_radio_button() {
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();

	}

	@Then("User should get a proper warning message about duplicate account")
	public void user_should_get_a_proper_warning_message_about_duplicate_account() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: E-Mail Address is already registered!"));

	}

	@When("User dont enter any fields")
	public void user_dont_enter_any_fields() {

	}

	@Then("User should get a proper warning message about Manditatory fields")
	public void user_should_get_a_proper_warning_message_about_manditatory_fields() {
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id=\"input-firstname\"]/following-sibling::div")).getText().contains("First Name must be between 1 and 32 characters!"), "FirstName warningmessgae is not displayed");
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id=\"input-lastname\"]/following-sibling::div")).getText().contains("Last Name must be between 1 and 32 characters!"),"LastName warningmessgae is not displayed");
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id=\"input-email\"]/following-sibling::div")).getText().contains("Last Name must be between 1 and 32 characters!"),"E-Mail Address does not appear to be valid!");

	}

}
