package inputOutputSerilazable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestAccount  {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		account a1 = new account(4500, 1234);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://av//demo//dm.txt"));
		out.writeObject(a1);
		System.out.println("done");
		out.close();
		
		
		
	}

}
