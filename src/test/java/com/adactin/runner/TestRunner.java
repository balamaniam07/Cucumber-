package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\AdactinCucumberProject\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.adactin.stepefinition",
monochrome = true,
dryRun = false,
strict = true,
plugin = {"html:Reports/Html_Report",
		"pretty",
		"json:Reports/Json_Reports.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Reports.html"
		})

public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\AdactinCucumberProject\\Driver\\chromedriver.exe");
		
//		WebDriverManager.chromedriver().setup();
		
driver = new ChromeDriver();
driver.manage().window().maximize();
	}
@AfterClass
	public static void tearDown() {
driver.close();
	}
}
