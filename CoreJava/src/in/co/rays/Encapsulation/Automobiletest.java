package in.co.rays.Encapsulation;

public class Automobiletest {
	public static void main(String[] args) {
		
		Autoomobile at = new Autoomobile();
		at.setName("bmw");
		at.setcolour("black");
		at.setspeed(150);
		System.out.println(at.getName());
		System.out.println(at.getspeede());
		System.out.println(at.getcolour());
		System.out.println(" you push the break now your speed is  "+at.getbreak());
		
		
	}

}
