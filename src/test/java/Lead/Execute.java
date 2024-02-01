package Lead;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execute {
  
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f = new File("C:\\Users\\Dinesh K\\eclipse-workspace\\Crm_Testing\\src\\test\\resources\\Sample.json");
		ObjectMapper om = new ObjectMapper();
		Root readValue = om.readValue(f, Root.class);
		System.out.println(readValue.getId());
	    System.out.println(readValue.getType());
	   System.out.println(readValue.getName());
	   System.out.println(readValue.getPpu());
	   for (Batter batter : readValue.getBatters().getBatter()) {
		   System.out.println(batter.getId() +" type" +  batter.getType());
	}
	   for (Toppings toppings : readValue.getTopping()) {
		   System.out.println(toppings.getId() + "Type" + toppings.getType());
		
	}
	}
}
