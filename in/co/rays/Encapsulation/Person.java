package in.co.rays.Encapsulation;

import java.util.Date;

public class Person {
	private String name;
	private String Address;
	private Date Dob;
	
	
	
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress (String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return Address;
	}
	public void setDob (Date Dob) {
		this.Dob = Dob;
	}
	public Date getDob() {
		return Dob;
	}
	
}
