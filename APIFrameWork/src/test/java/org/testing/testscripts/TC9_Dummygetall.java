package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import io.restassured.response.Response;

public class TC9_Dummygetall {
	@Test

	public  void TC9() throws IOException {
		Properties pr=Loadpropertiesfile.loadproperties("..//APIFrameWork/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetAllRequest("DUMMY_GETALL");
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		Responsevalidate.statuscodeValidate(res, 200);
		
	}
}
