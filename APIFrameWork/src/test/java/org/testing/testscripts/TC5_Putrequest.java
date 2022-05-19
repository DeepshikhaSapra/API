package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.responseValidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import Utilities.ParsingJasonUsingOrgJson;
import Utilities.VariableReplacement;
import Utilities.loadjsonfile;
import io.restassured.response.Response;

public class TC5_Putrequest {
	@Test
	
 public  void testcase5() throws IOException
 {
	Properties pr=Loadpropertiesfile.loadproperties("../APIFrameWork/URI.Properties");
	String jsonbody=loadjsonfile.jsondata("../APIFrameWork/src/test/java/org/testing/resources/Updatepayload.json");
	
	HTTPMethods http=new HTTPMethods(pr);
	
	Response response=http.putRequest(jsonbody, "QA_URI", TC2.respIdValue);
	
	System.out.println("Response of test case 5");
	System.out.println("Status code is"+ response.statusCode());
	System.out.println("response data is");
	System.out.println(response.asString());
	Responsevalidate.statuscodeValidate(response, 201);
	
}
}
