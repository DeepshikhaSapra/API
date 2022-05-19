package org.testing.responseValidation;

import Utilities.ParsingUsingjsonpath;
import io.restassured.response.Response;

public class Responsevalidate {
	
public static void dataValidate(Response res, String expecteddata, String jsonPathh)
	
	{
		String actualdata=ParsingUsingjsonpath.parsejsonpath(res, jsonPathh);
		if (expecteddata.equals(actualdata))
		{
			System.out.println("Data is matching");
		}
		else
		{
			System.out.println("Data is not matching");
		}
	}
	
	public static void statuscodeValidate(Response res, int expectedstatuscode)
	
	{
		int actualstatuscode=res.statusCode();
		if (actualstatuscode==expectedstatuscode)
		{
			System.out.println("Status code is matching");
		}
		else
		{
			System.out.println("Status code is not matching");
		}
	}

}
