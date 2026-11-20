package in.co.rays.inheritance;

public class Circle {
	
	private int radius;
	
	public void setradius(int radius) {
		this.radius = radius;
	}
	public int getradius() {
		return radius;
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}

}
