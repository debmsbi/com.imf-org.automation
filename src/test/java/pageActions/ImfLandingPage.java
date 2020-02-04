package pageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonUtils.CUtil;
import pageElements.ImfLandingPageElements;

public class ImfLandingPage {
	private static WebDriver webDriver;
	private ImfLandingPageElements ImfLandingPageElements;

	public ImfLandingPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		ImfLandingPageElements = new ImfLandingPageElements();
	}

	public void openLandingPage() {
		// CUtil.OpenBrowser("https://www.imf.org/external/index.htm");
		CUtil.OpenBrowser("http://imforgt.centralus.cloudapp.azure.com");
	}

	public boolean isLogoPresent() {
		// CUtil.waitUtilAtNextPage("International Monetary Fund - Homepage");
		return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.IMF_LOGO));
	}

	public void English_click_xpath() {
		CUtil.clickSelenium(By.xpath(ImfLandingPageElements.English_click_xpath));
	}

	public void clickcountriestab() {
		CUtil.clickSelenium(By.xpath(ImfLandingPageElements.COUNTRIES_TAB));
	}

	public List<WebElement> list_of_countries() {
		CUtil.waitForVisibleElement(By.xpath(ImfLandingPageElements.List_Of_Countries));
		List<WebElement> loc = webDriver.findElements(By.xpath(ImfLandingPageElements.List_Of_Countries));
		System.out.println("List of countries in I : " + loc.size());

		return loc;

	}

	public boolean Language_list_espanol() {

		CUtil.waitForVisibleElement(By.xpath(ImfLandingPageElements.Language_list_espanol));
		return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.Language_list_espanol));
	}

	public boolean Language_list_english() {

		CUtil.waitForVisibleElement(By.xpath(ImfLandingPageElements.Language_list_english));
		return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.Language_list_english));
	}

	public boolean isTabDisplayed(String text) {
		switch (text) {
		case "About":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.ABOUT_TAB));
		case "Research":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.RESEARCH_TAB));
		case "Countries":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.COUNTRIES_TAB));
		case "Capacity_Development":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.CAPACITY_DEVELOPMENT_TAB));
		case "News":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.NEWS_TAB));
		case "Videos":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.VIDEOS_TAB));
		case "Data":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.DATA_TAB));
		case "Publications":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.PUBLICATIONS_TAB));
		case "Social":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.SOCIAL_TAB));

		default:
			break;
		}
		return false;
	}

	public void clickCountrylink(String text) {

		By locator = By.xpath("//a[@title='" + text + "']");
		CUtil.waitForVisibleElement(locator);
		CUtil.click(locator);

	}

}
