package in.co.rays.Encapsulation;

public class Foododeringtest {
	public static void main (String [] args) {
		Foododering food = new Foododering();
		food.setorderID(1432);
		food.setcoustmerName("Abhishek");
		food.setfooditem(" dal bafle");
		food.settotalAmount(15000);
		
		
		System.out.println(food.getorderId());
		System.out.println(food.getcoustmerName());
		System.out.println(food.getfooditem());
		System.out.println(food.gettotalAmount());
		
	
		
	}

}
