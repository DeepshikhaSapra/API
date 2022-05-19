package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	Properties pr;
	public HTTPMethods (Properties pr)
	{
		this.pr=pr;
	}
public Response PostRequest(String jsonrequestbody,String URIkey)
{
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(jsonrequestbody)
	.when()
	.post(pr.getProperty(URIkey));
	
	return res;
}
public Response GetRequest(String urikey, String idvalue)
{
	String base=pr.getProperty(urikey);
	String uri=base+"/"+idvalue;
	Response res=
	given ()
	.contentType(ContentType.JSON)
	.when()
	.get(uri);
	return res;
	
}

public Response GetAllRequest(String urikey)
{
	
	Response res=
	given ()
	.contentType(ContentType.JSON)
	.when()
	.get(pr.getProperty(urikey));
	
	return res;
}

public Response putRequest(String jsonrequestbody,String URIkey,String pathparameter)
{
	String uri=pr.getProperty(URIkey)+"/"+pathparameter;
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(jsonrequestbody)
	.when()
	.put(uri);
	
	return res;
	
}
public Response deleteRequest(String urikey, String idvalue)
{
	String base=pr.getProperty(urikey);
	String uri=base+"/"+idvalue;
	Response res=
	given ()
	.contentType(ContentType.JSON)
	.when()
	.delete(uri);
	System.out.println("Response of test case 6");
	System.out.println("status code is" +res.statusCode());
	System.out.println("response data is "+res.asString());
	return res;
}
}
