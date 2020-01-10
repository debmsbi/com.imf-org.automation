package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import runner.SharedDriver;
import pageActions.ImfLandingPage;

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

	@Then("I should see IMF logo")
	public void i_should_see_IMF_logo() {
	  Assert.assertTrue(ImfLandingPage.isLogoPresent());
	}

	@Then("I should see {string} is present")
	public void i_should_see_is_present(String text) {
	    Assert.assertTrue(ImfLandingPage.isTabDisplayed(text));
	}
	
	@Then("I should verify Countries Tab is clickable")
	public void i_should_verify_Countries_Tab_is_clickable() {
	    // Write code here that turns the phrase above into concrete actions
		ImfLandingPage.clickcountriestab();
	}

	@Then("I should see ICI logo")
	public void i_should_see_ICI_logo() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(ImfLandingPage.isICILogoPresent());
	}
	
}
