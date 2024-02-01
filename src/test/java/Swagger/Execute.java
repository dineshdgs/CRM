package Swagger;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execute {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f = new File("C:\\Users\\Dinesh K\\eclipse-workspace\\Crm_Testing\\src\\test\\resources\\Swagger.json");
		ObjectMapper om = new ObjectMapper();
		Root readValue = om.readValue(f, Root.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getCategory().getId());
		System.out.println(readValue.getCategory().getName());
		System.out.println(readValue.getName());
		System.out.println(readValue.getPhotoUrls());
		System.out.println(readValue.getTags().get(0).getId());
		System.out.println(readValue.getStatus());
	}
}
