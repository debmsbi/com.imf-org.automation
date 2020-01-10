package pageActions;

import org.openqa.selenium.WebDriver;

import commonUtils.CUtil;
import pageElements.GoogleResutlPageElements;

public class GoogleResutlPage {
	private static WebDriver webDriver;
	private GoogleResutlPageElements GoogleResutlPageElements;

	public GoogleResutlPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		GoogleResutlPageElements = new GoogleResutlPageElements();
	}

	public boolean verifyPageTitle() {
		return CUtil.waitUtilAtNextPage(GoogleResutlPageElements.Page_Title);
	}
}
