import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Prac {
@Test
public void test() {
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	List<Integer> a=response.jsonPath().get("data.id");
	List<String> l = response.jsonPath().get("data.email");
	//System.out.println(response.body().path("data.email", "michael.lawson@reqres.in").toString());
	String li = response.jsonPath().get("data[2]").toString();
//	System.out.println(a.get(2));
	//System.out.println(li.);
	System.out.println(li);
	
   //a.stream().map(n->n*2).forEach(n->System.out.println(n));
	//l.stream().map(n->n.toLowerCase()).forEach(n->System.out.println(n));
	//l.stream().filter(n->n.contains("lindsay.")).forEach(n->System.out.println(n));
//	l.stream().filter(n->n.isBlank()).forEach(n->System.out.println(n));
	
	
}
}
