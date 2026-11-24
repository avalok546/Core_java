package in.co.rays.inheritance;

public class Traingle {
	private int base;
	private int height;
	
	public void setbase(int base) {
		this.base = base;
	}
	public int getbase() {
		return base;
	}
	public void setheight(int height) {
		this.height = height;
	}
	public int getheight() {
		return height;
	}
	public double area() {
		return base*height/0.5;
	}
	

}
