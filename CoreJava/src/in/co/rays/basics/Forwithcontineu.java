package in.co.rays.basics;

public class Forwithcontineu {
	public static void main (String[] args) {
		int [] numbers = {1,2,3,4,5,6,7};
		for(int n : numbers ) {
			if (n %2 >0) {
				continue;
			}
			System.out.println(n);
		}
	}

}
