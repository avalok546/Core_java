package in.co.rays.basics.Exercise1;

public class Sumofint {
	public static void main (String[] args) {
		int sum = 0;
		for (int i = 10; i<=20;i++) {
			if (i%7==0) {
				sum +=i;
				System.out.println(sum);	
			}
		
		}
	}
}
