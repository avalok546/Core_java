package in.co.rays.basics.Exercise1;

public class Primee {
	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}}

			if (count > 0) {
				System.out.println("num is not");
			} else {
				System.out.println(" prime");
			}
		

	}

}
