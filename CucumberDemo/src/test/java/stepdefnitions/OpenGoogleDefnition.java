package stepdefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefnition {
	WebDriver driver;
	@Given("user is entering google.co.in")
	public void user_is_entering_google_co_in() {
	    driver=new ChromeDriver();
	    driver.get("http://www.google.co.in");
	}

	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String string) {
		driver.findElement(By.id("APjFqb")).sendKeys(string);
	}

	@When("enter the return key")
	public void enter_the_return_key() {
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
	}

	@Then("the user should see the search results")
	public void the_user_should_see_the_search_results() {
	    boolean status=driver.findElement(By.partialLinkText("agni")).isDisplayed();
	    if(status) {
	    	System.out.println("Result Displayed");
	    }
	}



}
