package in.co.rays.Exception;

public class testAcount {
	
	public static void main(String[] args) {
		Account a = new Account();
		
	try {
		a.setbalance(1000);
		System.out.println("balance is " + a.getbalance());
		a.setwithdraw(2000);
		if (a.getbalance() < a.getwithdraw()) {
			System.out.println("you can not withdraw " );
			throw new CoustemException();
			
		}
		else {
			System.out.println("withdraw is " + a.getwithdraw());
			
			
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
		// TODO: handle exception
	}
	System.out.println("balance is " + (a.getbalance()));
	
	
	}
		
	
	
	
		
	}
	
	
	




