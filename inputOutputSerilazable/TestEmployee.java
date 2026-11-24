package inputOutputSerilazable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee e1 = new Employee(45500,3992);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://av//demo//Employee.txt"));
		out.writeObject(e1);
		System.out.println("done");
		System.out.println(e1);
		out.close();
		
		
		
	}

}
