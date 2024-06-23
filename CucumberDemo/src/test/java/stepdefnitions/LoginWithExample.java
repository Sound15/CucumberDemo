package stepdefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginWithExample {
	WebDriver driver;
	@Given("Proceed to login page")
	public void proceed_to_login_page() {
		driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("clicked login")
	public void clicked_login() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("you should see the home page there in the web")
	public void you_should_see_the_home_page_there_in_the_web() {
		boolean status=driver.findElement(By.linkText("Logout")).isDisplayed();
	    Assert.assertTrue(status);
	}



}
