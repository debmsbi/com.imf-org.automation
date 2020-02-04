package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.CountryPage;
import runner.SharedDriver;

public class CountryPageSteps {

	private CountryPage CountryPage;
	private WebDriver webDriver;

	public CountryPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		CountryPage = new CountryPage(webDriver);
	}

	@Then("I should see news section on respective country page")
	public void i_should_see_news_section_on_respective_country_page() {

		Assert.assertTrue(CountryPage.isNewsDisplayed());

	}

	@Then("I should see At A Glance section is displayed on respective country page")
	public void i_should_see_At_A_Glance_section_is_displayed_on_respective_country_page() {

		Assert.assertTrue(CountryPage.isAtAGlanceDisplayed());
	}

	@When("I enter {string} in the search textbox and click enter")
	public void i_enter_in_the_search_textbox_and_click_enter(String text) {
		CountryPage.search_textbox_xpath(text);
	}

	@Then("I should view  respective country data")
	public void i_should_view_respective_country_data() {
		CountryPage.clickSearchButton();
	}

}
