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
    // Write code here that turns the phrase above into concrete actions
    ImfLandingPage.openLandingPage();
}

@Then("I should view IMF logo")
public void i_should_view_IMF_logo() {
    // Write code here that turns the phrase above into concrete actions
   Assert.assertTrue(ImfLandingPage.isLogoPresent());
}

@Then("I should view {string}")
public void i_should_view(String text) {
    // Write code here that turns the phrase above into concrete actions

    Assert.assertTrue(ImfLandingPage.isTabDisplayed(text));
}


@When("I click Countries Tab")
public void i_click_Countries_Tab() {
    // Write code here that turns the phrase above into concrete actions
    ImfLandingPage.clickcountriestab();
}

@Then("I should view ICI logo")
public void i_should_view_ICI_logo() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertTrue(ImfLandingPage.isICILogoPresent());
}

@Given("I am on imf.org countries Page")
public void i_am_on_imf_org_countries_Page() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertTrue(ImfLandingPage.isICILogoPresent());
}

@Then("I should view list of countries")
public void i_should_view_list_of_countries() {
    // Write code here that turns the phrase above into concrete actions
    List<WebElement> listofcoun =ImfLandingPage.list_of_countries();
		System.out.println(listofcoun.get(0));
}

	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

