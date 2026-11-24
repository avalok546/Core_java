package Stringin.co.rays.Overriding;

public class Traingle extends Shape {
	
	double base = 10;
	double height = 12;
	
	@Override
	public void area() {
		System.out.println("area of a traingle is:--"+ (0.5*base*height));
	}

}
