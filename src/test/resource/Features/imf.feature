@imf
Feature: Test the page under Coutries tab India and Ireland in imf.org url
  I want to test the page in Coutries tab India and Ireland in imf.org url

@functional @ui
  Scenario Outline: Verify different tabs in IMF.ORG homepage
  
  Given I am on imf.org landing Page
  Then I should view IMF logo
  And I should view "<Tabs>"
  
  Examples: 
  |    Tabs                  |  
  |    About                 |
  |    Research              | 
  |    Countries             | 
  |    Capacity_Development  | 
  |    News                  |  
  |    Videos                |     
  |    Data                  |  
  |    Publications          |  
  |    Social                |  
  
 
  
@functional @ui
  Scenario: Verify IMF COUNTRY INFORMATION logo when click on countries tab 
  
  Given I am on imf.org landing Page
  When I click Countries Tab
  Then I should view ICI logo
  
  @functional @ui
   Scenario: Verify the list of countries displayed in countries tab
  
  Given I am on imf.org countries Page
  Then I should view list of countries

   @functional @ui
   Scenario Outline: Verify the data in the page displayed when clicked on India,Ireland country links
   
  Given I click on "<Countries>" country
  When I am in country India Page
  Then I should view real GDP growth under Country Data section
  And I should view graph under under Country Data section
  And I should view enter text search field under Country Data section
   
  
  Examples: 
  | Countries  |  
  | India      |
  | Ireland    |
  
  
  @functional @ui
   Scenario Outline: Verify the data in the page displayed when user enter India,Ireland in the search text box and click search button
  
  Given I enter "<Countries text>" in text box search and enter search button
  When I am in country search Page
  And I click on "<Countries IMF>" link
  Then I should view "<Country>" Page
  
  Examples: 
  | Countries text  | Countries IMF       | Country   | 
  | India           | India and the IMF   | India     |
  | Ireland         | Ireland and the IMF | Ireland   |

  