package in.co.rays.Encapsulation;

public class Autoomobile {
	private String name;
	private String colour;
	private int speed;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setcolour(String colour) {
		this.colour = colour;
	}
	public String getcolour() {
		return colour;
	}
	public void setspeed(int speed) {
		this.speed = speed;
	}
	public int getspeede() {
		return speed;
	}
	
	public void setbreak() {
		System.out.println("break");
	}
	public int getbreak() {
		speed = speed*0;
		return speed;
	}

}
