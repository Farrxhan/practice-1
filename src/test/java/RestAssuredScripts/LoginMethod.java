package RestAssuredScripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class LoginMethod {
	
	
	@Test
	public void LoggingRestAssured() {
		
		String PMapikey = "PMAK-647f145b421f48c-46118b03c49b626d643f2803e07856800a581137f40";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PMapikey)
		.when().get()
		.then().log().all();
		//.then().log().headers();
		//.then().log().ifError();
		//.then().statusCode(200).log().cookies();
		
		
	}

}