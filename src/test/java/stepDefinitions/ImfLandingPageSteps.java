package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.ImfLandingPage;
import runner.SharedDriver;

public class ImfLandingPageSteps {

	private ImfLandingPage ImfLandingPage;
	private WebDriver webDriver;

	public ImfLandingPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ImfLandingPage = new ImfLandingPage(webDriver);
	}

	@Given("I am on imf.org landing Page")
	public void i_am_on_imf_org_landing_Page() {

		ImfLandingPage.openLandingPage();
	}

	@Then("I should view IMF logo")
	public void i_should_view_IMF_logo() {
		Assert.assertTrue(ImfLandingPage.isLogoPresent());

	}

	@Then("I should view list of languages")
	public void i_should_view_list_of_languages() throws InterruptedException {

		ImfLandingPage.English_click_xpath();

		Assert.assertTrue(ImfLandingPage.Language_list_english());
		Assert.assertTrue(ImfLandingPage.Language_list_espanol());

	}

	@Then("I should view {string}")
	public void i_should_view(String text) {

		Assert.assertTrue(ImfLandingPage.isTabDisplayed(text));
	}

	@When("I click Countries Tab")
	public void i_click_Countries_Tab() {
		ImfLandingPage.clickcountriestab();
	}

	@Then("I should view list of countries")
	public void i_should_view_list_of_countries() {

		List<WebElement> listofcoun = ImfLandingPage.list_of_countries();
		Assert.assertEquals(listofcoun.get(0).getText(), "Iceland");
		Assert.assertEquals(listofcoun.get(1).getText(), "India");
		Assert.assertEquals(listofcoun.get(2).getText(), "Indonesia");
		Assert.assertEquals(listofcoun.get(3).getText(), "Iran, Islamic Republic of");
		Assert.assertEquals(listofcoun.get(4).getText(), "Iraq");
		Assert.assertEquals(listofcoun.get(5).getText(), "Ireland");
		Assert.assertEquals(listofcoun.get(6).getText(), "Israel");
		Assert.assertEquals(listofcoun.get(7).getText(), "Italy");

	}

	@When("I click on {string} link")
	public void i_click_on_link(String text) {

		ImfLandingPage.clickCountrylink(text);

	}

}
