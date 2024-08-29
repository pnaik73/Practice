package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Login {
	WebDriver driver;
	@Given("Browser is launched and navigated to URl")
	public void browser_is_launched_and_navigated_to_u_rl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sumanthchinivar16@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Rowdy@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
		WebElement logoutLink = driver.findElement(By.linkText("Log out"));
		Assert.assertTrue(logoutLink.isEnabled());
	}
}
