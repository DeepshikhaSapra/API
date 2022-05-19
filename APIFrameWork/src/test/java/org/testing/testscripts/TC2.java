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

public class TC2 {
	
	static String respIdValue;
	@Test
	public  void testcase2() throws IOException {
		Properties pr=Loadpropertiesfile.loadproperties("../APIFrameWork/URI.Properties");
		String jsonbody=loadjsonfile.jsondata("../APIFrameWork/src/test/java/org/testing/resources/requestpayload.json");
		Random ran=new Random();
		Integer IDValue=ran.nextInt();
		jsonbody=VariableReplacement.replacevalue(jsonbody, "id", IDValue.toString());
		//System.out.println("please enter first name");
		//Scanner sc=new Scanner(System.in);
		//String firstname=sc.next();
		jsonbody=VariableReplacement.replacevalue(jsonbody, "firstname", "Deepshikha");
		HTTPMethods http=new HTTPMethods(pr);
		
		Response response=http.PostRequest(jsonbody, "QA_URI");
		respIdValue=ParsingJasonUsingOrgJson.ParseJson(response.asString(),"id");
		System.out.println("Response of test case 2");
		System.out.println("Status code is"+ response.statusCode());
		System.out.println("response data is");
		System.out.println(response.asString());
		Responsevalidate.statuscodeValidate(response, 201);
		
	}

}
