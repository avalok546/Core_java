package inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imagecopy {
	//input strean 
	//output stream
	public static void main(String[] args) throws IOException {
		String source = "D:\\New folder\\demo\\bat.jpg";
		String traget = "D:\\New folder\\demo\\batcopy.jpg";
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(traget));
		
		int i = in.read();
		while (i !=-1) {
			//System.out.println(i);
			out.write(i);
			i = in.read();
		}
		
		in.close();
		out.close();
		
		
	}

}
