package stepdefnitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginWithHeaderSteps {
	WebDriver driver;
	@Given("You are in the login page")
	public void you_are_in_the_login_page() {
		driver=new ChromeDriver();
		 driver.get("https://practice.expandtesting.com/login");
	}

	@When("You enter the below credentials")
	public void you_enter_the_below_credentials(DataTable dataTable) {
		List<Map<String,String>> keyvaluepair=dataTable.asMaps(String.class,String.class);
		String username=keyvaluepair.get(0).get("Username");
		String password=keyvaluepair.get(0).get("Password");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("you should see the home page there")
	public void you_should_see_the_home_page_there() {
		boolean status=driver.findElement(By.linkText("Logout")).isDisplayed();
	    Assert.assertTrue(status);
	}


}
