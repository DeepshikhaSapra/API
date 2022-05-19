package org.testing.testscripts;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.json.HTTP;
import org.testing.responseValidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import io.restassured.response.Response;

public class TC8_dummyget {
	@Test
	
	public  void TC8() throws IOException {
		
	
	
		Properties pr=Loadpropertiesfile.loadproperties("../APIFrameWork/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequest("DUMMY_GET"	, "1");
		System.out.println("Response of test case 8");
		System.out.println("status code is" +res.statusCode());
		System.out.println("response data is "+res.asString());
		Responsevalidate.statuscodeValidate(res, 200);
		//Responsevalidate.dataValidate(res, "1","dataid");
	}
}

