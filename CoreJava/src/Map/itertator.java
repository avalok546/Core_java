package Map;

import java.util.ArrayList;
//fail-fast 
//using for access all the element 
//for all collection
import java.util.Iterator;

public class itertator {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList();
		li.add("alok");
		li.add("aryan");
		li.add("shub");
		li.add("ram");
		li.add("shiv");
		System.out.print(li);
		Iterator<String> it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		   it.remove();           
		   
				
			
		}
		System.out.println(li);
	}
	

}
