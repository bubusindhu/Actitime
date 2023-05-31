package a1;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class Respones 
{
	
	
	
		@Test
		public void t2()
		{
		RestAssured.baseURI= "https://reqres.in";
		RequestSpecification request = RestAssured.given();
		Response response =  request.get("/api/user?page=2");
		//ResponseBody bdy=response.getBody();
		//String  resBdy=bdy.asString();
		JsonPath jp = response.jsonPath ();
		Integer out = jp.get ("page");
		System.out.println("page received from Response"+out);

	}

}
