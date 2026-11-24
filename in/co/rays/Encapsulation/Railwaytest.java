package in.co.rays.Encapsulation;

public class Railwaytest {
	public static void  main(String[] args) {
		Railway passanger = new Railway();
		
		passanger.setreservationId(12345);
		passanger.setpassangareName("abhishek");
		passanger.settrainNumber(876858);
		passanger.setseatNumber(65);
		passanger.setticketPrice(315);
		
		System.out.println("your reservation id--------"+ passanger.getreservationId());
		System.out.println("your passanger name--------"+ passanger.getpassangareName());
		System.out.println("your train number----------"+ passanger.gettrainNumber());
		System.out.println("your seat number-----------"+ passanger.getseatNumber());
		System.out.println("your ticket price-----------"+ passanger.getticketPrice());
	}
	
	

}
