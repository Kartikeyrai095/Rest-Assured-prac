import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Post_test {
	@Test
	public void test1() {
//		Map<String,Object> m = new HashMap<String,Object>();
//		m.put("id", 1);
//		m.put("name","kartikey");
		
		RestAssured.baseURI ="https://reqres.in/";
		RequestSpecification r = RestAssured.given();
		JSONObject a = new JSONObject();
		a.put("id", 2);
		a.put("name", "kk");
		r.header("Content-Type","application/json");
		r.body(a.toJSONString());
		Response response = r.post("api/users");
		System.out.println(response.statusLine());
		
		
	}

}
