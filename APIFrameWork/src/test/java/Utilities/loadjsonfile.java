package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class loadjsonfile {
public static String jsondata(String filepath) throws FileNotFoundException
{
	File f=new File(filepath);
	FileReader fr=new FileReader(f);
	JSONTokener jt=new JSONTokener(fr);
	JSONObject jo=new JSONObject(jt);
	return jo.toString();
}
}
