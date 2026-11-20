package in.co.rays.Encapsulation;

public class Railway {
	
	private int reservationId;
	private String passangareName;
	private int trainNumber;
	private int seatNumber;
	private double ticketPrice;
	
	public void setreservationId (int reservationId) {
		this.reservationId = reservationId;
		
	}
	public int getreservationId() {
		return reservationId;
	}
	public void  setpassangareName (String passangareName) {
		this.passangareName = passangareName;
		
	}
	public String getpassangareName() {
		return passangareName;
	}
	public void settrainNumber(int trainNumber) {
		this.trainNumber =trainNumber;
		
	}
	public int gettrainNumber() {
		return trainNumber;
	}
	public void setseatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getseatNumber() {
		return seatNumber;
	}
	public void setticketPrice(double ticketPrice) {
		this.ticketPrice =ticketPrice;
	}
	public double getticketPrice() {
		return ticketPrice;
	}

}
