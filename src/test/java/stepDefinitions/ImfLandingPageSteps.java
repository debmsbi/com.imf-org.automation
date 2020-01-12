package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	@Then("I click Countries Tab")
	public void i_should_verify_Countries_Tab_is_clickable() {
	    // Write code here that turns the phrase above into concrete actions
		ImfLandingPage.clickcountriestab();
	}

	@Then("I should see ICI logo")
	public void i_should_see_ICI_logo() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(ImfLandingPage.isICILogoPresent());
	}
	
	@Given("I am on imf.org countries Page")
	public void i_am_on_imf_org_countries_Page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(ImfLandingPage.isICILogoPresent());
	}

	@Then("I see list of countries")
	public void i_see_list_of_countries() {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> listofcoun =ImfLandingPage.list_of_countries();
		System.out.println(listofcoun.get(0));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
