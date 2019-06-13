package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	static WebDriver driver;
	
	@Given("user is in facebook page")
	public void user_is_in_facebook_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya\\eclipse-workspace\\divya\\FacebookCucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		}

	@When("user enters username as {string} password as {string}")
	public void user_enters_username_as_password_as(String arg1, String arg2) {
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.id("u_0_a")).click(); 
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
	    driver.quit();
	}



}
