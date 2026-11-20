package inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("D://New folder//demo//av.txt"));
		String line = bf.readLine();
		
		
		while (line != null) {
			System.out.println(line);
			line = bf.readLine();
			
		}
		
	}

}
