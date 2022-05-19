package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import Utilities.ParsingJasonUsingOrgJson;
import io.restassured.response.Response;


public class TC4_GetAll {
	@Test
	public  void TC4 () throws IOException {
	
		Properties pr=Loadpropertiesfile.loadproperties("..//APIFrameWork/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetAllRequest("QA_URI");
		System.out.println("Response of test case 4");
		System.out.println("status code is" +res.statusCode());
		System.out.println("response data is "+res.asString());
		ParsingJasonUsingOrgJson.parsedata(res.asString(), "id");
		Responsevalidate.statuscodeValidate(res, 200);
		
	}

}
