package in.co.rays.Encapsulation;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Persontest {
	public static void main(String[] args) throws ParseException {
		Person ps = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		ps.setName("abhishek");
		ps.setAddress("indore");
		ps.setDob(sdf.parse("22-9-2002"));
		
		System.out.println(ps.getName());
		System.out.println(ps.getAddress());
		System.out.println(sdf.format(ps.getDob()));
		
		
	}
	
	

}
