package in.co.rays.array;

public class Minmaxarray {
	public static void main(String[] args) {
		int[] arr = { 23, 42, 56, 54, 78, 324, 67 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
			if (arr[i] > max) {
				max = arr[i];

			}
			

		}
		System.out.println("Min value is: " + min);
		System.out.println("Max value is: " + max);

	}

}
