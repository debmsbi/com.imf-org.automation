@imf 
Feature: Test the page under Coutries tab India and Ireland in imf.org url 
	I want to test the page in Coutries tab India and Ireland in imf.org url

@functional @verifytabs @ui @homepage

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


		@functional @verifylanguages @ui @homepage
   Scenario: Verify different languages available in IMF.ORG homepage 

	  Given I am on imf.org landing Page 
	  Then I should view IMF logo 
		And I should view list of languages
		

		@functional @verifycountries @ui @countrypage
		Scenario: Verify list of coutries displayed when click on countries tab 
		
			Given I am on imf.org landing Page 
			When I click Countries Tab  
			Then I should view list of countries 
		
		
		@functional @verifycountrydetails @countrypage @ui
		Scenario Outline: Verify the country specific details are displayed when navigated to a particular country 
	
			Given I am on imf.org landing Page 
			When I click Countries Tab 
			When I click on "<country>" link 
			Then I should see news section on respective country page 
			And I should see At A Glance section is displayed on respective country page 
			
			Examples: 
				|    country             |  
				|    India               |
				|    Ireland             |
				
		
		@functional @verifylistofcountries @ui @countrypage
		Scenario Outline: Verify list of coutries displayed when click on countries tab 
		
			Given I am on imf.org landing Page 
			When I click Countries Tab 
			When I enter "<country>" in the search textbox and click enter
			Then I should view  respective country data
				
      Examples: 
				|    country      |  
				|    India        |
				|    Ireland      |