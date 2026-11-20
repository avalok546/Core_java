package in.co.rays.basics.Exercise1;
import java.util.Scanner;

public class Countchar {
	public static void main (String[] args) {
//		String name = "alokvishwnath";
//		int count = 0;
//		char target = 'a';
//		for ( int i =0; i<name.length();i++) {
//			if (name.charAt(i)==target) {
//				count ++;
//			}
//			
//			
//		}
//		System.out.println(count);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thge string");
		
		String name = sc.nextLine();
		System.out.println("enter thge target");
		char targetChar = sc.next().charAt(0);
		int count =0;
		for (int i =0; i <name.length(); i++) {
			if (name.charAt(i) ==targetChar ){
				count++;
				
			}
			
			
		}
		System.out.println("the target appere "+count+ "time");
		
		
		
	}

}
