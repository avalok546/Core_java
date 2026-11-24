package inputOutput;

import java.io.FileReader;
import java.io.IOException;

public class filereaderex {
	public static void main(String[] args) throws IOException  {
		FileReader file = new FileReader("D://New folder//demo//av.txt");
		int i = file.read();	
		while(i != -1) {
			System.out.println((char) i + " = " + i);
			i = file.read();
			
		}
		file.close();
		
		
	}

}
