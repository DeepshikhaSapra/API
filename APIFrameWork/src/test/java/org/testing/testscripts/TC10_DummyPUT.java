package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import Utilities.loadjsonfile;
import io.restassured.response.Response;

public class TC10_DummyPUT {
	@Test
	public  void TC10()  throws IOException {
		Properties pr=Loadpropertiesfile.loadproperties("../APIFrameWork/URI.Properties");
		String jsonbody=loadjsonfile.jsondata("../APIFrameWork/src/test/java/org/testing/resources/payload1.json");
		HTTPMethods http=new HTTPMethods(pr);
		Response response=http.putRequest(jsonbody, "DUMMY_PUT", "32");
		System.out.println(response.asString());
		System.out.println(response.statusCode());
		
	}

}