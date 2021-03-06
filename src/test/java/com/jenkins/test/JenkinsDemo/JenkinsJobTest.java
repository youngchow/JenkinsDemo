package com.jenkins.test.JenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JenkinsJobTest {

	private WebDriver driver;
	
	@Test(testName = "001", description = "Test")
	public void test1() throws Exception {
		System.out.println("Welcome to Jenkins World");
		System.out.println(driver.getTitle());
	}

	@BeforeClass
	public void initDriver() {
		//System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void initWebpage() throws Exception {
		driver.get("http://i2m.jusdascm.com/ideas/mainFrame.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void destroyDriver(){
		driver.quit();
	}
}
