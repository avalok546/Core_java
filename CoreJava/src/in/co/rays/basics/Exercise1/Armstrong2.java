package in.co.rays.basics.Exercise1;

public class Armstrong2 {
	public static void main (String[] args) {
		int i = 153;
		
		int x= 0;
		int r= 0;
		
		while(i>0) {
			r = i%10 ;
			x = (x+(r*r*r));
			i = i/10;
			
		
			
			
		}
	
		
		System.out.println(x);
	}
	

}
