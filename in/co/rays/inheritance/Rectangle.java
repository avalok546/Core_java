package in.co.rays.inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public void setlength(int length) {
		this.length = length;
	}
	public int getlength() {
		return length;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public int getwidth() {
		return width;
	}
	
	public int area() {
		return length*width;
	}

}
