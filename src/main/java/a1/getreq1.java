package a1;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class getreq1 {
	@Test
	public void t1()
	{
		String pageVar="2";
		String getURL="/api/users?page=";
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httpRequest=RestAssured.given();
		System.out.println(getURL+pageVar);
		Response response = httpRequest.get(getURL+pageVar);
	    System.out.println("Response Body is => "+ response.asString());
		

	}

}
 