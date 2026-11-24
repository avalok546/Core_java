package inputOutputSerilazable;

import java.io.Serializable;

public class account implements Serializable {

	private int balance;
	private int pin;
	
	public account() {
		
	}


	public account(int balance, int pin) {
		
		this.balance = balance;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "balance"+balance + "pin" +pin;
	}

}
