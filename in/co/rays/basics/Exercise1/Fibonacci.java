package in.co.rays.basics.Exercise1;

public class Fibonacci {
public static void main(String [] args) {
  	int a = 7;  
	int frist = 0;
	int second = 1; 
	for ( int i = 1; i <= a ; i++) {
		int next = frist+ second;
		System.out.println( next);
		
		frist = second;
		second = next;
	}
	
	

	}
	
}
