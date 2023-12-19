package RestAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script01Setupcheck {
	
	@Test
	public void SetupCheck() {
		Response res= RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusCode());
		
	}

}
