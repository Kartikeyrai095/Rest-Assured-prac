import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Patch_test {
	@Test
	public void test() {
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		JSONObject a = new JSONObject();
		a.put("id", 4);
		a.put("Name", "Kartikey");
		r.header("Content-Type","application/json");
		r.body(a.toJSONString());
		Response response = r.patch("api/users/2");
		System.out.println(response.getStatusLine());
	}

}
