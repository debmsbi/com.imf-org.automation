package pageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonUtils.CUtil;
import pageElements.CountryPageElements;

public class CountryPage {

	private static WebDriver webDriver;
	private CountryPageElements CountryPageElements;

	public CountryPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		CountryPageElements = new CountryPageElements();
	}

	public void search_textbox_xpath(String text) {

		CUtil.type(By.xpath(CountryPageElements.search_textbox_xpath), text);
	}

	public void clickSearchButton() {
		CUtil.click(By.xpath(CountryPageElements.search_button_xpath));
	}

	public boolean isNewsDisplayed() {

		boolean out = false;
		try {
			CUtil.waitForVisibleElement(By.xpath(CountryPageElements.news_section_xpath));
			CUtil.javaScrollIntoView(By.xpath(CountryPageElements.news_section_xpath));

		} catch (Exception e) {
			// TODO: handle exception
		}
		List<WebElement> list = webDriver.findElements(By.xpath(CountryPageElements.news_section_xpath));

		if (list.size() != 0) {

			for (WebElement webElement : list) {

				CUtil.javascript_highlight(webElement, "green", "dotted", 3);
				out = true;

			}

		}

		return out;
	}

	public boolean isAtAGlanceDisplayed() {

		boolean out = false;

		try {
			CUtil.waitForVisibleElement(By.xpath(CountryPageElements.ataglance_section_xpath));
			CUtil.javaScrollIntoView(By.xpath(CountryPageElements.ataglance_section_xpath));

		} catch (Exception e) {
			// TODO: handle exception
		}

		List<WebElement> list = webDriver.findElements(By.xpath(CountryPageElements.ataglance_section_xpath));

		if (list.size() != 0) {

			for (WebElement webElement : list) {

				CUtil.javascript_highlight(webElement, "green", "dotted", 3);
				out = true;

			}

		}

		return out;

	}

}
