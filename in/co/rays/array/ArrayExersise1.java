package in.co.rays.array;

public class ArrayExersise1 {
	public static void main(String[] args) {
		int num[] = { 10, 200, 5, 40, 30 };
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
		
			}
			
			
		}
		System.out.println("Max value is: " + max);		
		
	
	}

}
