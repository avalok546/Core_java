package Stringin.co.rays.Overriding;



public class circle extends Shape {
    public double radius = 5;

    @Override
	
   public void area() {
        System.out.println("Area of Circle: "
                + (3.14 * radius * radius));
    }
    public String colour( String colour) {
    	return colour;
    }
}

	
	
	
	

		
	


