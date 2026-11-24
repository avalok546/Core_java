
package StreamApi;

import java.util.ArrayList;

public class TestPrimeNumber {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		// Add 1 to 25 numbers
		for (int i = 1; i <= 25; i++) {
			list.add(i);
		}

		// Find prime numbers using Stream API
		list.stream().filter(num -> { if (num < 2) {
				return false;
			}

			for (int i = 2; i <= Math.sqrt(num); i++) {

				if (num % i == 0) {
					return false;
				}
			}

			return true;
		}).forEach(System.out::println);
	}
}
