package stepdefnitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginWithoutHeaderSteps {
	WebDriver driver;
	@Given("You are on the login page")
	public void you_are_on_the_login_page() {
		 driver=new ChromeDriver();
		 driver.get("https://practice.expandtesting.com/login");
	}

	@When("You enter below credentials")
	public void you_enter_below_credentials(DataTable dataTable) {
	    List<String> credentials=dataTable.asList(String.class);
	    String username=credentials.get(0);
	    String password=credentials.get(1);
	    driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("you should see the home page")
	public void you_should_see_the_home_page() {
		boolean status=driver.findElement(By.linkText("Logout")).isDisplayed();
	    Assert.assertTrue(status);
	}


}
