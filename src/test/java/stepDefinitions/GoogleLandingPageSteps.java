package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageActions.GoogleLandingPage;
import runner.SharedDriver;

public class GoogleLandingPageSteps {

	private GoogleLandingPage GoogleLandingPage;
	private WebDriver webDriver;

	public GoogleLandingPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		GoogleLandingPage = new GoogleLandingPage(webDriver);
	}

	@Given("I am on Google landing Page")
	public void i_am_on_Google_landing_Page() {
		GoogleLandingPage.openLandingPage();
	}

	@When("I enter keyword as {string} to search")
	public void i_enter_keyword_as_to_search(String text) {
		GoogleLandingPage.typeKeyword(text);
	}

	@When("I click Google Search button")
	public void i_click_Google_Search_button() {
		GoogleLandingPage.clickSearchButton();
	}

}
