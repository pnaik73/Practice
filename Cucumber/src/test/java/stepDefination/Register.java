package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Register {
	WebDriver driver;
	@Given("Browser is launched")
	public void browser_is_launched() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Given("navigated to URL")
	public void navigated_to_url() {
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("User clicks on register button")
	public void user_clicks_on_register_button() {
	   driver.findElement(By.linkText("Register")).click();
	}

	@Then("Register page should be displayed")
	public void register_page_should_be_displayed() {
		WebElement registerButton = driver.findElement(By.xpath("//h1[text()='Register']"));
	    Assert.assertTrue(registerButton.isDisplayed());
	}
}
