package in.co.rays.inheritance;

public class Rectangletest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setcolour("blue");
		r.setborderwidth(5);
		r.setlength(10);
		r.setwidth(20);
		
		System.out.println(r.getcolouur());
		System.out.println(r.getborderwidthr());
		System.out.println(r.getlength());
		System.out.println(r.getwidth());
		System.out.println(r.area());
		
	}

}
