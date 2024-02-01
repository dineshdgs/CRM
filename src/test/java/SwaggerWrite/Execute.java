package SwaggerWrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execute {
  
	 public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f = new File("C:\\Users\\Dinesh K\\eclipse-workspace\\Crm_Testing\\src\\test\\resources//swaggerWrite.json");
		ObjectMapper om = new ObjectMapper();
		Category c = new Category("50", "Dinesh");
		ArrayList<String> al = new ArrayList<>();
		al.add("Nithish");
		ArrayList<Tags> at = new ArrayList<>();
	    at.add(new Tags("100", "Rocky"));
		Root r = new Root("10", c, "doggie", al,at , "available");
		om.writeValue(f, r);
	}
}
