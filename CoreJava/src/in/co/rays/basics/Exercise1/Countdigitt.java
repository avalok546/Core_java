package in.co.rays.basics.Exercise1;

public class Countdigitt {
	public static void main(String[] args) {
		String text = "Hello 123 World 45";
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				count++;
			}
		}

		System.out.println("Total digits: " + count);

	}
}
