package pageElements;

import org.openqa.selenium.By;

public class ImfLandingPageElements {

	public String Imftitle = "//*[@id='header']/div[1]/div[2]/a[2]/img";
	public String ImfHomePageTabs = "//*[@id='header']/div[2]/div/div[2]/div/div/ul/li/a";
	public String IMF_LOGO = "//img[contains(@src,'imf-logo-eng-sep2019-update.png')]";
	public String ABOUT_TAB = "(//a[@href='/ABOUT'])[1]";
	public String RESEARCH_TAB = "(//a[@href='/RESEARCH'])[1]";
	public String COUNTRIES_TAB = "(//a[@href='/COUNTRIES'])[1]";
	public String CAPACITY_DEVELOPMENT_TAB = "(//a[@href='/CAPACITY-DEVELOPEMENT'])[1]";
	public String NEWS_TAB = "(//a[@href='/NEWS'])[1]";
	public String VIDEOS_TAB = "(//a[@href='/VIDEOS'])[1]";
	public String DATA_TAB = "(//a[@href='/DATA'])[1]";
	public String PUBLICATIONS_TAB = "(//a[@href='/PUBLICATIONS'])[1]";
	public String SOCIAL_TAB = "(//a[@href='/SOCIAL'])[1]";
	public String ICI_LOGO = "(//div[@id='content']//a)[1]";

	public String List_Of_Countries = "(//div[contains(text(),'I')])[2]/following-sibling::ul/div";

	// public String Language_list =
	// "//ul[@class='language-selector-item-container']/li/a";

	public String Language_list_english = "//li[contains(@class,'language-selector-item is-active')]/a";

	public String Language_list_espanol = "//a[contains(@href,'/es-MX')]";

	public static By country_ataglance = By.xpath("(//div[@class='field-title'])[2]");

	public String English_click_xpath = "//div[@class='language-selector-select-item']";

}
