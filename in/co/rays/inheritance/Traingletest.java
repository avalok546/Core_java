package in.co.rays.inheritance;

public class Traingletest extends Shape {
	public static void main(String[] args) {
		
		Traingle t = new Traingle();
		t.setbase(10);
		t.setheight(20);
		System.out.println(t.getbase());
		System.out.println(t.getheight());
		
		Shape s = new Shape();
		s.setcolour("black");
		s.setborderwidth(5);
		System.out.println(s.getcolouur());
		System.out.println(s.getborderwidthr());
	
		
	}

}
