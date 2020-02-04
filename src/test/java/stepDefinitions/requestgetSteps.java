/*
		 * Rest Assured coding standard for get put post delete request
		 * 
		 * given() //block 1 Request headers Parameters request cookies
		 * 
		 * when() //block 2 get(resource) post(resource) put(resources)
		 * 
		 * 
		 * then() //block3 assertion to make sure we are getting correct response
		 * 
		 * 
		 * extract() //block 4 to extract response body
		 */

package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class requestgetSteps {

	

	@Given("I perform a get request to {string}")
	public void i_perform_a_get_request_to(String string) throws IOException {

		RestAssured.baseURI = "http://dedmsapi.centralus.cloudapp.azure.com:8084";

		

	}

	@Then("The response code should be {int}")
	public void the_response_code_should_be(Integer int1) {

		// respone.statusCode(200);
		
		given().param("CountryCode", "95,99").param("Year", "2012,2011,2013,2014,2015,2016,2017,2018,2019").when()
		.get("/country-codes").then().assertThat().statusCode(200);

	}

}
