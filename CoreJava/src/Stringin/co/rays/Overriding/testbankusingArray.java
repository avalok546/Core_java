package Stringin.co.rays.Overriding;

public class testbankusingArray {
	public static void main(String[] args) {
		Bank[] banks = new Bank[3];
		banks[0] = new Axis();
		banks[1] = new SBI();
		banks[2] = new ICICI();
		loanenquiry(banks);
		
		
		
	}

	private static void loanenquiry(Bank[] banks) {
		
		for (Bank b :banks) {
			String name = b.getBank();
			double rate = b.intrestRate();
System.out.println(name + "=="+ rate);			
		
		}
		
	}

}
