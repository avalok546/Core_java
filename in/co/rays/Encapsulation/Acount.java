package in.co.rays.Encapsulation;



public class Acount {
	private String Accountnumber;
	private String Accounttype;
	private double balance;
	
	
	public void setAccountnumber(String Accountnumber) {
		this.Accountnumber = Accountnumber;
	}
	public String getAccountnumber() {
		return Accountnumber;
	}
	public void setAccounttype(String Accounttype) {
		this.Accounttype = Accountnumber;
	}
	public String getAccounttype() {
		return Accounttype;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public double getbalance() {
		return balance;
	}
	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}
	public double setwithdraw(double amount) {
		balance = balance - amount;
		return balance;
	}
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	public double setdeposit(double amount) {
		balance = balance + amount;
		return balance;
	}

}
