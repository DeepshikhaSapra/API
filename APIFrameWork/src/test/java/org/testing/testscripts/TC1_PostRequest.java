package org.testing.testscripts;

import java.io.IOException;
import java.util.Properties;


import org.testing.teststeps.HTTPMethods;

import Utilities.Loadpropertiesfile;

import Utilities.loadjsonfile;

public class TC1_PostRequest {

	public static void main(String[] args) throws IOException {
		Properties pr=Loadpropertiesfile.loadproperties("../APIFrameWork/URI.Properties");
		String jsonbody=loadjsonfile.jsondata("../APIFrameWork/src/test/java/org/testing/resources/requestpayload.json");
		
		HTTPMethods http=new HTTPMethods(pr);
		
		http.PostRequest(jsonbody, "QA_URI");
	}
}
