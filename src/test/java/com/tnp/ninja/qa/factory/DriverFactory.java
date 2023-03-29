package com.tnp.ninja.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver =null;
	
	public static void InitilizeBrowser(String browsername) {
		
		
		switch(browsername) {
		case "chrome":
			driver =new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			
		}
				
	}
	
	public static WebDriver getDriver(){
		return driver;	
		
	}

}
