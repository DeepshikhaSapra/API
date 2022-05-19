package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import io.restassured.response.Response;

public class TC3 {
	@Test
	public  void testcase3() throws IOException
	{
		Properties pr=Loadpropertiesfile.loadproperties("..//APIFrameWork/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequest("QA_URI",TC2.respIdValue );
		
		System.out.println("Response of test case 3");
		System.out.println("status code is" +res.statusCode());
		System.out.println("response data is "+res.asString());
		Responsevalidate.statuscodeValidate(res, 200);
		Responsevalidate.dataValidate(res, "deep", "firstname");
			
	}

}
