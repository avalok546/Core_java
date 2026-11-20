package in.co.rays.inheritance;

public class Circletest extends Shape {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setradius(10);
		System.out.println(c.getradius());
		System.out.println(c.area());
		
		Shape s = new Shape();
		s.setcolour("blue");
		s.setborderwidth(5);
		System.out.println(s.getcolouur());
		System.out.println(s.getborderwidthr());
		
	}

}
