@imf 
Feature: Test the rest apis in imf.org 
	I want to test the rest apis in imf.org
		
			
		@functional @changeindex @api 
		Scenario: Verify the response on the get request country change index URL 
 
			Given  I perform a get request to "http://dedmsapi.centralus.cloudapp.azure.com:8084/country-codes?CountryCode=95,99&Year=2012,2011,2013,2014,2015,2016,2017,2018,2019"
			Then The response code should be 200
			
				
				
			