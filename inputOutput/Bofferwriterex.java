package inputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bofferwriterex {
	public static void main(String[] args) throws IOException {
		BufferedWriter bf = new BufferedWriter(new FileWriter("D://New folder//demo//av.txt",true));
		bf.write("djhjdvoigsjs ");
		System.out.println("file witten successs");
		bf.close();
	}
}