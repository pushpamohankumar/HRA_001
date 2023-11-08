package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadthedatafromJsonTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		JSONParser j=new JSONParser();
		Object obj = j.parse(new FileReader(".\\src\\test\\resources\\commondata.json"));
		
		JSONObject map=(JSONObject) obj;
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
	
	}
	
	

}
