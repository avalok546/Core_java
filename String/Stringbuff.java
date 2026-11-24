package String;

public class Stringbuff {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("vijay");
		sb.append("Dinanath chouhan");
		System.out.println("capacity of string:----" + sb.capacity());
		System.out.println("length of string:----" + sb.length());
		System.out.println("caracter  of string:----" + sb.charAt(2));
		System.out.println("index of string:----" + sb.indexOf("din"));
		System.out.println("capacity of string:----" + sb.capacity());
		System.out.println("Reverse of string:----" + sb.reverse());
		
		
	}
	

}
