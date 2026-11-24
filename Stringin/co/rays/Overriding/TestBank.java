package Stringin.co.rays.Overriding;

public class TestBank extends Bank {

    public static void main(String[] args) {
    	Bank b = new Bank();
		System.out.println(b.getBank() + "==interest " + b.intrestRate());
		b = new SBI();
		System.out.println(b.getBank() + "==interest " + b.intrestRate());
		b = new ICICI();
		System.out.println(b.getBank() + "==interest" + b.intrestRate());
		b = new Axis();
		System.out.println(b.getBank() + "==interest " + b.intrestRate());
    	
	
}}