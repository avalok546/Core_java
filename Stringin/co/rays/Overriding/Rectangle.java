package Stringin.co.rays.Overriding;

public class Rectangle extends Shape {
	 int  lenght = 10;
	 int width = 20;
	
	@Override
	public void area() {
		System.out.println("area of a retangle is :-"+ (lenght*width));
	}

}
