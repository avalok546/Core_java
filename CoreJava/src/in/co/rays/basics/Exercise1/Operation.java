package in.co.rays.basics.Exercise1;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter first number");
		int a = sc.nextInt();
		System.out.println(" Enter socond number");
		int b = sc.nextInt();
		System.out.println(" Enter operation like +,-,*,/");
		String opr = sc.next();
		
		switch(opr) {
		case "+":
			System.out.println( a+b);
			break;
		case "-":
			System.out.println( a-b);
			break;
		case "*":
			System.out.println( a*b);
			break;
		case "/":
			System.out.println( a/b);
			break;
		}

	}

}
