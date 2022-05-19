package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import io.restassured.response.Response;

public class TC11_DummyDelete {
	@Test
	public void TC11() throws IOException {
		Properties pr=Loadpropertiesfile.loadproperties("../APIFrameWork/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response Response=http.deleteRequest("DUMMY_DELETE", "2");
		System.out.println(Response.asString());
		System.out.println(Response.statusCode());
	}

}
