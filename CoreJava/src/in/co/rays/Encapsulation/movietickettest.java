package in.co.rays.Encapsulation;

public class movietickettest {
	public static void main(String[] args) {
		movieticket m = new movieticket();
		m.setmovieName("dangal");
		m.settheaterName("cinesqure");
		m.setticketID(12345);
		m.setticketPrice(315);
		m.setseatNumber("212");
		
		
		
		System.out.println(m.getmovieName());
		System.out.println(m.gettheaterName());
		System.out.println(m.getticketID());
		System.out.println(m.getticketPrice());
		System.out.println(m.getseatNumber());
	}

}
