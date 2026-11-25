package thread;

public class HelloRunableTest {
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread("ram");
		HelloThread t2 = new HelloThread("shyam");
		
		Thread r1 = new Thread(t1);
		Thread r2 = new Thread(t2);
		
		r1.start();
		r2.start();
	}

}
