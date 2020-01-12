package pageActions;

import java.util.Iterator;
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
		CUtil.OpenBrowser("https://www.imf.org/external/index.htm");
	}

	public boolean isLogoPresent() {
		CUtil.waitUtilAtNextPage("International Monetary Fund - Homepage");
		return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.IMF_LOGO_XPATH));
	}
	
	public void clickcountriestab() {
		CUtil.clickSelenium(By.xpath(ImfLandingPageElements.COUNTRIES_TAB_XPATH));	
	}
	
	public boolean isICILogoPresent() {
		CUtil.waitUtilAtNextPage("IMF Country Information");
		return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.ICI_LOGO_XPATH));
	}
	
	public List<WebElement> list_of_countries() {
		List<WebElement> loc = webDriver.findElements(By.xpath(ImfLandingPageElements.List_Of_Countries_XPATH));

		Iterator<WebElement> itr = loc.iterator();
		while(itr.hasNext()) {
		    System.out.println(itr.next());
		}
		return loc;
		
	}
	

	public boolean isTabDisplayed(String text) {
		switch (text) {
		case "About":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.ABOUT_TAB_XPATH));
		case "Research":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.RESEARCH_TAB_XPATH));
		case "Countries":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.COUNTRIES_TAB_XPATH));
		case "Capacity_Development":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.CAPACITY_DEVELOPMENT_TAB_XPATH));
		case "News":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.NEWS_TAB_XPATH));
		case "Videos":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.VIDEOS_TAB_XPATH));
		case "Data":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.DATA_TAB_XPATH));
		case "Publications":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.PUBLICATIONS_TAB_XPATH));
		case "Social":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.SOCIAL_TAB_XPATH));
		/*case "English":
			return CUtil.isDisplayed(By.xpath(ImfLandingPageElements.ENGLISH_TAB_XPATH));*/

		default:
			break;
		}
		return false;
	}

}
