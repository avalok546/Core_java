package Stringin.co.rays.Overriding;

public class testShape {
	
	public static void main(String[] args) {
//		Shape s = new Shape();
//		s.area();
//	
//		
//		Traingle t = new Traingle();
//		t.area();
//		
//		
//		Rectangle r = new Rectangle();
//		r.lenght=10;
//		r.width=20;
//		r.area();
//		
//		circle c = new circle();
//		c.area();
//		System.out.println("colour of circle is:--"+c.colour("red"));
//		----------------------------------------------------------------------------------------------------------------
		
//	                      	polymorphism using array of object
//		                    -----------------------------------
		   Shape[] s = {
		            new circle(),
		            new Traingle(),
		            new Rectangle()
		            
		            
		        };

		        for (int i = 0; i < s.length; i++) {
		            s[i].area();
		        }
	}

}
