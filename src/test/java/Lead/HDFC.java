package Lead;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Base_class.Pojo;

public class HDFC {
	public static void main(String[] args) {
		Pojo h = new Pojo();
		h.setUser("Dinesh@gmail.com");
		h.setPass("Dinesh@005");


		Pojo h1 = new Pojo();
		h1.setUser("Vasanth@gmail.com");
		h1.setPass("Vasanth@005");


		Pojo h2 = new Pojo();
		h2.setUser("Sachin@gmail.com");
		h2.setPass("Sachin@005");


		Pojo h3 = new Pojo();
		h3.setUser("abc@gmail.com");
		h3.setPass("adb@005");

		List<Pojo> li = new ArrayList<>();
		li.add(h);
		li.add(h1);
		li.add(h2);
		li.add(h3);
		System.out.println("=============User defined List===========");
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i).getUser());
			System.out.println(li.get(i).getBalance());
		}
		
		Set<Pojo> si = new LinkedHashSet<>();
		si.add(h);
		si.add(h1);
		si.add(h2);
		si.add(h3);
		System.out.println("==========User Defined set==========");
		
		for (Pojo m : si) {
			System.out.println(m.getUser());
			System.out.println(m.getBalance());
		}
		System.out.println("===========User defined map============");
     Map<Integer, Pojo> mi = new LinkedHashMap<>();
     mi.put(10, h);
     mi.put(20, h1);
     mi.put(30, h2);
     mi.put(40, h3);
     
     Set<Entry<Integer,Pojo>> entrySet = mi.entrySet();
     for (Entry<Integer, Pojo> entry : entrySet) {
			  System.out.println(entry.getValue().getUser());
			  System.out.println(entry.getValue().getBalance());
	}
	}
}
 