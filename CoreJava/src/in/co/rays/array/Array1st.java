package in.co.rays.array;

public class Array1st {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		// Method 2: Initialize using an Array Literal (size is inferred)
		int[] primeNumbers = {2, 3, 5, 7, 11};
		String[] cars = {"Volvo", "BMW", "Ford"};
	System.out.println("Array of prime numbers:"+cars[0]);
	System.out.println("Array of a:"+a[0]);
	System.out.println("Array of a:"+a[1]);
	System.out.println("Array of a:"+primeNumbers[2]);
	cars[0] = "Opel"; // Change an element
	System.out.println("Array of a:"+cars[0]);

	}

}
