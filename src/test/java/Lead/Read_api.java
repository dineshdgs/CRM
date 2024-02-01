package Lead;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read_api {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader("C:\\Users\\Dinesh K\\eclipse-workspace\\Crm_Testing\\src\\test\\resources\\Sample.json");
		JSONParser jsonparse = new JSONParser();
		Object parse = jsonparse.parse(f);
		//Type casting
		JSONObject jsonobject = (JSONObject)parse;
		System.out.println(jsonobject.get("id"));
		System.out.println(jsonobject.get("name"));
		System.out.println(jsonobject.get("ppu"));
		System.out.println(jsonobject.get("type"));
		
		// Indirect pair
		Object object = jsonobject.get("batters");
		//Type casting
		JSONObject jo = (JSONObject)object;
		Object object2 = jo.get("batter");
		//type cast
		JSONArray ja = (JSONArray)object2;
		for (int i = 0; i < ja.size(); i++) {
			System.out.println(ja.get(i));
		}
		System.out.println("====================================================");
		Object object3 = jsonobject.get("topping");
		//Type casting
		JSONArray ja1 = (JSONArray)object3;
		for (int i = 0; i < ja1.size(); i++) {
			System.out.println(ja1.get(i));
		}
		System.out.println("============================================================");
	}

}
