package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testsalary {
	public static void main(String[] args) {
		ArrayList<Integer> s= new ArrayList<Integer>();
		
		s.add(56678);
		s.add(87656);
		s.add(75789);
		s.add(28640);
		s.add(20953);
		
		s.stream().distinct().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
		s.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(3).forEach(System.out::println);
		
	}

}
