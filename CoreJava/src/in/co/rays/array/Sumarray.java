package in.co.rays.array;

public class Sumarray {
	public static void main(String[] args) {
		int[] arr = { 23, 22, 43, 35, 75, 23 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];	
		    avg = sum/2;
			
		}
	
		
		System.out.println("Sum of array is: " + sum);
		System.out.println("Sum of array is: " + avg);
		}

}
