package in.co.rays.basics.Exercise1;

public class Palimdromornot {
	public static void main ( String[] args) {
		int num = 415;
		int reverse = 0;
		while ( num!= 0 ) {
			int digit = num% 10;
			reverse = reverse*10+digit;
			num = num/10;
			
			
		}
		if ( num == reverse) {
			System.out.println("number is palimdrom ");
		}
		else {
			System.out.println("number is not palimdrom");
		}
		
	}

}
