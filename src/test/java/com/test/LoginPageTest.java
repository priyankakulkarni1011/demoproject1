package com.test;

import org.testng.annotations.BeforeClass;

import com.base.BaseClass;

public class LoginPageTest extends BaseClass {
	@BeforeClass
	public void setup(String browser) {
		
		launchWeb(browser);
	}
	
	

}
