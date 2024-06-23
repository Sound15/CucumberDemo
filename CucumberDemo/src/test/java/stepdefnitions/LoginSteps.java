package stepdefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://practice.expandtesting.com/login");
	}

	@When("when the user enters the valid {string} and {string}")
	public void when_the_user_enters_the_valid_username_and_password(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("the user should be navigated to the home page")
	public void the_user_should_be_navigated_to_the_home_page() {
	    boolean status=driver.findElement(By.linkText("Logout")).isDisplayed();
	    Assert.assertTrue(status);
	}



}
