package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Login1 {
	WebDriver driver;
	@Given("Browser should be launched and url is working")
	public void browser_should_be_launched_and_url_is_working() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Given("User clicks on login link")
	public void user_clicks_on_login_link() {
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(string);
		driver.findElement(By.id("Password")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		WebElement logoutLink = driver.findElement(By.linkText("Log out"));
		Assert.assertTrue(logoutLink.isEnabled());
	}

}
