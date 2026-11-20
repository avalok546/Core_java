package in.co.rays.array;

import java.util.Scanner; // Imports only the Scanner class
import java.util.Arrays; // Imports only the Scanner class

public class inputjava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of a array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Element at index " + i + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.println("\nYour array contents: " + Arrays.toString(arr));

		sc.close();

	}

}
