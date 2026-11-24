package in.co.rays.Encapsulation;

public class vechicaltext {
	public static void main(String [] args) {
		vechical v1 = new vechical();
		v1.setrentalDays(21);
		v1.setrentalID(122);
		v1.setrentperDay(315);
		v1.setvechicalNumber("2821767");
		v1.setveichalName("pulser");
		
		System.out.println(v1.getrentalDays());
		System.out.println(v1.getrentalID());
		System.out.println(v1.getrentperDay());
		System.out.println(v1.getvechicalNumber());
		System.out.println(v1.getveichalName());
	}

}
