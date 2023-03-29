package com.tnp.ninja.qa.hooks;


import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.tnp.ninja.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver;
	
	@Before
	public void setup() {
		
		DriverFactory.InitilizeBrowser("chrome");
		driver= DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.tutorialsninja.com/demo/");
		
	}

	@After
	public void teardown() {
		driver.quit();
	}

}
