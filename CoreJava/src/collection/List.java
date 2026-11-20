                           package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List {
	//list is an interface which is implemented by ArrayList, LinkedList, Stack, Vector

	public static void main(String[] args) {
		//Arraylist is a class which implements the List interface. It is a resizable array 
		//implementation of the List interface. It is part of the Java Collections Framework. 
		//It is present in java.util package.
		
//		• Dynamic Resizing: Grows automatically when full.
//		• Ordered: Maintains exact insertion sequence.
//		• Index-Based: Fast O(1) item retrieval.
//		• Duplicates: Allows identical elements.
//		• Nulls: Permits null values.
//		• Not Thread-Safe: Requires external synchronization.
//		• Objects Only: Uses wrapper classes (Integer, not int).
//		• Fast Appends: Adding to the end is O(1).
//		• Slow Shifts: Inserting/deleting in the middle is O(n).

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		System.out.println(list);
		//how to remove duplicates from the list
		list.remove("A");
		System.out.println(list);
		//howtoget the size of the list
		System.out.println(list.size());
		//how to get the element at a particular index
		System.out.println(list.get(2));
		// how to set the element at a particular index
		System.out.println(list.set(2, "Z"));
		// index of an element
		System.out.println(list.indexOf("Z"));
		
		//last index of an element
		System.out.println(list.lastIndexOf("Z"));
		System.out.println(list.lastIndexOf("E"));
	// ----------------------------LINKLIST-----------------------------
		
		//linklist is a  class which implements the list interface. 
		//it is a doubly linked list implementation of the list and deque interfaces.
		//it is part of the java collections framework. it is present in java.util package.
		
		//• Pointers: Nodes link forward and backward.
//		• No Resizing: Memory allocates per node.
//		• Slow Lookup: O(n) index search time.
//		• Fast Edits: O(1) pointer swaps.
//		• No Shifting: Edits don't move data.
//		• High Memory: Stores extra pointer data.
//		• Flexible: Works as Queue/Deque/List.
//		• Ordered: Retains insertion sequence.
//		• Permissive: Allows duplicates and nulls.
//		• Unsafe: Needs external thread synchronization.
//
//		
		LinkedList<String> l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("E");
		l.add("F");
		System.out.println(l);
		l.remove("A");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
		System.out.println(l.set(2, "Z"));
		System.out.println(l.indexOf("Z"));
		System.out.println(l.lastIndexOf("Z"));
		//------------------------STACK----------------------------------------
		//Stack is a class which implements the list interface. it is a last in first out (LIFO) data structure. it is part of the java collections framework. it is present in java.util package.
		//stack is a subclass of vector. it is a legacy class. it is synchronized. it is a thread safe class. it is a resizable array implementation of the list interface.
		//stck ias 
		Stack sc = new Stack();
		sc.push("A");
		sc.push("B");
		sc.push("C");
		sc.push("D");
		sc.push("E");
		System.out.println(sc);
		sc.pop();
		System.out.println(sc);
		System.out.println(sc.size());
		System.out.println(sc.peek());
		System.out.println(sc.search("C"));
		System.out.println(sc.remove("C"));
		System.out.println(sc);
		System.out.println(sc.add("y"));
		System.out.println(sc);
		//--------------------------VECTOR----------------------------------------
		//vector si a class which implements the list interface. it is a resizable array implementation of the list interface. it is part of the java collections framework. it is present in java.util package.
		
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		v.add("E");
		v.add("E");
		v.add("E");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.get(2));
		System.out.println(v.set(2, "Z"));
		System.out.println(v.indexOf("Z"));
		System.out.println(v.lastIndexOf("Z"));
		System.out.println(v.remove("Z"));
		System.out.println(v);
		
		
		
		
		
		
		
	}

}
