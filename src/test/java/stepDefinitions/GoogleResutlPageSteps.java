package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import pageActions.GoogleResutlPage;
import runner.SharedDriver;

public class GoogleResutlPageSteps {

	private GoogleResutlPage GoogleResutlPage;
	private WebDriver webDriver;

	public GoogleResutlPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		GoogleResutlPage = new GoogleResutlPage(webDriver);
	}

	@Then("I should be on result Page")
	public void i_should_be_on_result_Page() {
		Assert.assertTrue(GoogleResutlPage.verifyPageTitle());
	}

}
