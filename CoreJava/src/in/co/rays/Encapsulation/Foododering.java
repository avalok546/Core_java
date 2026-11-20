package in.co.rays.Encapsulation;

public class Foododering {
	private int orderId;
	private String coustmerName;
	private String fooditem;
	private int quentity;
	private double totalAmount;
	
	public void setorderID (int orderId) {
		this.orderId = orderId;
		
	}
	public int getorderId() {
		return orderId;
	}
	
	public void setcoustmerName(String coustmerName) {
		this.coustmerName = coustmerName;
	}
	public String getcoustmerName() {
		return coustmerName;
	}
	public void setfooditem (String fooditem) {
		this.fooditem = fooditem;
	}
	public String getfooditem() {
		return fooditem;
	}
	public void setquentity(int quentity) {
		this.quentity = quentity;
	}
	public int getquentity() {
		return quentity;
	}
	public void settotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
		
	}
	public double gettotalAmount() {
		return totalAmount;
	}}


