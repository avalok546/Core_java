package in.co.rays.basics;

public class amstrong2 {
public static void main (String[] args) {
	int num = 1634;
	int a= num % 10;
	int b =  ((num/10)%10);
	int c = ((num/100)%10);
	int d = (num/1000);
	int sum = a*a*a*a+b*b*b*b+c*c*c*c+d*d*d*d ;
	
	if (num == sum) {
		System.out.println("number is amtrong");
	}
	else {
		System.out.println("number is not");
	}
}
}
