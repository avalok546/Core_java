package comparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {
	    ArrayList<MarksheetSort> list = new ArrayList<>();

        // Creating objects using constructor
        list.add(new MarksheetSort(103, "Rahul", 80, 75, 90));
        list.add(new MarksheetSort(101, "Amit", 85, 80, 70));
        list.add(new MarksheetSort(105, "Ravi", 70, 65, 80));
        list.add(new MarksheetSort(102, "Alok", 90, 85, 95));
        list.add(new MarksheetSort(104, "Vijay", 75, 70, 85));
        
        Iterator<MarksheetSort> it = list.iterator();
        while (it.hasNext()) {
			System.out.println(it.next());
			
		}
        
        Collections.sort(list);
        
        list.forEach(System.out::println);

}

}
