package Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingJasonUsingOrgJson {
	public static String ParseJson(String responsedata,String Keyname)
	{
		JSONObject js=new JSONObject(responsedata);
		return js.getString(Keyname);
		
	}
	
	 public static void parsedata(String responsedata, String keyname)
		{

		JSONArray js= new JSONArray(responsedata);
		for (int i=0;i<js.length();i++)
		{
			JSONObject j=js.getJSONObject(i);
			System.out.println(j.get(keyname));
		}

}}
