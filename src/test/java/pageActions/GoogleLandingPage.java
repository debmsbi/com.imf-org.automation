package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtils.CUtil;
import pageElements.GoogleLandingPageElements;

public class GoogleLandingPage {
	private static WebDriver webDriver;
	private GoogleLandingPageElements GoogleLandingPageElements;

	public GoogleLandingPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		GoogleLandingPageElements = new GoogleLandingPageElements();
	}

	public void openLandingPage() {
		webDriver.get("https://www.google.co.in/");
	}

	public void typeKeyword(String text) {
		CUtil.type(By.xpath(GoogleLandingPageElements.GoogleTextSearchBoxXpath), text);
	}

	public void clickSearchButton() {
		CUtil.click(By.xpath(GoogleLandingPageElements.SearchButtonXpath));
	}

}
