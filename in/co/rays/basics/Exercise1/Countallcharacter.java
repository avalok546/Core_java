package in.co.rays.basics.Exercise1;


public class Countallcharacter {
	public static void main(String[] args) {
		 String input = "hello world";
	        
	       
	        int[] count = new int[256];

	       
	        for (int i = 0; i < input.length(); i++) {
	            count[input.charAt(i)]++;
	        }

	        for (int i = 0; i < count.length; i++) {
	            if (count[i] > 0) {
	                System.out.println("'" + (char) i + "': " + count[i]);
	            }
	        }
		
		
	}

}
