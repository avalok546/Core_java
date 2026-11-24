package in.co.rays.basics.Exercise1;

public class Countdigit {
	public static void main ( String [] args) {
		int num = 12345;
		int count = 0;
		int temp = num;
		
		while ( temp !=0) {
			temp = temp/10;
			count ++;
			
		}
		System.out.println( "the count is"  +count);
		
	}

}
