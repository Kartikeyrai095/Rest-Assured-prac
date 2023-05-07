import org.testng.Assert;
import org.testng.annotations.Test;

import  io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hamcrest.Matchers.*;

public class GET_test001 {
	@Test
	public void test() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
//		System.out.println(response.asString());
//		System.out.println(response.getBody().asString());
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusLine());
//		System.out.println(response.getHeader("content-type"));
//		System.out.println(response.getTime());
//		int statuscode = response.getStatusCode();
//		Assert.assertEquals(statuscode, 200);
//		int id = response.jsonPath().get("data.id[0]");
//		Assert.assertEquals(id, 7);
		//System.out.println(response.body().asPrettyString());
		List<Integer> a = response.jsonPath().get("data.id");
		int count = 0;
		for(int i =0 ;i<a.size();i++) {
			if(a.get(i)==8) {
				count = i;
			
			}
		}
		System.out.println(count);
		String b = response.jsonPath().get("data.first_name[1]");
		System.out.println(b);
		
		//response.jsonPath().get("data.id");
		//System.out.println(response.jsonPath().with("first_name").getInt("data.id"));
		
		response.body().path("data.first_name", "Michael");
		//response.jsonPath().param("id", 1);
		//System.out.println(response.jsonPath().param("id", 7).get("data"));
	
	
		
	}
//	@Test
//	public void test001() {
//		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
//		.body("data.id",hasItems(7,9,8));
//		
//		given().config(RestAssured.config().jsonConfig(null))
//	}
	
}
