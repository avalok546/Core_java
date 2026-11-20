package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMAp {
	public static void main(String[] args) {
		SortedMap<String, String> m = new TreeMap<String, String>();
		m.put("name", "Alok");
		m.put("lastname", "sharma");
		m.put("age", "23");
		m.put("city", "bhopal");
		System.out.println(m);
		System.out.println(m.remove("age"));
		System.out.println(m);	
		
		
	}

}
