package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class collectionSet {
	
	//set is a collection that contains no duplicate elements. 
	//It models the mathematical set abstraction and is a member of the Java Collections Framework.
	
	//--------------------HashSet------------------------------------
	
	// hashset is a class which implements the set interface.
	// it is based on a hash table and provides constant-time
	// performance for basic operations (add, remove, contains).
	// It is part of the Java Collections Framework and is present in the java.util package.
	public static void main(String[] args) {
    Set h = new HashSet();
    h.add("A");
    h.add("B");
    h.add("C");
    h.add("D");
    h.add("E");
    h.add("E");
    System.out.println(h);
    System.out.println(h.size());
    System.out.println(h.contains("E"));
    System.out.println(h.remove("E"));
    System.out.println(h);
	//------------------TreeSet--------------------------------------
    
    //treeset is a class which implements the set interface.
    //it is a sorted set implementation based on a red-black tree.
    //it is part of the java collections framework and is present in the java.util package.
    //sorted set: maintains elements in ascending order.
    //sorted set: does not allow null elements.
    //sorted  set is not synchronized: requires external synchronization for thread safety.
      
    SortedSet set = new TreeSet();
    set.add("java");
    set.add("python");
    set.add("c++");
    set.add("go");
    set.add("React");
    set.add("c");
    System.out.println(set);
    System.out.println(set.size());
    System.out.println(set.contains("python"));
    System.out.println(set.remove("python"));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    

}
}