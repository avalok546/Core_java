package in.co.rays.Encapsulation;

public class movieticket {
	private int ticketID;
	private String movieName;
	private String theaterName;
	private String seatNumber;
	private double ticketPrice;
	
	public void setticketID (int ticketID) {
		this.ticketID =ticketID;
	}
	public int getticketID() {
		return ticketID;
	}
	public void setmovieName (String movieName) {
		this.movieName =movieName;
	}
	public String getmovieName() {
		return movieName;
	}
	public void settheaterName (String theaterName) {
		this.theaterName =theaterName;
	}
	public String gettheaterName() {
		return theaterName;
	}
	public void setseatNumber (String seatNumber) {
		this.seatNumber =seatNumber;
	}
	public String getseatNumber() {
		return seatNumber;
	}
	public void setticketPrice (int ticketPrice) {
		this.ticketPrice =ticketPrice;
	}
	public double getticketPrice() {
		return ticketPrice;
	}

}
