package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.json.HTTP;
import org.testing.responseValidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testng.annotations.Test;

import Utilities.Loadpropertiesfile;
import Utilities.ParsingJasonUsingOrgJson;
import Utilities.VariableReplacement;
import Utilities.loadjsonfile;
import io.restassured.response.Response;

public class TC7Dummy_1 {
	static String RespId;
	@Test
public void TC7() throws IOException 
	
 {
		Properties pr=Loadpropertiesfile.loadproperties("../APIFrameWork/URI.Properties");
		String jsonbody=loadjsonfile.jsondata("../APIFrameWork/src/test/java/org/testing/resources/payload1.json");
		System.out.println("enter name");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		jsonbody=VariableReplacement.replacevalue(jsonbody, "test", name);
		System.out.println("enter salary");
		String salary=scan.next();
		jsonbody=VariableReplacement.replacevalue(jsonbody, "salary", salary.toString());
		System.out.println("enter age");
		String age=scan.next();
		jsonbody=VariableReplacement.replacevalue(jsonbody, "age", age.toString());
		HTTPMethods https=new HTTPMethods(pr);
		Response RespId=https.PostRequest(jsonbody, "DUMMY_POST");
		//ParsingJasonUsingOrgJson.ParseJson(RespId.asString(), "salary");
		System.out.println("Response of test case 7");
		System.out.println("Status code is"+ RespId.statusCode());
		System.out.println("response data is");
		System.out.println(RespId.asString());
		Responsevalidate.statuscodeValidate(RespId, 200);
	
	}
}
