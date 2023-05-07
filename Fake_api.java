import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Fake_api {
	//@Test
	public void test_get() {
		RestAssured.baseURI="http://localhost:3000";
		//Response response = RestAssured.get("/users");
		RequestSpecification r = RestAssured.given();
		Response res = r.queryParams("id", 1).get("/users"); //passing paramters
		System.out.println(res.getStatusCode());
		System.out.println(res.andReturn().asPrettyString());
	}
	
	//@Test
	public void test_post() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification r = RestAssured.given();
		JSONObject a = new JSONObject();
		a.put("title", "new");
		a.put("author", "newone");
		r.header("Content-Type","application/json");
		r.body(a.toJSONString());
		Response response = r.post("/users");
		System.out.println(response.andReturn().asPrettyString());
	}
	
//	@Test
	public void test_patch() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification r = RestAssured.given();
		JSONObject a = new JSONObject();
		a.put("title", "new1");
		r.header("Content-Type","application/json");
		r.body(a.toJSONString());
		Response response = r.patch("/users/1");
	}
	@Test
	public void test_put() {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification r = RestAssured.given();
		JSONObject a = new JSONObject();
		a.put("title", "Ara");
		a.put("author", "Kartikey");
		r.header("Content-Type","application/json");
		r.body(a.toJSONString());
		Response response = r.patch("/users/1");
		
	}

}
