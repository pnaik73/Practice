package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CommunityPoll {
	WebDriver driver;
	@Given("Browser should be launched")
	public void browser_should_be_launched() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("navigated to correct URL")
	public void navigated_to_correct_url() {
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("User selects good option")
	public void user_selects_good_option() {
	   driver.findElement(By.xpath("//input[@id=\"pollanswers-2\"]")).click();
	}

	@When("User clicks on vote button")
	public void user_clicks_on_vote_button() {
	    driver.findElement(By.xpath("//input[@value=\"Vote\"]")).click();
	}

	@Then("He should be able to vote")
	public void he_should_be_able_to_vote() {
	  System.out.println("====Done=====");
	}

}
