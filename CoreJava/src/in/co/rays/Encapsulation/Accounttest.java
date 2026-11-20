package in.co.rays.Encapsulation;

public class Accounttest {
	public static void main(String[] args) {
		Acount ac = new Acount();
		ac.setAccountnumber("42710100018879");
		ac.setAccounttype("Saviings");
		ac.setbalance(10000.00);
		ac.setdeposit(10000.00);
		ac.setwithdraw(5000.00);
		
		
		System.out.println(ac.getAccountnumber());
		System.out.println(ac.getAccounttype());
		System.out.println(ac.getbalance());
		System.out.println(ac.setdeposit(10000.00));
		
		System.out.println(ac.setwithdraw(5000.00));
		
		
	}

}
