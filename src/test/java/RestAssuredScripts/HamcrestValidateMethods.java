package RestAssuredScripts;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HamcrestValidateMethods {
	
	// Hamcrest dependency has been added to your POM file
	// This dependency provides us many validation methods that help us to validate the response code
	
	// equalTo() Hamcrest method
	
	@Test(priority='1')
	public void ValidateResponseBody() {
		
		String PMapikey="PMAK-6578994039dea33d5ccc9a6c-7c942880db242cb4014f6e9685fe13f5e2";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		//fetch the resonse body and validate if response includes correct values or not
		
		.body("workspaces[3].id", equalTo("4b7363cc-f0be-4079-9997-259b5587f69a"),
				"workspaces[3].name", equalTo("Phase-3-Postman"),
				"workspaces[3].type", equalTo("personal"));
			  	
	}

	@Test(priority='2')
	public void ValidateResponseBody_equalTo() {
		
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/farhan")
		.when().get()
		.then().statusCode(200)
		//fetch the response body and validate if response includes correct values or not
		
		.body("username", equalTo("farhan11"),
			 ("firstName"),equalTo("farhan"),
			 ("lastName"),equalTo("belgaumi"),
			 ("email"),equalTo("Positive@Attitude.com"),
			 ("userStatus"),equalTo(1));
			 
			 		
	}
	@Test(priority='3')
	public void ValidateResponseBody_hasItems() {
		
	String PMapikey="PMAK-6578994039dea33d5ccc9a6c-7c942880db242cb4014f6e9685fe13f5e2";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		// fetch the response body and validate if response includes correct values or not
		
		.body("workspaces.name", hasItems("Team Workspace", "My Workspace", "Workspace-2"),
			 "workspaces.type", hasItems("team", "personal"));
		
		
	}
	
	

}
