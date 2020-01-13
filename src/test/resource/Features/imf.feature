@ui
Feature: Test the page under Coutries tab India and Ireland in imf.org url
  I want to test the page in Coutries tab India and Ireland in imf.org url

  Scenario Outline: Test 1
  
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
  
 
  

  Scenario: test 2
  
  Given I am on imf.org landing Page
  When I click Countries Tab
  Then I should view ICI logo
  
   Scenario: test 3
  
  Given I am on imf.org countries Page
  Then I should view list of countries

  
  
  
  
  