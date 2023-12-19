package RestAssuredScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GitHubBearerToken {
	
	
	
	@Test(priority='1')
	public void Authorization_bearertoken() {
		
		Response res=given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization", "Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		res.prettyPrint();
		
		//PMAK-647f145b421f48c-46118b03c49b626d643f2803e07856800a581137f40
		
				
	}
	@Test(priority='2')
	public void Authorization_bearertoken_specificRepo() {
		
		Response res=given().baseUri("https://api.github.com")
		.basePath("/Farrxhan/PostMan-SimpliLearn.git")
		.header("Authorization", "Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		res.prettyPrint();
		
				
	}
	
			

}
