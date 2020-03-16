package stepDefinitions;

//import java.util.ArrayList;
//import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//import org.junit.BeforeClass;

import static utils.utils.getIndex;
import pages.HomePage;

public class Steps {
	
	WebDriver driver;
	HomePage homepage;
	
	/*
	@BeforeClass
	public void setUp() {
		String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		homepage = new HomePage(driver);
	}
	*/
	
	@Given("^user is already on the home page$")
	public void user_is_already_on_the_home_page() throws Throwable { 
		String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		homepage = new HomePage(driver);
		driver.get("http://localhost:3000/");
	}

	@When("^user clicks on render the challenge$")
	public void user_clicks_on_render_the_challenge() throws Throwable {
		homepage.clickRender();
	}

	@When("^submits first challenge$")
	public void submits_first_challenge() throws Throwable {
		WebElement row1 = homepage.getRow1();
		int indexChallenge=getIndex(row1);
		
		if (indexChallenge==0)
			homepage.enterChallange1("null");
		else
			homepage.enterChallange1(Integer.toString(indexChallenge));
		}

	@When("^submits second challenge$")
	public void submits_second_challenge() throws Throwable {
		WebElement row2 = homepage.getRow2();
		int indexChallenge=getIndex(row2);
		
		if (indexChallenge==0)
			homepage.enterChallange2("null");
		else
			homepage.enterChallange2(Integer.toString(indexChallenge));
	}

	@When("^submits third challenge$")
	public void submits_third_challenge() throws Throwable {
		
		WebElement row3 = homepage.getRow3();
		int indexChallenge=getIndex(row3);
		
		if (indexChallenge==0)
			homepage.enterChallange3("null");
		else
			homepage.enterChallange3(Integer.toString(indexChallenge));
		
	}

	@When("^enters name$")
	public void enters_name() throws Throwable {
		homepage.enterName("Huseyin");
	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		homepage.clickSubmit();
	}

	@Then("^Congratulations alert appeared$")
	public void congratulations_alert_appeared() throws Throwable {
		boolean testResult=homepage.testResult();
		
		Assert.assertTrue(testResult);
		homepage.clickCloseButton();
	}
}
