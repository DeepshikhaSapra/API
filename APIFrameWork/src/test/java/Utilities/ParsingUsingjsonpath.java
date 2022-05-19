package Utilities;

import io.restassured.response.Response;

public class ParsingUsingjsonpath {
	public static String parsejsonpath(Response res, String jsonPath)
	{
		return res.jsonPath().get(jsonPath);
		
	}

}
