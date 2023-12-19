package RestAssuredScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class PayLoadJSON {

		@Test
		public void PostUsingJSON() {
			JSONObject body = new JSONObject();
			body.put("name","Farhan");
			body.put("salary","5600000");
			body.put("age","23");
			
			int responseid = RestAssured
			.given()
			.baseUri("https://dummy.restapiexample.com/api/v1/create")
			.contentType(ContentType.JSON)
			.body(body.toString())
			.when().post()
			.then()
			.statusCode(200)
			.body("data.name", equalTo("Farhan"))
			.extract().path("data.id");
			System.out.println(responseid);
			
		}
}
