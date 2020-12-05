package stepDefination;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepDefination {

@Given("Add Place Paylode")
public void add_place_paylode() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 
	 RestAssured.baseURI = "https://rahulshettyacademy.com";
		
	 String addPlace = new String(Files.readAllBytes(Paths.get("C:\\# All DAX\\Mission Job\\AddPlace.json")));
	 //System.out.println(addPlace);
	
	Response respose = given().queryParam("key","qaclick123").header("Content-Type","application/json").body(addPlace)
			.when().post("/maps/api/place/add/json").then().extract().response();
	
	assertEquals(respose.getStatusCode(),201);
	
	//System.out.println(respose);
}

@When("user calls {string} with Post http request")
public void user_calls_with_post_http_request(String string) {
    // Write code here that turns the phrase above into concrete actions
    
}
@Then("API Call got Success with status code {int}")
public void api_call_got_success_with_status_code(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    
}
@Then("\"Status\"response body is {string}")
public void status_response_body_is(String string) {
    // Write code here that turns the phrase above into concrete actions
    
}


}
