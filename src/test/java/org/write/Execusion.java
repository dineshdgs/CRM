package org.write;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execusion {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f = new File("C:\\Users\\Dinesh K\\eclipse-workspace\\Crm_Testing\\src\\test\\resources//write.json");
		ObjectMapper om = new ObjectMapper();
		Root ro = new Root(0001, "donut", "Cake", 500);
		om.writeValue(f,ro);
		
	}

}
