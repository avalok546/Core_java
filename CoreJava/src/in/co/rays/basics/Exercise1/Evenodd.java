package in.co.rays.basics.Exercise1;

public class Evenodd {
public static void main (String[] args ) {
	int num = 114;
	while (num !=0) {
		if ( num %2 ==0 ) {
			System.out.println(" num is even");
			num = num/2;
			
			
		}
		else {
			System.out.println(" num is odd");
			num = num-1;
			
		}
	System.out.println(num);
	}
	
}
}
