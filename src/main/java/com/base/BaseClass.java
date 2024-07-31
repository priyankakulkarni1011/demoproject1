package com.base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Properties properties;
	
	public static String projectpath= System.getProperty("user.dir");
	
	public static void launchWeb(String browsername) {
		
		switch(browsername) {
		
		case "Chrome":
			
			driver = new ChromeDriver();
			break;
			
		case "Edge":
			
			driver = new EdgeDriver();
			
			break;
			
			
		case "Firefox":
			
			driver = new FirefoxDriver();
			
			break;
			
			
		}
		
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	

}
