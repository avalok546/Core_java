package in.co.rays.array;

public class Secondlargest {
	public static void main(String[] args) {
		int num[] = { 10, 200, 5, 40, 30 };
		int max = num[0];
		int secondmax = num[0];
		
		
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				
				secondmax = max;
				   max = num[i];

			} else if (num[i] > secondmax && num[i] != max) {
				secondmax = num[i];
			}

		}
		System.out.println("Second Max value is: " + secondmax);

	}

}
