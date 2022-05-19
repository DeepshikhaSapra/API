package Utilities;

import java.util.regex.Pattern;

public class VariableReplacement {
	public static String replacevalue(String body, String VariableName, String name)
	{
		body=body.replaceAll(Pattern.quote("{{"+ VariableName +"}}"), name);
		return body;
	}
	
}
