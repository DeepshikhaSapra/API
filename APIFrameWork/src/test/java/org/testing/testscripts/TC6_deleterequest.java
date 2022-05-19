package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import io.restassured.response.Response;

public class TC6_deleterequest {
	@Test
	public  void testcase6() throws IOException
{
	Properties pr=Loadpropertiesfile.loadproperties("..//APIFrameWork/URI.Properties");
	HTTPMethods http=new HTTPMethods(pr);
	Response response=http.deleteRequest("QA_URI",TC2.respIdValue );
	System.out.println("Response of test case 2");
	System.out.println("status code is" +response.statusCode());
	System.out.println("response data is "+response.asString());
		
}


}
