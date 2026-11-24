package Map;

import java.util.Enumeration;
import java.util.Vector;

public class Enumration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("ram");
		v.add("shyam");
		v.add("ghanshya");
		v.add("DHyan");
		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
				
		
	}

}
