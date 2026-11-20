package inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("D://New folder//demo//av.txt");  //add true for adding addition text
		w.write("hello av");
		
		System.out.println("text witeen sucecs");
		w.close();
		
	}

}
