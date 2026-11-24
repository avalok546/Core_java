package in.co.rays.Exception;

public class exception {
    public static void main(String[] args) {

      try {
    	  int a = 10;
    	  int b = 0;
    	  int c = a/b;
    	  System.out.println(c);
    	  
      }
      catch(ArithmeticException e) {
    	  System.out.println(e.getMessage());
    	  
      }
      System.out.println("contineu remaining program");
    
    }}
